package mithunsharma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import io.appium.java_client.AppiumBy;

public class LongPressExample extends BaseTest{
	@Test
	public void longpressGesture() throws InterruptedException {
		//driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Views\"));"));
		String direction= "down";
		scrollAction(direction);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Expandable Lists")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"1. Custom Adapter\"]")).click();
		WebElement element = driver.findElement(By.xpath("//android.widget.TextView[@text ='People Names']"));
		longPressAction(element);
		String title = 	driver.findElements(By.className("android.widget.TextView")).get(0).getText();
		Assert.assertEquals(title, "Sample menu");
	}

}


