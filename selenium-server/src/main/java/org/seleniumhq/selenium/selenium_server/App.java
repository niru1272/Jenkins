package org.seleniumhq.selenium.selenium_server;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	WebDriver driver = new ChromeDriver();
    	driver.get("https://practo.com");
    	Thread.sleep(5000);
    	driver.quit();
    	
    }
}
