package jira;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import base.Base;
import myStudy.file.ExcelFile;

public class Up {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub

		String filePath = "H:\\Desktop\\test\\上海测试进度10.24.xls";
		String sheetName = "问题列表";
		int column = 7;
//			int row = 1;

		// TODO Auto-generated method stub
		String urlPath = "http://10.1.9.24:8080/login.jsp";
		WebDriver driver = Base.getDriver(urlPath);
		String userNameId = "login-form-username";
		String passWdId = "login-form-password";
		String dengluId = "login-form-submit";
		Base.sendKeysId(driver, userNameId, "liyan");
		Base.sendKeysId(driver, passWdId, "1");
		Base.clickId(driver, dengluId);

//			项目
		String xm = "//*[@id=\"browse_link\"]";
		Base.click(driver, xm);
//		Thread.sleep(2000);
//			查看所有项目
		String cksyxm = "//*[@id=\"project_view_all_link_lnk\"]";
		Base.click(driver, cksyxm);

//		Thread.sleep(5000);
		Base.scroll(driver, 0, 1000);
//			市场监管行政审批平台
		String xmName = "//*[@id=\"none-panel\"]/div[2]/div/table/tbody/tr[9]/td[2]/a";
		Base.click(driver, xmName);

//		Thread.sleep(2000);
		
		
//		-----------------------------------------------
		for (int row = 79; row <= 100; row++) {

//			创建问题
//			String cjwt = "//*[@id=\"create_link\"]";
//			Base.click(driver, cjwt);
			Thread.sleep(1000);
			Base.clickImg("/imgs/chuangjian.png");
			Thread.sleep(1000);
//			主题
			String zt = "//*[@id=\"summary\"]";
			String ztNR = ExcelFile.readXls_x(filePath, sheetName, row, column);
			System.out.println("读到的文档内容：" + ztNR);
			Base.sendKeys(driver, zt, ztNR);
//			Thread.sleep(1000);
//			版本选择
			String bbxz = "//*[@id=\"versions-multi-select\"]/span";
			Base.click(driver, bbxz);
			Thread.sleep(400);
//			版本
//			String selectXpath = "//*[@id=\"未发布版本\"]/li[3]/a";
			
//			List<WebElement> eles = driver.findElements(By.xpath(selectXpath));
//			for(WebElement ele:eles) {
//				if(ele.getText().contains("上海-1024（正式环境）")) {
//					ele.click();
//				}
//			}
//			Base.click(driver, selectXpath);
			Base.clickImg("/imgs/version.png");
			Thread.sleep(300);
//			Thread.sleep(300);
			System.out.println("模块前");
//			模块
//			String mk = "//*[@id=\"components-multi-select\"]/span";
//			Base.click(driver, mk);
//			Thread.sleep(3000);
//			Robot robot = new Robot();
//			robot.mouseMove(1800, 1300);
//			robot.mouseWheel(5);
//			Base.clickImg("/imgs/AllMK.png");
//			Thread.sleep(1000);
//			robot.mouseWheel(10);
//			Thread.sleep(1000);
//			Base.clickImg("/imgs/scxkzXb.png");
//			System.out.println("模块后");
			
//			经办人
			String jbr = "//*[@id=\"assignee-field\"]";
			WebElement eleJbr =  driver.findElement(By.xpath(jbr));
			eleJbr.clear();
			eleJbr.sendKeys("李黛");
//			Thread.sleep(300);
			Base.clickImg("/imgs/jbr.png");
			Thread.sleep(300);
//			创建
			String cj = "//*[@id=\"create-issue-submit\"]";
			
			Base.click(driver, cj);
//			Thread.sleep(8000);
		}

	}

}
