package test;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import Consumer1215.Login;
import Consumer1215.Tsdj_Zsdj;
import Consumer1215.Zxdj;

public class NewTest {
	//register(WebDriver driver,int dataSource,int managerCategory,String userName,int userNo)
	/* 来源 ：
	 * 0.直接到12315 
	 * 1.上级交办 
	 * 2.部门转办
	 * 3.其他
	 * 4.12345
	 * 5.12331
	 */
	int dataSource = 2;//来源
	/*经营者类别：
	 * 1.生产企业
	 * 2.销售企业
	 * 3.服务企业
	 * 4.其他企业
	 * 5.个体工商户
	 * 6.自然人
	 * 7.其他
	 */
	int managerCategory = 2;//经营者类别
	String userName = dataSource+""+managerCategory+"市局";
//	初始化用户序号
	int No = 82;
//	截止点
	int end = 87;
	int line = 0;
	WebDriver driver = null;
	@Test
	public void beforeMethod() throws Exception {
//		市局第2行，黄浦第5行，徐汇第8行
		if(userName.contains("市局")) {
			line = 2;
		}else if(userName.contains("黄浦")) {
			line = 5;
		}else {
			line = 8;
		}
		driver = Login.login(line);
		Thread.sleep(2000);
	}
	
	@Test(enabled = false)
	public void zxdj() {
		Zxdj.register(driver);
	}

	@Test(dependsOnMethods = {"beforeMethod"},enabled =true)
	public void tsdj_Zsdj() throws Exception {
		while(No<end) {
			Tsdj_Zsdj.register(driver,dataSource,managerCategory,userName,No);
			Thread.sleep(3000);
			No++;
		}
	}
}
