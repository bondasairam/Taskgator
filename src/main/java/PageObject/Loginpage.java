package PageObject;

import org.openqa.selenium.By;

import base.Base;

public class Loginpage extends Base{

	public static  By EmailInput =By.id("username");
		
	public static By PasswordInput =By.id("password");
	
	public static By rememberme =By.xpath("//*[@id=\"frmRegi_login\"]/div[3]/p/label");
	
	public static By submitInput = By.id("sbtLogin");
	
	public static By InvalidErrormessage =By.xpath("/html/body/div[1]/div/section/div[2]/div/label/ul/li");
	
	public static By profileInput =By.xpath("//header/div[1]/div[1]/nav[1]/div[1]/ul[1]/li[4]/div[1]/button[1]");
	
	public static By logoutInput =By.xpath("/html/body/div[1]/div/header/div/div[1]/nav/div/ul/li[4]/div/ul/li[11]");
	
	
	
	
	public static void EnterEmailId(String arg1) {

		sr.findElement(EmailInput).sendKeys(arg1);
	}
		public static void EnterPasswordID(String arg1) {

			sr.findElement(PasswordInput).sendKeys(arg1);
		}
		
		public static void remember() {

			sr.findElement(rememberme).click();
		}
		
		
		

		public static void clickSigninButton() {

			sr.findElement(submitInput).click();
		}
		

		public static String captureErrorMessage() {

			String s = "";

			s = sr.findElement(InvalidErrormessage).getText();

			return s;		

	}
		public static void profileButton() {

			sr.findElement(profileInput).click();
		}
		
		public static void logoutButton() {

			sr.findElement(logoutInput).click();
		}
		

}
