package pages;

import android.support.test.uiautomator.By;
import android.support.test.uiautomator.UiDevice;
import android.support.test.uiautomator.Until;

public class application{
	UiDevice device;

	public void findObjectWithClazzAndClick(String clazz){
		 device.findObject(By.clazz(clazz)).click();
	}

	public  void findObjectWithResAndClick(String res){
		device.findObject(By.res(res)).click();
	}

	public  void findObjectWithTextAndClick(String text){
		device.findObject(By.text(text)).click();
	}

	public  void findObjectWithDescAndClick(String desc){
		device.findObject(By.desc(desc)).click();
	}

	public  void findObjectWithPkgAndRescAndClick(String desc){
		device.findObject(By.pkg("com.fastaccess.github.debug").res("com.fastaccess.github.debug:id/submit")).click();
	}




	public  void waitWithRes(String res){
		device.wait(Until.findObject(By.res(res)),3000);
	}

	public  void waitWithClazzAndText(String clazz, String text){
		device.wait(Until.findObject(By.clazz(clazz).text(text)),3000);
	}

	public  void waitWithText(String text){
		device.wait(Until.findObject(By.text(text)), 3000);
	}

	public void findObjectWithClazzAndSetText(String clazz, String text){
		device.findObject(By.clazz(clazz)).setText(text);
	}




}
