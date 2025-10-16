package week1.day2;

public class EdgeBrowser {
	
	public static void main(String[] args) {
		
		Browser b2 = new Browser();
		b2.launchBrowser("Chrome browser");
		String url = b2.loadUrl();
		System.out.println(url);
	}

}
