package lidai.sh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Login {
	public static WebDriver login(WebDriver driver) throws InterruptedException {
		String urlPath ="http://61.129.59.46/shportal/";
		driver = Base.getDriver(urlPath);
//		用户
		String yh = "//*[@id=\"infoForm\"]/div/ul/li[1]/div/select";
		WebElement eleYh = driver.findElement(By.xpath(yh));
		Select sel = new Select(eleYh);
		Thread.sleep(2000);
		sel.selectByIndex(1);
		Thread.sleep(2000);
//		登录
		String dl = "//*[@id=\"infoForm\"]/div/ul/li[2]/a";
		Base.click(driver, dl);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return driver ;
	}
}
