package mithunsharma;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AndroidKeyEventExample extends BaseTest{
	@Test
	public void keyEventExample() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("Preference")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
		String title = driver.findElement(By.id("android:id/alertTitle")).getText();
		Assert.assertEquals(title, "WiFi settings");
		
		//Copy text to Clip board and Paste from Clip board Example
		driver.setClipboardText("Hello Wifi");
		//driver.findElement(By.id("android:id/edit")).sendKeys("Hello");
		driver.findElement(By.id("android:id/edit")).sendKeys(driver.getClipboardText());
		
		//Android Key Event Example
		//driver.pressKey(new KeyEvent(AndroidKey.ENTER));
		driver.findElements(By.className("android.widget.Button")).get(1).click();
		Thread.sleep(1000);
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		driver.pressKey(new KeyEvent(AndroidKey.HOME));
	}

}
