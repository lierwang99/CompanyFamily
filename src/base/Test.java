package base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Test {

	public static void main(String[] args) throws AWTException, InterruptedException, FindFailed {
		// TODO Auto-generated method stub
		String url = "https://baike.baidu.com/item/%E9%98%BF%E9%87%8C%E5%B7%B4%E5%B7%B4%E9%9B%86%E5%9B%A2/9087864?fr=aladdin";
		WebDriver driver = Base.getDriver(url);
		driver.manage().window().maximize();
		Actions ac = new Actions(driver);
		
//		KeyEvent keyEvent = new KeyEvent();
		Robot robot = new Robot();
		Keys control = Keys.CONTROL;
		Keys shift = Keys.SHIFT;
//		String cc = Keys.chord(control,shift,"c");
		Keys c = Keys.getKeyFromUnicode('c');
//		int vkC = KeyEvent.VK_F12;
//		robot.keyPress(vkC);
		int vkControl = KeyEvent.VK_CONTROL;
		int vkShift = KeyEvent.VK_SHIFT;
		int vkC = KeyEvent.VK_C;
		int vkP = KeyEvent.VK_P;
		robot.keyPress(vkControl);
		robot.keyPress(vkShift);
		robot.keyPress(vkC);
//		ROBOT.KEYRELEASE(VKSHIFT);
//		robot.keyRelease(vkC);
		Thread.sleep(3000);
		robot.keyRelease(vkC);
		robot.keyPress(vkP);
		Thread.sleep(3000);
		robot.keyRelease(vkControl);
		robot.keyRelease(vkShift);
		robot.keyRelease(vkP);
		String imgPath = "./imgs/csp.png";
		Pattern gb = new Pattern(imgPath);
		Screen sc = new Screen();
//		sc.click(gb);
		sc.click(gb);

	}

}
