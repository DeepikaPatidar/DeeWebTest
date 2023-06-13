package com.manager;

import com.dataprovider.ConfigFileReader;
import com.dataprovider.JsonFileReader;

public class FileReaderManager {
	
	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static JsonFileReader jsonFileReader ;
	private static ConfigFileReader configFileReader;

	private FileReaderManager() {
		
	}
	
	public static FileReaderManager getInstance() {
		return fileReaderManager;
	}

	public JsonFileReader getJsonReader() {
		return (jsonFileReader == null) ? new JsonFileReader() : jsonFileReader;
	}
	
	public ConfigFileReader getConfigReader() {
		return (configFileReader == null)? new ConfigFileReader() : configFileReader;
	}
}
