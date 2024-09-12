package DDT;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FetchingDataFromProperties_File 
{

	public static void main(String[] args) throws IOException, InterruptedException
	{
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		//Normal Approach
		//driver.get("https://www.saucedemo.com/v1/");
		//driver.findElement(By.name("user-name")).sendKeys("standard_user");
		//driver.findElement(By.name("password")).sendKeys("secret_sauce");
		//driver.findElement(By.id("login-button")).click();
		
		
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData7.properties");
		Properties pro = new Properties();
		pro.load(fis);
		
		
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		        driver.get(URL);
				driver.findElement(By.name("user-name")).sendKeys(USERNAME);
				driver.findElement(By.name("password")).sendKeys(PASSWORD);
				//Thread.sleep(5000);
				driver.findElement(By.id("login-button")).click();

	}

}
