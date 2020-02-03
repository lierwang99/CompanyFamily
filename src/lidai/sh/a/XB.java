package lidai.sh.a;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import lidai.sh.Login;
import lidai.sh.Xyb;
import lidai.sh.a.xb.XB_A;
import lidai.sh.a.xb.XB_B;
import lidai.sh.a.xb.XB_C;

public class XB {
	
	WebDriver driver = null ;
	String filePath = "D:\\Documents\\Tencent Files\\1219838266\\FileRecv\\李黛-上海.xlsx";
  @BeforeTest
  public void beforeMethod() throws InterruptedException {
	  System.out.println(0);
	  driver = Login.login(driver);
	  
  }
  @AfterTest(alwaysRun = false,enabled = false)
  public void colse() throws InterruptedException {
	  Thread.sleep(5000);
	  driver.close();
	  System.out.println("最后关闭浏览器");
	  
  }
  @AfterMethod
  public void xyb() throws InterruptedException {
	  System.out.println("我是下一步");
	  driver = Xyb.click(driver);
  }
  @Test(priority = 1)
  public void A() throws InterruptedException {
	  System.out.println(1);
	  driver = XB_A.A(driver,filePath);
  }

  @Test(priority = 2)
  public void B() throws InterruptedException {
	  System.out.println(2);
	  driver = XB_B.B(driver,filePath);
  }
  @Test(enabled = true,priority = 3)
  public void C() {
	  System.out.println(3);
	  driver = XB_C.C(driver,filePath);
	  
  }

}
