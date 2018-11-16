import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;

public class Log {
	
	public static void Login() throws InterruptedException{
		//JavascriptExecutor jse = ((JavascriptExecutor) Browser.webdriver);
		String username = "sylrotten";
		String password = "lisasolarcar";
		
		Browser.Start();
		Browser.webdriver.get("https://www.instagram.com/accounts/login");
		Browser.webdriver.manage().window().maximize();
		Browser.webdriver.findElement(By.name("username")).sendKeys(username);
		Browser.webdriver.findElement(By.name("password")).sendKeys(password);
		Browser.webdriver.findElement(By.name("password")).submit();
		
		Browser.webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//Gets rid of annoying pop ups
		try {
			Browser.webdriver.findElement(By.cssSelector("#react-root > section > main > div > button")).click();
			Browser.webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e){
			System.out.println("Pop up not found.");
		}
		
		try {
			Browser.webdriver.findElement(By.cssSelector("body > div:nth-child(15) > div > div > div > div.mt3GC > button.aOOlW.HoLwm")).click();
			Browser.webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		} catch (Exception e){
			System.out.println("Pop up not found.");
		}
		
		//jse.executeScript("window.scrollBy(0,250)", "");
		//Browser.webdriver.findElement(By.cssSelector("#react-root > section > main > div > button")).click();
		System.out.println("Login was successful.");
	}
	
	public static void Logout() throws InterruptedException{
		Browser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/nav/div[2]/div/div/div[3]/div/div[3]/a")).click();
		Browser.webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Browser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/main/div/header/section/div[1]/div/button/span")).click();
		Browser.webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Browser.webdriver.findElement(By.xpath("/html/body/div[3]/div/div/div/div/button[6]")).click();
		System.out.println("Logout was successful.");
	}
}