package week2.day4;

public class BrowserS {
	String Bname="Chrome";
	float Bversion=2.0f;
	public void openUrl() {
		
		System.out.println("URL Opened ");
	}
	public void closeBrowser() {
		System.out.println("Browser Closed");
	}
	
	
	public void navigateBack() {
		System.out.println("Navigated back");
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BrowserS Sobj=new BrowserS();
		System.out.println("Browser Name---->"+Sobj.Bname);
		System.out.println("Browser Version---->" +Sobj.Bversion);

	}

}
