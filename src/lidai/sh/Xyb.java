package lidai.sh;

import org.openqa.selenium.WebDriver;

public class Xyb {
	public static WebDriver click(WebDriver driver) throws InterruptedException {
		Thread.sleep(2000);
		String xyb = "//*[@id=\"app\"]/div/section/main/div/div/div[4]/div/div/button[3]/span";
						//*[@id="app"]/div/section/main/div/div/div[4]/div/div/button[3]/span
						//*[@id="app"]/div/section/main/div/div/div[4]/div/div/button[3]/span
						//*[@id="app"]/div/section/main/div/div/div[4]/div/div/button[3]/span
		Base.click(driver, xyb);
		Thread.sleep(2000);
		return driver;
	}
}
