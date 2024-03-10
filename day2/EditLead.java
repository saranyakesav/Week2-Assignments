package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		
		//sending username
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//div[@for='crmsfa']")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_companyName\"]")).sendKeys("TestLeaf");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_firstName\"]")).sendKeys("Saranya");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_lastName\"]")).sendKeys("k7");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_firstNameLocal\"]")).sendKeys("sas");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_departmentName\"]")).sendKeys("IT");
		
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_description\"]")).sendKeys("NOTHING");
		driver.findElement(By.xpath("//*[@id=\"createLeadForm_primaryEmail\"]")).sendKeys("sara@gmail.com");

		WebElement we = driver.findElement(By.xpath("//*[@id=\"createLeadForm_generalStateProvinceGeoId\"]"));
		Select Wee =new Select(we);
		Wee.selectByVisibleText("New York");

		
		driver.findElement(By.xpath("//input[@name=\"submitButton\"]")).click();
	
		//Editing
		driver.findElement(By.linkText("Edit")).click();

		
	
		

		//clearing the Description
		driver.findElement(By.xpath("//*[@id=\"updateLeadForm_description\"]")).clear();

		//giving text to impo.box
		driver.findElement(By.xpath("//*[@id=\"updateLeadForm_description\"]")).sendKeys("After UPDATING");
		driver.findElement(By.xpath("//input[@value=\"Update\"]")).click();
			System.out.println("\n\nTITLE---->  "+driver.getTitle());
		
		
		


		

		
		





		
		//driver.findElement(By.linkText("Leads")).click();
		
	}

}
