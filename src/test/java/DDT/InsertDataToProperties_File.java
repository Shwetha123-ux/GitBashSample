package DDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

 
public class InsertDataToProperties_File
{

	public static void main(String[] args) throws Throwable
	{
		FileInputStream fis = new FileInputStream("./src/test/resources/commonData7.properties");
		Properties pro = new Properties();
		pro.setProperty("url", "https://www.saucedemo.com/v1/");
		pro.setProperty("username", "standard_user");
		pro.setProperty("password", "secret_sauce");
		
		FileOutputStream fos = new FileOutputStream("./src/test/resources/commonData7.properties");
		pro.store(fos, "CommonData");
		
		
		

	}

}
