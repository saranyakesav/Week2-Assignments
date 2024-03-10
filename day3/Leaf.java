package week2.day3;

import org.openqa.selenium.By;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;


public class Leaf {

	public static void main(String[] args){
		ChromeDriver driver = new ChromeDriver();//ctr+shift+o --->import organize
		
		//To load the url
		driver.get("http://leaftaps.com/opentaps/");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		//Locate the inputfield type 
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		System.out.println("Login Successfully");
		
            

		
driver.close();

	}

}
