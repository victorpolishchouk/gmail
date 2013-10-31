package sendMail.tests;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import core.BaseTest;

public class login {
	
	public class openPageTest extends BaseTest{
		
		@Test
		public void testMethod (){ 
					driver.get("https://accounts.google.com");
									
					
			                 driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("hairy.skier@gmail.com");   
			                 driver.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("crowley2i25x3jg");   
			                 driver.findElement(By.xpath("//input[@id='signIn']"));
			                 try {
								driver.wait(10000);
							} catch (InterruptedException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
								driver.findElement(By.xpath("//div[@gh='cm']")).click();
								
							}
		
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
}

