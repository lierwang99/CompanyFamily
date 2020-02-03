package lidai.sh.d.a;

import org.openqa.selenium.WebDriver;

import lidai.sh.Base;

public class Xb {
	public static  WebDriver xb(WebDriver driver) {
		String xbXpath = "//*[@id=\"app\"]/div/section/main/div/div/div/div[2]/div/div[1]/div/div[4]/div[2]/button[1]/span";
		Base.click(driver,xbXpath);
		return driver;
	}

}
