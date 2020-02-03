package Consumer1215;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;

import base.Base;
import myStudy.file.ExcelFile;

public class Login {
//	static int line =5;

	@SuppressWarnings("resource")
	public static WebDriver login(int line) throws InterruptedException {
		String urlPath = "http://101.227.181.177/consumer/login";
		WebDriver driver = Base.getDriver(urlPath);
		String organXapth = "//select[@name='organId']";
		String nameId = "loginName";
		String passwdId = "password";
		String verifyId = "codeStrId";
		String loginXpath = "//input[@class='btn_login']";
		String filePath = "C:\\userInfo.xlsx";
		String sheetName = "登录";
		int organNum = Integer.parseInt(ExcelFile.readXls_x(filePath, sheetName, line, 4));
//		黄浦区是第五行，市局是第二行
		String userName = ExcelFile.readXls_x(filePath, sheetName, line, 2);
		String passWd = ExcelFile.readXls_x(filePath, sheetName, line, 3);
		boolean flag = false;

		do {

			Base.selectList(driver, organXapth, organNum);
			Base.sendKeysId(driver, nameId, userName);
			Base.sendKeysId(driver, passwdId, passWd);

			Scanner sc = new Scanner(System.in);
			String code = sc.next();

			Base.sendKeysId(driver, verifyId, code);
			Thread.sleep(3000);
			Base.click(driver, loginXpath);
			String currentUrl = driver.getCurrentUrl();
			String successfulUrl = "http://101.227.181.177/consumer/logging";
			flag = successfulUrl.equalsIgnoreCase(currentUrl);
		} while (!flag);
//		assert sucessfulUrl.equals(currentUrl) : "登录失败";

		return driver;
	}

}
