package utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.CapabilityType;

import org.openqa.selenium.remote.RemoteWebDriver;



public class TestBase{
	    
	public static WebDriver driver= null;
	public static Properties prop=null;
	public static FileInputStream fis = null;
	public static String CurrentDir =System.getProperty("user.dir");
	public static String path = "/BDDFramework.properties";
    public static String uname = null;
	public static String key = null;
	public static File file = null;
	public static String TESTDATA_SHEET_PATH="src/test/resources/Externalfiles/TestData.xlsx";
	public static XSSFWorkbook book=null;
	public static XSSFSheet sheet =null;
	public static String Testcaseid=null;
	public static String Testcasedescription=null;
	public TestBase() {
		try {
			
			prop= new Properties();
			fis = new FileInputStream(CurrentDir+path);
			prop.load(fis);
			}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}}
	public WebDriver selectBrowser(String server,String browser) throws MalformedURLException {
			
			if (server.equalsIgnoreCase(Server.LOCAL.name())) {
				
				if (browser.equalsIgnoreCase(Browsers.CHROME.name())) {
					System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/chromedriver_79.exe");
					driver = new ChromeDriver();
					driver.manage().window().maximize();
				} else if (browser.equalsIgnoreCase(Browsers.FIREFOX.name())) {
					System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "/src/test/resources/drivers/geckodriver.exe");
					driver = new FirefoxDriver();
				}
						
			}
			else if (server.equalsIgnoreCase(Server.SAUCE.name())) {				
				DesiredCapabilities capabilities = new DesiredCapabilities();				  
		    	capabilities.setCapability("browserName", browser);		    	
		        capabilities.setCapability("platform", "Windows 10");
		        capabilities.setCapability("version", "79.0");
		        capabilities.setCapability("build", "Equipt regression");
		        capabilities.setCapability("name", "3-cross-browser");
		         //this.driver = new RemoteWebDriver(new URL("http://avincent:715c984a-0993-497e-b308-64ac750a0180@ondemand.saucelabs.com:80/wd/hub"),capabilities);
		        this.driver = new RemoteWebDriver(new URL("http://avincent:715c984a-0993-497e-b308-64ac750a0180@ondemand.saucelabs.com:80/wd/hub"),capabilities);
		      				
			}
		return driver;
	}
	public static String getUserName(String username) throws IOException {
 		prop=new Properties();
 		fis=new FileInputStream(CurrentDir+path);
 		prop.load(fis);
 		uname = prop.getProperty(username);
 		return uname;
 	}

 	public static String getPwd(String password) throws IOException {
 		prop=new Properties();
 		fis=new FileInputStream(CurrentDir+path);
 		prop.load(fis);
 		key = prop.getProperty(password);
 		return key;
 	}
 	public String excelRead(String sheetname,String testcaseid, String header) throws IOException {
        String value = null;;
        try {
            FileInputStream fis = new FileInputStream(TESTDATA_SHEET_PATH);
            book = new XSSFWorkbook(fis);
            sheet = book.getSheet(sheetname);
            int lastRowNum = sheet.getLastRowNum();
            int lastCellNum = sheet.getRow(0).getLastCellNum();      
            for (int i = 0; i < lastRowNum; i++) {
                for (int j = 1; j < lastCellNum; j++) {      
                    Map<String, Map<String, String>> excelmap = new HashMap<String, Map<String, String>>();
                    LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
                    map.put(sheet.getRow(0).getCell(j).toString(), sheet.getRow(i + 1).getCell(j).toString());
                    excelmap.put(sheet.getRow(i + 1).getCell(0).toString(), map);
                    if (excelmap.containsKey(testcaseid)) {
                        Map<String, String> w = excelmap.get(testcaseid);
                        if (map.containsKey(header)) {
                            value = w.get(header).toString();
                        }}}}
        } catch (NullPointerException E) {
        }
        return value;
    }

 	
	}	
					
		
	


