import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.Until;

import org.junit.Before;

import static android.support.test.InstrumentationRegistry.getInstrumentation;

public class BaseRunner{
	UiDevice device;

	@Before
	public void start(){
		device = UiDevice.getInstance(getInstrumentation());
		device.pressHome();
		device.findObject(By.desc("Apps list")).click();
		device.findObject(By.text("FastHub Debug")).click();
		device.wait(Until.findObject(By.clazz("android.support.v4.widget.DrawerLayout")),5000);
	}

}
