package week2.day1;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;


public class FaceB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		
		//To load the url
		driver.get("http://facebook.com/");
		
		//To maximize the window
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("testleaf.2023@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder=\"Password\"]")).sendKeys("Tuna@123");
		driver.findElement(By.xpath("//button[@data-testid=\"royal_login_button\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"email_container\"]/div[2]/a")).click();
		System.out.println("\n\n Title of the page is---- >"+driver.getTitle());

		

		

	}

}
