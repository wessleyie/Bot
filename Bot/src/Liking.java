import java.util.Scanner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

public class Liking {

	public static void Like() throws InterruptedException{
		Scanner key = new Scanner(System.in);
		
		System.out.println("How many post would you like to like?");
		int amount = key.nextInt();

		Browser.webdriver.get("https://www.instagram.com");
		Thread.sleep(500);

		for (int x = 1; x <= amount; x++){
				Thread.sleep(500);

				WebElement likebutton = Browser.webdriver.findElement(By.cssSelector("span [aria-label='Like']"));
				String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                        + "var elementTop = arguments[0].getBoundingClientRect().top;"
                        + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

				((JavascriptExecutor) Browser.webdriver).executeScript(scrollElementIntoMiddle, likebutton);
				Thread.sleep(1500);
				likebutton.click();

			if (x >= amount){
				System.out.println("You have liked " + amount + " posts.");
				Thread.sleep(1500);
				Browser.webdriver.navigate().refresh();
			}
		}
		
		key.close();
	}
}
