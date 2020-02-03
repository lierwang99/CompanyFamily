package lidai.sh.c;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lidai.sh.Login;
import lidai.sh.Xyb;
import lidai.sh.c.xb.XB_A;

public class XB {
	String filePath = "D:\\Documents\\Tencent Files\\1219838266\\FileRecv\\李黛-上海-食品经营许可.xlsx";
	WebDriver driver = null;

	@BeforeTest
	public void beforeTest() throws InterruptedException {
		driver = Login.login(driver);
	}

	@AfterTest
	public void afterTest() {
	}
	@AfterMethod
	public void  AfterMethod() throws InterruptedException {
		  System.out.println("我是下一步");
		  driver = Xyb.click(driver);
	}


	@Test
	public void A() throws InterruptedException, AWTException {
		System.out.println("基本信息");
		XB_A.A(driver, filePath);
	}


}
