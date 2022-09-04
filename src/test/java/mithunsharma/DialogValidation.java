package mithunsharma;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class DialogValidation extends BaseTest{
@Test
	public void validateDialog() throws InterruptedException {
		String givenTitle = "Lorem ipsum dolor sit aie consectetur adipiscing...";
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Alert Dialogs\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
		Thread.sleep(1000);
		boolean isDisplayed = driver.findElement(By.id("android:id/alertTitle")).isDisplayed();
		
		if(isDisplayed) {
		driver.findElement(By.id("android:id/button1")).click();
		System.out.println("OK Clicked");
		} else {
			driver.findElement(By.id("android:id/button2")).click();
			System.out.println("Cancel Clicked");
		}
	}
}
