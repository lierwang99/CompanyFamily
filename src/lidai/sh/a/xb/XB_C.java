package lidai.sh.a.xb;

import org.openqa.selenium.WebDriver;

import base.Base;
import myStudy.file.ExcelFile;

public class XB_C {//A_新办_负责人
	public static WebDriver C(WebDriver driver,String filePath) {
//		String filePath = "D:\\Documents\\Tencent Files\\1219838266\\FileRecv\\李黛-上海.xlsx";
		String sheetName = "A_新办_负责人";
		int column = 4 ;
//		户籍
		String hj = ExcelFile.readXls_x(filePath, sheetName, 3, column);
		String hjC = ExcelFile.readXls_x(filePath, sheetName, 3, column+1);
		Base.sendKeys(driver, hj, hjC);
//		移动电话
		String yddh = ExcelFile.readXls_x(filePath, sheetName, 4, column);
		String yddhC = ExcelFile.readXls_x(filePath, sheetName, 4, column+1);
		Base.sendKeys(driver, yddh, yddhC);
		return driver;
	}

}
