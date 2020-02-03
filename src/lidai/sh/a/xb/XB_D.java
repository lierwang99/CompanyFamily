package lidai.sh.a.xb;

import org.openqa.selenium.WebDriver;

import base.Base;
import myStudy.file.ExcelFile;

public class XB_D {//A_新办_负责人
	public static WebDriver C(WebDriver driver,String filePath) throws InterruptedException {
//		String filePath = "D:\\Documents\\Tencent Files\\1219838266\\FileRecv\\李黛-上海.xlsx";
		String sheetName = "A_新办_产品信息";
		int column = 4 ;
//		主营食品类别
		String zysplb = ExcelFile.readXls_x(filePath, sheetName, 3, column);
		String zysplb_A = ExcelFile.readXls_x(filePath, sheetName, 4, column);
		Base.click(driver, zysplb);
		Thread.sleep(200);
		Base.click(driver, zysplb_A);
//		食品
		String spA = ExcelFile.readXls_x(filePath, sheetName, 4, column);
		String spA_A = ExcelFile.readXls_x(filePath, sheetName, 5, column);
		String spA_B = ExcelFile.readXls_x(filePath, sheetName, 6, column);
		String spA_C = ExcelFile.readXls_x(filePath, sheetName, 7, column);
		String spA_D = ExcelFile.readXls_x(filePath, sheetName, 8, column);
		
		Base.click(driver, spA);
		Thread.sleep(200);
		Base.click(driver, spA_A);
		Thread.sleep(200);
		Base.click(driver, spA_B);
		Thread.sleep(200);
		Base.click(driver, spA_C);
		Thread.sleep(200);
		Base.click(driver, spA_D);
		Thread.sleep(200);
		Base.scroll(driver, 0, 300);
		Thread.sleep(200);
		return driver;
	}

}
