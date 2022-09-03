package mithunsharma;

import org.testng.annotations.Test;

import io.appium.java_client.AppiumBy;

public class ScrollGestureExample extends BaseTest{
	boolean canScrollMore;
	@Test
	public void scrollGesture() {
		String direction= "down";
		scrollAction(direction);
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		scrollAction(direction);
	}
}
