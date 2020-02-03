package lidai.sh.e;

import java.awt.AWTException;
import java.awt.Robot;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import lidai.sh.Base;

public class BA {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
	
		String urlPath ="http://61.129.59.46/shportal/";
		WebDriver driver = Base.getDriver(urlPath);
//		用户
		String yh = "//*[@id=\"infoForm\"]/div/ul/li[1]/div/select";
		WebElement eleYh = driver.findElement(By.xpath(yh));
		Select sel = new Select(eleYh);
		sel.selectByIndex(1);
//		登录
		String dl = "//*[@id=\"infoForm\"]/div/ul/li[2]/a";
		Base.click(driver, dl);
		Thread.sleep(1000);
//		备案
		String ba ="//*[@id=\"app\"]/div/section/main/div/div/div/div[2]/div/div[1]/div/div[5]/div[2]/button";
		Base.click(driver, ba);
		Thread.sleep(2000);
//		许可证编号
		String xkzbh = "//*[@id=\"app\"]/div/section/main/div/div/div[2]/form/div[5]/div/div/div[2]/div/input";
		Base.sendKeys(driver, xkzbh, "abcd45678");
//		营业执照编号
		String yyzzbh = "//*[@id='app']/div/section/main/div/div/div[2]/form/div[7]/div/div/div[2]/div/input";
		Base.sendKeys(driver, yyzzbh, "yyzz67890");
		Base.scroll(driver, 0,300);
		Thread.sleep(300);
//		生产地址 
		String scdz = "//*[@id=\"app\"]/div/section/main/div/div/div[2]/form/div[9]/div/div/div/div[2]/div[1]/div/div/input";
		
		String scdz_A = "//body/div[2]/div[1]/div[1]/div[1]/ul/li/span"; 
		String scdz_B = "//body/div[2]/div[1]/div[2]/div[1]/ul/li/span";
		String scdz_C = "//body/div[2]/div[1]/div[3]/div[1]/ul/li/span";
		Actions act = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath(scdz));
		act.click(ele).perform();
		Thread.sleep(300);
		WebElement eleA = driver.findElement(By.xpath(scdz_A));
		act.click(eleA).perform();
		Thread.sleep(300);
		WebElement eleB = driver.findElement(By.xpath(scdz_B));
		act.click(eleB).perform();
		Thread.sleep(300);
		WebElement eleC = driver.findElement(By.xpath(scdz_C));
		act.click(eleC).perform();
		Thread.sleep(300);
		String scdzD = "//*[@id=\"app\"]/div/section/main/div/div/div[2]/form/div[9]/div/div/div/div[2]/div[2]/div/input";
		Base.sendKeys(driver, scdzD, "浦江镇");
		Thread.sleep(300);
		String scdzE = "//*[@id=\"app\"]/div/section/main/div/div/div[2]/form/div[9]/div/div/div/div[2]/div[3]/div/input";
		Base.sendKeys(driver, scdzE, "江斜路22号");
		Base.scroll(driver, 300,600);
		Thread.sleep(300);
//		生产详细地址
//		String scxxdz = "//*[@id=\"app\"]/div/section/main/div/div/div[2]/form/div[10]/div/div/div[2]/div/input";
//		Base.sendKeys(driver, scxxdz, "田林路34号2楼");
//		受理机构
		String sljg = "//*[@id=\"app\"]/div/section/main/div/div/div[2]/form/div[12]/div/div/div[2]/div/div/input";
		WebElement eleSljg = driver.findElement(By.xpath(sljg));
		act.click(eleSljg).perform();
		
		String sljg_A = "//body/div[3]/div[1]/div[1]/ul/li/span";
		List<WebElement> eleSljg_As = driver.findElements(By.xpath(sljg_A));
		System.out.println(eleSljg_As.size());
		Robot rb = new Robot();
		rb.mouseMove(900, 980);
		rb.mouseWheel(3);
		for(WebElement eleSljg_A : eleSljg_As) {
			if("浦东新区市场监管局".equals(eleSljg_A.getText())) {

				eleSljg_A.click();
			}
		}
//		联系人
		String lxr = "//*[@id=\"app\"]/div/section/main/div/div/div[2]/form/div[14]/div[1]/div/div[2]/div/input";
		Base.sendKeys(driver, lxr, "刘冰");
//		联系人手机
		String lxrsj = "//*[@id=\"app\"]/div/section/main/div/div/div[2]/form/div[14]/div[2]/div/div[2]/div/input";
		Base.sendKeys(driver, lxrsj, "18889798921");
//		邮箱
		String yx = "//*[@id=\"app\"]/div/section/main/div/div/div[2]/form/div[15]/div[1]/div/div[2]/div/input";
		Base.sendKeys(driver, yx, "abcdef@163.com");
//		传真
		String cz = "//*[@id=\"app\"]/div/section/main/div/div/div[2]/form/div[15]/div[2]/div/div[2]/div/input";
		Base.sendKeys(driver, cz, "1236547");
//		备注
		String bz = "//*[@id=\"app\"]/div/section/main/div/div/div[2]/form/div[17]/div/div/div[2]/div/textarea";
		Base.sendKeys(driver, bz, Base.bz(10));
		
		
		
	}

}
