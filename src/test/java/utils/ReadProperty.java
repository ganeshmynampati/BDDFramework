package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperty {

	public static Properties prop;
	public static FileInputStream fis;
	public static String path = System.getProperty("user.dir") + "/src/test/resources/Externalfiles/config.properties";

	public static void readprop(){
		try {
			fis = new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		prop = new Properties();
		try {
			prop.load(fis);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String getProp(String property){
		readprop();
		return prop.getProperty(property);
	}

}
