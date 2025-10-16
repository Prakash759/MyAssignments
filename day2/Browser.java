package week1.day2;

public class Browser {

	
	public void launchBrowser(String browserName) {

		System.out.println(browserName);
	}
	
	public String loadUrl() {

		return "Url loaded successfully";
	}
	
	public static void main(String[] args) {

		Browser b1 = new Browser();
		b1.launchBrowser("Chrome browser");
		String url = b1.loadUrl();
		System.out.println(url);
	}

}
