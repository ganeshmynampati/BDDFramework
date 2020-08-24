package utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyUtil {

	public static String path = System.getProperty("user.dir") + "/src/test/resources/Externalfiles/config.properties";
	public static String readprop(String property) throws IOException {
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(path);
		prop.load(fis);
		return prop.getProperty(property);
	}
}

