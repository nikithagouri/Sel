package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C://Selenium//chromedriver.exe");
       
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://www.facebook.com/");
       
        driver.findElement(By.id("email")).sendKeys("hello");
        
String Title = driver.getTitle();
        
        System.out.println(Title);
        
        driver.close();
        
        }
}

