package mithunsharma;

public class DialogGestureExample extends BaseTest{
@Test
	public void validateDialog() throws InterruptedException {
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Alert Dialogs\"]")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
		Thread.sleep(1000);
		boolean isDisplayed = driver.findElement(By.id("android:id/alertTitle")).isDisplayed();
		if(isDisplayed) {
		   driver.findElement(By.id("android:id/button1")).click();
		} else {
			driver.findElement(By.id("android:id/button2")).click();
		}
	}
}
