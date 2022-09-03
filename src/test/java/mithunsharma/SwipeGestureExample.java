package mithunsharma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class SwipeGestureExample extends BaseTest{
	@Test
	public void swipeGesture() {
		String direction= "down";
		scrollAction(direction);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"Gallery\"));"));
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		driver.findElement(AppiumBy.accessibilityId("1. Photos")).click();
		WebElement elementId = driver.findElement(By.xpath("(//android.widget.ImageView)[1]"));
		Assert.assertEquals((driver.findElement(By.xpath("(//android.widget.ImageView)[1]"))).getAttribute("focusable"), "true");
		swipeGestureAction(elementId, "left");
		Assert.assertEquals((driver.findElement(By.xpath("(//android.widget.ImageView)[1]"))).getAttribute("focusable"), "false");
		Assert.assertEquals((driver.findElement(By.xpath("(//android.widget.ImageView)[1]"))).getAttribute("focusable"), "true");
		
	}

}
