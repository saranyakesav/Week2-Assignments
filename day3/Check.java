
					package week2.day3;
					import org.openqa.selenium.By;
					//import org.openqa.selenium.WebDriver;
					import org.openqa.selenium.WebElement;
					import org.openqa.selenium.chrome.ChromeDriver;
					//import org.openqa.selenium.support.ui.Select;

					//import org.openqa.selenium.support.ui.Select;

public class Check {
	public static void main(String[] args) {
		//Launch the browser
				ChromeDriver driver = new ChromeDriver();
				
				//To load the url
				driver.get("https://leafground.com/checkbox.xhtml");
				
				//To maximize the window
				driver.manage().window().maximize();
				
				 driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt89\"]/div[2]")).click();
				 driver.findElement(By.xpath("//*[@id=\"j_idt87:j_idt91\"]/div[2]")).click();

				 driver.findElement(By.xpath("//*[@id=\"j_idt87:basic\"]/tbody/tr/td[2]/div/div[2]")).click();
				 //TriState checkbox
				 
				 WebElement triState=driver.findElement(By.xpath("//*[@id=\"j_idt87:ajaxTriState\"]/div[2]"));
				 triState.click();
				 triState.click();
				 boolean msg1=triState.isSelected();
 				 System.out.println("TriState : "+msg1);
				
 				 // Toggle Switch
 				 	WebElement tSwitch1=driver.findElement(By.xpath("//div[@class=\"ui-toggleswitch-slider\"]"));
 		
 					WebElement tSwitch=driver.findElement(By.xpath("//input[@id='j_idt87:j_idt100_input']"));
 					
 					boolean ts = tSwitch.isSelected();
 					System.out.println("Toggle Before : "+ts);
 					
 					tSwitch1.click();
 					
 					WebElement tSwitch2=driver.findElement(By.xpath("//input[@id='j_idt87:j_idt100_input']"));
 	 				boolean ts2 = tSwitch2.isSelected();
 	 				System.out.println("Toggle  After: "+ts2);
 					
 	 				
 	 				//Verifying Disabled
 	 				
 	 				WebElement verify=driver.findElement(By.xpath("//div[@id=\"j_idt87:j_idt102\"]"));
 	 				
 					boolean vf=verify.isDisplayed();
 					System.out.println("Verified--->"+vf);
 					
 					//Selecting Dropdownbox
 					
 					
 					WebElement dropdown = driver.findElement(By.xpath("//div[contains(@class,'ui-selectcheckboxmenu-trigger ui-state-default ui-corner-right')]"));
 	 				dropdown.click();
 					WebElement dropDownd = driver.findElement(By.xpath("(//label[text()='London'])[2]"));
 					dropDownd.click();

 					WebElement dropDowndd = driver.findElement(By.xpath("(//label[text()='Berlin'])[2]"));
 					
 					dropDowndd.click();
 				

				  
					
				 driver.close();
				 
				 

				
				
				
			
				
	}

	
		// TODO Auto-generated method stub
		
	

}
