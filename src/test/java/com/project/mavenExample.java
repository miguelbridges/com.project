package com.project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.testng.annotations.Test;

public class mavenExample {

/*	
	public void mavenTest() {
		System.setProperty("webdriver.chrome.driver", "/usr/local/java/Driver/chromeDriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
	}*/
	@Test
	public void mavenTest1() {
		System.setProperty("phantomjs.binary.path", "/Users/Miguel/Downloads/phantomjs-2.1.1-macosx/bin/phantomjs");
		WebDriver driver = new PhantomJSDriver();
		driver.get("https://www.google.com");
		
		driver.findElement(By.xpath("//a[contains(.,'Gmail')]")).click();
		
		String title = driver.getCurrentUrl();
		System.out.println(title);
		System.out.println(title);
		System.out.println(title);
		System.out.println(title);
		
	}
	
}
