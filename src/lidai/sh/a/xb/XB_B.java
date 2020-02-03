package lidai.sh.a.xb;

import org.openqa.selenium.WebDriver;

import lidai.sh.Base;
import myStudy.file.ExcelFile;

public class XB_B {
	public static WebDriver B(WebDriver driver,String filePath) throws InterruptedException {
//		String filePath = "D:\\Documents\\Tencent Files\\1219838266\\FileRecv\\李黛-上海.xlsx";
		String sheetName = "A_新办_技术人员";
		int column = 4 ;
		Thread.sleep(3000);
//		操作
		String cz = ExcelFile.readXls_x(filePath, sheetName, 3, column);
		Base.click(driver, cz);
		Thread.sleep(200);
//		System.out.println("点击了操作");
//		姓名
		String xm = ExcelFile.readXls_x(filePath, sheetName, 4, column);
		String xmC = ExcelFile.readXls_x(filePath, sheetName, 4, column+1);
		Base.sendKeys(driver, xm,xmC);
//		职务
		String zw = ExcelFile.readXls_x(filePath, sheetName, 5, column);
		String zw_A = ExcelFile.readXls_x(filePath, sheetName, 6, column);
		Base.click(driver, zw);
		Base.click(driver, zw_A);
//		证件类型
		String zjlx = ExcelFile.readXls_x(filePath, sheetName, 7, column);
		String zjlx_A = ExcelFile.readXls_x(filePath, sheetName, 8, column);
		Base.click(driver, zjlx);
		Base.click(driver, zjlx_A);
//		证件号码
		String zjhm = ExcelFile.readXls_x(filePath, sheetName, 11, column);
		String zjhmC = ExcelFile.readXls_x(filePath, sheetName, 11, column+1);
		Base.sendKeys(driver, zjhm, zjhmC);
//		文化程度
		String whcd = ExcelFile.readXls_x(filePath, sheetName, 12, column);
		String whcd_A = ExcelFile.readXls_x(filePath, sheetName, 13, column);
		Base.click(driver, whcd);
		Base.click(driver, whcd_A);
//		专业
		String zy = ExcelFile.readXls_x(filePath, sheetName, 14, column);
		String zyC = ExcelFile.readXls_x(filePath, sheetName, 14, column+1);
		Base.sendKeys(driver, zy, zyC);
//		确定
		String qd = ExcelFile.readXls_x(filePath, sheetName, 15, column);
		Base.click(driver, qd);
		return driver;
	}

}
