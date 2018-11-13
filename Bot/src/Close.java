public class Close {
	
	public static void Exit() throws InterruptedException {
		System.out.println("Program closing in 5 seconds.");
		
		Thread.sleep(5000);
		
		Browser.webdriver.close();
		System.out.println("Program closed.");
		
		System.exit(1);
	}
}
