import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiObject;
import android.support.test.uiautomator.UiObjectNotFoundException;
import android.support.test.uiautomator.UiSelector;
import android.support.test.uiautomator.Until;

import org.junit.Test;

public class Tests  extends BaseRunner{
	@Test
	public void testTrending(){
		device.findObject(By.clazz("android.widget.ImageButton")).click();
		device.findObject(By.text("Trending")).click();
		device.wait(Until.findObject(By.res("com.fastaccess.github.debug:id/drawer")),3000);
	}

	@Test
	public void testTheme() throws UiObjectNotFoundException {
		device.findObject(By.clazz("android.widget.ImageButton")).click();
		device.findObject(By.text("Settings")).click();
		device.wait(Until.findObject(By.clazz("android.widget.TextView").text("Settings")),3000);
		device.findObject(By.res("com.fastaccess.github.debug:id/iconItemImage")).click();
		UiObject object = device.findObject(new UiSelector().className("android.widget.LinearLayout"));
		object.swipeLeft(50);
		/*я не знаю, как это работает, но если свапнуть на черную тему,
		то галочка нажмётся на темно серой, а если только до серой, то на белой нажимается*/
		device.wait(Until.findObject(By.res("com.fastaccess.github.debug:id/coordinatorLayout")), 3000);
		device.findObject(By.res("com.fastaccess.github.debug:id/apply")).click();
		//как проверить фон с помощью uiautomator я к сожалению тоже не нашла

	}
	@Test
	public void testRestorePurchases(){
		device.findObject(By.clazz("android.widget.ImageButton")).click();
		device.findObject(By.scrollable(true)).findObject(By.res("com.fastaccess.github.debug:id/design_menu_item_text")).click();
		//не знаю, как проверить на то, что отправился Intent, в приложении это никак не показывается
	}

	@Test
	public void testToast(){
		device.findObject(By.clazz("android.widget.ImageButton")).click();
		device.findObject(By.text("Send feedback")).click();
		device.wait(Until.findObject(By.text("You are currently using a debug build")), 3000);
		device.findObject(By.text("OK")).click();
		device.wait(Until.findObject(By.res("com.fastaccess.github.debug:id/parent")),3000);
		device.findObject(By.text("Title")).click();
		device.findObject(By.clazz("android.widget.EditText")).setText("hello");
		device.findObject(By.text("Description")).click();
		device.wait(Until.findObject(By.text("Markdown")), 3000);
		device.findObject(By.desc("Submit")).click();
		device.wait(Until.findObject(By.text("Submit feedback")), 3000);
		device.findObject(By.pkg("com.fastaccess.github.debug").res("com.fastaccess.github.debug:id/submit")).click();
		device.findObject(By.text("Message was send"));
	}
}
