package mithunsharma;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class LocatorExample extends BaseTest{
	
	
@Test
public void wifiSetting(){
	driver.findElement(AppiumBy.accessibilityId("Preference")).click();
	driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
	driver.findElement(By.id("android:id/checkbox")).click();
	driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
	String title = driver.findElement(By.id("android:id/alertTitle")).getText();
	Assert.assertEquals(title, "WiFi settings");
	driver.findElement(By.id("android:id/edit")).sendKeys("Hello");
	driver.findElements(By.className("android.widget.Button")).get(1).click();
	
}
}