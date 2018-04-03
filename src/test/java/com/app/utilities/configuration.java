package com.app.utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configuration {
	
	static Properties properties;
	static{
		String filePath="./src/test/resources/testData/propertyFile";
	

	try {
	FileInputStream input = new FileInputStream(filePath);
	properties = new Properties();
	properties.load(input);
	input.close();
	}catch(IOException e){
		System.out.println("Not Found");
	}
	}
	
	public static String getPropertyValue(String key) {
		return properties.getProperty(key);
	}
}
