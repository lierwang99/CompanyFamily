package lidai.sh.d;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lidai.sh.Login;
import lidai.sh.d.a.*;

public class Xbtest {
	WebDriver driver = null;
	@BeforeTest
	public void login() throws InterruptedException {
		driver = Login.login(driver);
		System.out.println("登录："+driver.getTitle());
	}
	@Test(priority = 0)
	public void xb() {
		driver = Xb.xb(driver);
		System.out.println("新办："+driver.getTitle());
	}
	@Test(priority = 1)
	public void A() {
		A.a(driver);
	}

	@Test(priority = 2)
	public void B() {
		B.b(driver);
	}

	@Test(priority = 3)
	public void C() {
		C.c(driver);
	}


}
