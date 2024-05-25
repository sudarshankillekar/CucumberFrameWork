package com.qa.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

	private Properties prop;
	
	/**
	 * this method is used to load the properties from the config.properties
	 * @return it return properties prop object
	 */
	
	public Properties init_prop() {
		
		prop = new Properties();
		
		FileInputStream Ip;
		try {
			Ip = new FileInputStream("./src/test/resource/config/config.properties");
			try {
				prop.load(Ip);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return prop;
		
	}
	
	
}
