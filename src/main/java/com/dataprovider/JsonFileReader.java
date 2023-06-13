package com.dataprovider;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import com.dataProviderPojos.Employee;
import com.google.gson.Gson;
import com.manager.FileReaderManager;

public class JsonFileReader {
	String EmployeeFilePath = FileReaderManager.getInstance().getConfigReader().getTestDataResourcePath()+ "/employee.json";
	
	public List<Employee> getEmployeeData() {
		System.out.print("e file path "+ EmployeeFilePath);
		Gson gson = new Gson();
		BufferedReader bufferReader = null;
		try {
			bufferReader = new BufferedReader(new FileReader (EmployeeFilePath));
			Employee[] employee = gson.fromJson(bufferReader, Employee[].class);
			return Arrays.asList(employee);
		}catch(FileNotFoundException e) {
				e.printStackTrace();
				throw new RuntimeException("unable to find employee json file");
		}finally{
			if(bufferReader != null)
			try {
				bufferReader.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}

