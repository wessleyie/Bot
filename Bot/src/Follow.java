import java.util.Scanner;
import org.openqa.selenium.*;

public class Follow {
	
	public static void Amount() throws InterruptedException{
		Scanner key = new Scanner(System.in);

		System.out.println("Enter the amount of accounts you want to follow: ");
		int amount = key.nextInt();
		
		Browser.webdriver.get("https://www.instagram.com/explore/people/suggested/");
		Thread.sleep(500);
		
		for (int x = 1; x <= amount; x++){
				Thread.sleep(500);
				WebElement button = Browser.webdriver.findElement(By.xpath("//*[@id='react-root']/section/main/div/ul/div/li[" + x + "]/div/div[1]/div[2]/button"));
				String scrollElementIntoMiddle = "var viewPortHeight = Math.max(document.documentElement.clientHeight, window.innerHeight || 0);"
                        + "var elementTop = arguments[0].getBoundingClientRect().top;"
                        + "window.scrollBy(0, elementTop-(viewPortHeight/2));";

				((JavascriptExecutor) Browser.webdriver).executeScript(scrollElementIntoMiddle, button);
				button.click();

			if (x >= amount){
				System.out.println("You have followed " + amount + " accounts.");
				Thread.sleep(1500);
				Browser.webdriver.navigate().refresh();
			}
		}
		key.close();
	}
}
