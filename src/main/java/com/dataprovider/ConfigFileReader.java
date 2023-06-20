package com.dataprovider;

import java.io.BufferedReader;
import com.enums.DriverType;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	
private Properties properties;

private final String propsFilePath = "configs\\Configuration.properties";

public ConfigFileReader() {
	BufferedReader reader;
	try {
		properties = new Properties();
		reader = new BufferedReader (new FileReader(propsFilePath));
		try {
			properties.load(reader);
			reader.close();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}catch(FileNotFoundException e) {
		e.printStackTrace();
		throw new RuntimeException("properties file not found at location" + propsFilePath);
	}
}

public String getTestDataResourcePath() {
	String path = properties.getProperty("testDataResourcePath");
	if(path != null)
		return path;
	else
		throw new RuntimeException("test data resource path is not configured in properties file");
	}

public String getReportConfigPath() {
	String reportConfigpath = properties.getProperty("reportConfigPath");
	if(reportConfigpath!= null)
	return reportConfigpath;
	else
		throw new RuntimeException("extent report config file path not found");
	}

public DriverType getBrowserType() {
	String browserType = properties.getProperty("browserType");
	if(browserType == null || browserType.equalsIgnoreCase("firefox"))
		return DriverType.FIREFOX;
	else if(browserType == "chrome")
			return DriverType.CHROME;
	else if (browserType == "edge")
		return DriverType.EDGE;
	else
		throw new RuntimeException("browser type not configured in properties file");
}
}
