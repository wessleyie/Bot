import org.openqa.selenium.By;

public class Log {
	
	public static void Login() throws InterruptedException{
		String username = "sylrotten";
		String password = "lisasolarcar";
		
		Browser.Start();
		Browser.webdriver.get("https://www.instagram.com/accounts/login");
		Browser.webdriver.manage().window().maximize();
		Browser.webdriver.findElement(By.name("username")).sendKeys(username);
		Browser.webdriver.findElement(By.name("password")).sendKeys(password);
		Browser.webdriver.findElement(By.name("password")).submit();
		
		Thread.sleep(3000);
		
		Browser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/main/div/button")).click();
		
		Thread.sleep(3000);
		
		Browser.webdriver.switchTo().alert().dismiss();
		
		System.out.println("Log in successful.");
	}
	
	public static void Logout() throws InterruptedException{
		Browser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/nav/div[2]/div/div/div[3]/div/div[3]/a")).click();
		Thread.sleep(1000);
		Browser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/main/div/header/section/div[1]/div/button/span")).click();
		Thread.sleep(1000);
		Browser.webdriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[6]")).click();
		System.out.println("////////You have been logged out////////");
	}
}
