package TestSelenium;

import org.openqa.selenium.WebDriver;

public class DriverManager {
	
	private static ThreadLocal<WebDriver> driver = new ThreadLocal<WebDriver>();
	 
    public static WebDriver getDriver() {
        return driver.get();
        
    }
 
    public static void setWebDriver(WebDriver webdriver) {
    	driver.set(webdriver);
    }

}
