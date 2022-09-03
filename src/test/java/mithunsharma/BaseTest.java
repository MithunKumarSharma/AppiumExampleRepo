package mithunsharma;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.annotations.BeforeTest;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class BaseTest {
	public AndroidDriver driver;
	@BeforeTest
	public void configureAppiumCapability() throws MalformedURLException {
		/*AppiumDriverLocalService service = new AppiumServiceBuilder()
				.withAppiumJS(new File("//usr//local//lib//node_modules//appium//build//lib//main.js"))
						.withIPAddress("127.0.0.1").usingPort(4723)
						.build();
	        //service.start();*/
	        
		UiAutomator2Options option = new UiAutomator2Options();
		option.setDeviceName("GalaxyNexus");
		option.setApp("//Users//mithun//eclipse-workspace//Appium//src//test//java//resource//ApiDemos-debug.apk");
		
		driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub/"), option);
		
		//driver.quit();
	}
	public void longPressAction(WebElement element) {
		((JavascriptExecutor) driver).executeScript("mobile:longClickGesture", ImmutableMap.of(
			    "elementId", ((RemoteWebElement) element).getId(), "duration",2000));
		
	}
	
	public void scrollAction(String direction) {
		boolean canScrollMore;
		do {
		canScrollMore = (Boolean)((JavascriptExecutor) driver).executeScript("mobile: scrollGesture", ImmutableMap.of(
			    "left", 100, "top", 100, "width", 200, "height", 200,
			    "direction", direction,
			    "percent", 3.0
			));
		}while(canScrollMore);
	}

}
