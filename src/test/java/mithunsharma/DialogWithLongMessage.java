package mithunsharma;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class DialogWithLongMessage extends BaseTest{
@Test
public void dialogLongMessage() throws InterruptedException {
	driver.findElement(AppiumBy.accessibilityId("App")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Alert Dialogs\"]")).click();
	driver.findElement(By.id("io.appium.android.apis:id/two_buttons2")).click();
	Thread.sleep(1000);
	String title = driver.findElement(By.id("android:id/alertTitle")).getText();
	if(title.equalsIgnoreCase("Header title")) {
	   driver.findElement(By.id("android:id/button1")).click();
	   System.out.println("OK clicked");
	} else {
		driver.findElement(By.id("android:id/button2")).click();
		System.out.println("Cancel clicked");
	}
}
}
