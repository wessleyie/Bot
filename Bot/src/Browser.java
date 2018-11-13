import java.util.HashMap;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Browser {
	
	public static WebDriver webdriver;
	
		public static void Start(){
			
			String os = System.getProperty("os.name");

			if (os.contains ("Windows")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\chromedriver.exe");
				
				Map<String, String> mobileEmulation = new HashMap<>();
				mobileEmulation.put("deviceName", "Nexus 5");
				ChromeOptions chromeOptions = new ChromeOptions();
				chromeOptions.setExperimentalOption("mobileEmulation", mobileEmulation);
				webdriver = new ChromeDriver(chromeOptions);
			}
			
			if (os.contains("Mac")){
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/chromedriver");
			}
		}
}