package sendMail.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import core.BaseTest;


public class openPageTest extends BaseTest {
		
	@Test
	public void testMethod (){ 
				driver.get("https://mail.google.com");
				WebElement element = driver.findElement(By.xpath("//a[@id='gmail-sign-in']"));
				element.click();
				System.out.println("Page title is: " + driver.getTitle());
				driver.wait.();WaitUntilVisible(//h1[contains(.,'ќдин обл≥ковий запис. ”с≥ серв≥си Google.')]);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	
}
