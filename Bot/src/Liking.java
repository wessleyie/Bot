import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Liking {

	public static void Like() throws InterruptedException{
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many post would you like to like?");
		int amount = key.nextInt();

		Browser.webdriver.get("https://www.instagram.com");
		Browser.webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		Browser.webdriver.findElement(By.cssSelector("body > div:nth-child(12) > div > div > div > div.mt3GC > button.aOOlW.HoLwm")).click();

		for (int x = 1; x <= amount; x++){
			Browser.webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

				WebElement likebutton = Browser.webdriver.findElement(By.cssSelector("span [aria-label='Like']"));
				String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                        + "var elementTop = arguments[0].getBoundingClientRect().top;"
                        + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

				((JavascriptExecutor) Browser.webdriver).executeScript(scrollElementIntoMiddle, likebutton);
				Browser.webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				likebutton.click();

			if (x >= amount){
				System.out.println("You have liked " + amount + " posts.");
				Browser.webdriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				Browser.webdriver.navigate().refresh();
			}
		}
		
		key.close();
	}
}
