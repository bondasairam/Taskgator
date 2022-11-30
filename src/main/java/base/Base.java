package base;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {

	public static WebDriver sr;
	
	public static void launchApplication(){
			
			WebDriverManager.chromedriver().setup();
			
			sr =new ChromeDriver();
			
			sr.manage().window().maximize();
			
			sr.manage().deleteAllCookies();
			
			sr.get("https://products.ncryptedprojects.com/taskgator/");
			
			
			sr.findElement(By.xpath("/html/body/div[1]/div/header/div/nav/div/ul/li[1]/a/span")).click();
			
//			sr.findElement(By.xpath("//*[@id=\"frmRegi_login\"]/div[3]/p/label")).click();
			
		

	}
public static void closeApplication() {
		
		sr.close();

}
}