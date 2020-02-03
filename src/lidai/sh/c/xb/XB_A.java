package lidai.sh.c.xb;

import java.awt.AWTException;
import java.util.Random;

import org.openqa.selenium.WebDriver;

import lidai.sh.Base;
import myStudy.file.ExcelFile;

public class XB_A {
	public static WebDriver A(WebDriver driver,String filePath) throws InterruptedException, AWTException {
		String sheetName = "新办-基本信息";
		int column = 4;
//		新办
		String xb = ExcelFile.readXls_x(filePath, sheetName, 2, column);
		Base.click(driver, xb);
		Thread.sleep(3000);
//		邮政编码
		String yzbm = ExcelFile.readXls_x(filePath, sheetName, 4, column);
		String yzbmC = ExcelFile.readXls_x(filePath, sheetName, 4, column+1);
		Base.sendKeys(driver, yzbm, yzbmC);
//		E-mail
		String email = ExcelFile.readXls_x(filePath, sheetName, 5, column);
		String emailC = ExcelFile.readXls_x(filePath, sheetName, 5, column+1);
		Base.sendKeys(driver, email, emailC);
//		申请人
		String sqr = ExcelFile.readXls_x(filePath, sheetName, 6, column);
		String sqrC = ExcelFile.readXls_x(filePath, sheetName, 6, column+1);
		Base.sendKeys(driver, sqr, sqrC);
//		固定电话
		String gddh = ExcelFile.readXls_x(filePath, sheetName, 7, column);
		String gddhC = ExcelFile.readXls_x(filePath, sheetName, 7, column+1);
		Base.sendKeys(driver, gddh, gddhC);
//		移动电话
		String yddh = ExcelFile.readXls_x(filePath, sheetName, 8, column);
		String yddhC = ExcelFile.readXls_x(filePath, sheetName, 8, column+1);
		Base.sendKeys(driver, yddh, yddhC);
//		职工人数
		String zgrs = ExcelFile.readXls_x(filePath, sheetName, 9, column);
		String zgrsC = ExcelFile.readXls_x(filePath, sheetName, 9, column+1);
		Base.sendKeys(driver, zgrs, zgrsC);
//		应体检人数
		String ytjrs = ExcelFile.readXls_x(filePath, sheetName, 10, column);
		String ytjrsC = ExcelFile.readXls_x(filePath, sheetName, 10, column+1);
		Base.sendKeys(driver, ytjrs, ytjrsC);
//		店招与字号
		String dzyzh = ExcelFile.readXls_x(filePath, sheetName, 11, column);
		String dzyzhC = ExcelFile.readXls_x(filePath, sheetName, 11, column+1);
		Base.sendKeys(driver, dzyzh, dzyzhC);
//		经营面积
		String jymj = ExcelFile.readXls_x(filePath, sheetName, 12, column);
		String jymjC = ExcelFile.readXls_x(filePath, sheetName, 12, column+1);
		Base.sendKeys(driver, jymj, jymjC);
//		房屋使用期限
		String fwsyqx = ExcelFile.readXls_x(filePath, sheetName, 13, column);
		String fwsyqxC = ExcelFile.readXls_x(filePath, sheetName, 13, column+1);
		Base.sendKeys(driver, fwsyqx, fwsyqxC);
//		房屋期限截止日期
		String fwqxjzrq = ExcelFile.readXls_x(filePath, sheetName, 14, column);
		String fwqxjzrqC = ExcelFile.readXls_x(filePath, sheetName, 14, column+1);
		Base.sendKeys(driver, fwqxjzrq, fwqxjzrqC);
		Thread.sleep(500);
		Base.scroll(driver, 900, 1100);
		Thread.sleep(500);
//		房屋使用方式
		Random rd = new Random();
		int x = rd.nextInt(4) + 1;
		String fwsyfs = "//*[@id=\"app\"]/div/section/main/div/div/div[2]/form/div[26]/div/div/div/div/label["+x+"]/span[2]";
		                 //*[@id=\"app\"]/div/section/main/div/div/div[2]/form/div[26]/div/div/div/div/label[    3]/span[1]/span
						 //*[@id="app"  ]/div/section/main/div/div/div[2]/form/div[26]/div/div/div/div/label[1    ]/span[1]/span
//		String fwsyfs = "//*[@id=\"app\"]/div/section/main/div/div/div[2]/form/div[26]/div/div/div/div/label[2]/span[2]";
		                 //*[@id="app"]/div/section/main/div/div/div[2]/form/div[26]/div/div/div/div/label[3]/span[2]
		if(x==1) {
			System.out.println("房屋使用方式 ：自有");
		}else if(x==2) {
			System.out.println("房屋使用方式 ：租赁");
		}else if(x==3) {
			System.out.println("房屋使用方式 ：无偿使用");
		}else {
			System.out.println("房屋使用方式 ：其他");
		}
		System.out.println("-!!!!!!!!!!!!!!!!!!!!!--");

		Thread.sleep(500);
		Base.click(driver, fwsyfs);
		System.out.println("-----------------------------");
//
//
//		房屋产权备注
		String fwcqbz = ExcelFile.readXls_x(filePath, sheetName, 19, column);
		String bzC = Base.bz(20);
		Base.sendKeys(driver, fwcqbz, bzC);
		Base.scroll(driver, 1000, 1200);
		Thread.sleep(500);
		return driver;
	}
}
