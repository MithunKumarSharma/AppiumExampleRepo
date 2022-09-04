package mithunsharma;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class MiscellaneousExample extends BaseTest{
	@Test
	public void DragExample() throws InterruptedException {
		String direction= "down";
		scrollAction(direction);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver .findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
		WebElement dragCircle = driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
		dragGestureAction(dragCircle, 472, 425);
		String result = driver.findElement(By.id("io.appium.android.apis:id/drag_result_text")).getText();
		Assert.assertEquals(result, "Dropped!");
		dragGestureAction(dragCircle, 158, 742);
		Assert.assertEquals(result, "Dropped!");
		
	}

}
