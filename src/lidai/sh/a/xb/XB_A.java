package lidai.sh.a.xb;

import org.openqa.selenium.WebDriver;

import lidai.sh.Base;
import myStudy.file.ExcelFile;

public class XB_A {
	public static WebDriver A(WebDriver driver,String filePath) throws InterruptedException {
//		WebDriver driver = Login.login();
//		String filePath = "D:\\Documents\\Tencent Files\\1219838266\\FileRecv\\李黛-上海.xlsx";
		String sheetName = "A_新办_基本信息";
		int column = 4 ;
		
		String xb = ExcelFile.readXls_x(filePath, sheetName, 2, column);
		Base.click(driver, xb);
		Thread.sleep(2000);
		
//		产品类别
		String cplb = ExcelFile.readXls_x(filePath, sheetName, 4, column);
		Base.click(driver, cplb);
		
		Base.scroll(driver, 0, 600);
		Thread.sleep(200);
		
//		执行标准
		String zxbz = ExcelFile.readXls_x(filePath, sheetName, 6, column);
		String zxbzC = ExcelFile.readXls_x(filePath, sheetName, 6, (column + 1));
		Base.sendKeys(driver, zxbz, zxbzC);
//		联系人
		String lxr = ExcelFile.readXls_x(filePath, sheetName, 7, column);
		String lxrC = ExcelFile.readXls_x(filePath, sheetName, 7, (column + 1));
		Base.sendKeys(driver, lxr, lxrC);
//		联系人手机
		String lxrsj = ExcelFile.readXls_x(filePath, sheetName, 8, column);
		String lxrsjC = ExcelFile.readXls_x(filePath, sheetName, 8, (column + 1));
		Base.sendKeys(driver, lxrsj, lxrsjC);
//		邮件
		String yj = ExcelFile.readXls_x(filePath, sheetName, 9, column);
		String yjC = ExcelFile.readXls_x(filePath, sheetName, 9, (column + 1));
		Base.sendKeys(driver, yj, yjC);
//		传真
		String cz = ExcelFile.readXls_x(filePath, sheetName, 10, column);
		String czC = ExcelFile.readXls_x(filePath, sheetName, 10, (column + 1));
		Base.sendKeys(driver, cz, czC);
		
		Base.scroll(driver, 600, 800);
		Thread.sleep(200);
		
		return driver ;
		
	}

}
