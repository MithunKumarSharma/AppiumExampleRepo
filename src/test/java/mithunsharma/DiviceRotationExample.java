package mithunsharma;

import org.openqa.selenium.By;
import org.openqa.selenium.DeviceRotation;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class DiviceRotationExample extends BaseTest{
	
	
@Test
public void deviceRotation(){
	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
	driver.findElement(By.id("android:id/checkbox")).click();
	DeviceRotation rotateLandScape = new DeviceRotation(0, 0, 90);
	driver.rotate(rotateLandScape);
	driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	String title = driver.findElement(By.id("android:id/alertTitle")).getText();
	Assert.assertEquals(title, "WiFi settings");
	driver.findElement(By.id("android:id/edit")).sendKeys("Hello");
	driver.findElements(By.className("android.widget.Button")).get(1).click();
	DeviceRotation rotateLandScape1 = new DeviceRotation(90, 0, 0);
	driver.rotate(rotateLandScape1);
	
}
}