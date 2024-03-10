package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Delete {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		ChromeDriver driver = new ChromeDriver();
		
		//To load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//To maximize the window
		driver.manage().window().maximize();
		
		
		//sending username
				driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoSalesManager");
				driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
				driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
				
				driver.findElement(By.xpath("//div[@for='crmsfa']")).click();
				driver.findElement(By.linkText("Leads")).click();
				driver.findElement(By.linkText("Find Leads")).click();
				driver.findElement(By.linkText("Phone")).click();
				driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123");
				driver.findElement(By.xpath("//*[@id=\"ext-gen334\"]")).click();
				//driver.findElement(By.xpath("//div[@id=\"ext-gen899\"]")).click();
				Thread.sleep(2000);

				WebElement id = driver
						.findElement(By.xpath("(//div[contains(@class,'x-grid3-cell-inner x-grid3-col-partyId')]/a)[1]"));
				String leadId = id.getText();
				System.out.println("Lead ID : " + leadId);
				id.click();
				
				driver.findElement(By.className("subMenuButtonDangerous")).click();
				driver.findElement(By.linkText("Find Leads")).click();
				WebElement lid = driver.findElement(By.xpath("//div[@class='x-form-element']/input[@name='id']"));
				lid.sendKeys(leadId);
				driver.findElement(By.xpath("//*[@id=\"ext-gen334\"]")).click();
				Thread.sleep(3000);

				WebElement msg= driver.findElement(By.xpath("//div[text()='No records to display']"));
				String msgbx=msg.getText();

				// Verifying deleted records 
				if (msgbx.contains("No records to display"))
					System.out.println("Succesfully Deleted ");
				else
					System.out.println("Not deleted properly ");

				driver.close();

	}

}
