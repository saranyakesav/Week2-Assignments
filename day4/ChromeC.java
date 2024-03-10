package week2.day4;

public class ChromeC extends BrowserS {

	public void OpenIncognito() {
		System.out.println("Opening from cognito ");
	}
	
	public void CloseCognito() {
		System.out.println("Closing cognito window");
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeC Cobj=new ChromeC();
		Cobj.OpenIncognito();
		System.out.println(Cobj.Bname);
		
		Cobj.CloseCognito();
		

	}

}
