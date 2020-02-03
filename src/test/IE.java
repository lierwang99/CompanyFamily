package test;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.ie.driver", ".\\tools\\IEDriverServer.exe");
		WebDriver driver = new InternetExplorerDriver();
		driver.get("https://www.baidu.com");
		Dimension demension = new Dimension(2000,1000);
		driver.manage().window().setSize(demension);
//		ChromeOptions op = new ChromeOptions();
//		Map<String, Object> asMap = op.asMap();
//		Set<String> keySet = asMap.keySet();
//		Iterator<String> iterator = keySet.iterator();
//		while(iterator.hasNext()) {
//			String next = iterator.next();
//			System.out.println(next);
//		}
	}

}
