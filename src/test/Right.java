package test;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.awt.Window;
import java.awt.event.InputEvent;
import java.awt.Robot;
import java.lang.Thread;
import java.awt.event.KeyEvent;

import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Right{
	public static void clickImg(String imgPath) {
		Pattern gb = new Pattern(imgPath);
		Screen sc = new Screen();
		try {
			sc.click(gb);
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String args[]) throws Exception{

		int left = InputEvent.BUTTON1_MASK;//16
		int leftDown = InputEvent.BUTTON1_DOWN_MASK;//1024
		int middle = InputEvent.BUTTON2_MASK;//8
		int middleDown = InputEvent.BUTTON2_DOWN_MASK;//2048
		int right = InputEvent.BUTTON3_MASK;//4
		int rightDown = InputEvent.BUTTON3_DOWN_MASK;//4096
		
		System.out.println(left);
		System.out.println(leftDown);
		System.out.println(middle);
		System.out.println(middleDown);
		System.out.println(right);
		System.out.println(rightDown);
		
		Robot robot = new Robot();
		robot.mouseMove(1175,1250);

		
		
		robot.mousePress(right);
		Thread.sleep(1000);
		robot.mousePress(rightDown);
		Thread.sleep(3000);
		robot.mouseMove(1274,470);
		// robot.mousePress(left);
		// Thread.sleep(2000);
		// robot.mousePress(leftDown);
		// robot.mousePress(right);
		// robot.mousePress(rightDown);
		// int enter = KeyEvent.VK_ENTER;
		// robot.keyPress(enter);
		// Thread.sleep(2000);
		// robot.keyRelease(enter);	
		Right.clickImg("H:\\Desktop\\notepad\\test\\open.png");
		System.out.println("结束运行！");
		
		
		
		
		// Robot robot = new Robot();
		// robot.mouseMove(1175,1250);
		// robot.mousePress(left);
		// robot.mousePress(leftDown);
		// robot.mousePress(left);
		// robot.mousePress(leftDown);
		// System.out.println("结束运行！");
		
		
		
		
		
		
		
		// System.out.println(123);
		// GraphicsEnvironment gEnvi = GraphicsEnvironment.getLocalGraphicsEnvironment();
		// GraphicsDevice gD = gEnvi.getDefaultScreenDevice();
		// String id = gD.getIDstring();
		// System.out.println(id);
		// Window window = gD.getFullScreenWindow();
		// if(window==null){
			// System.out.println("为空！！");
		// }else{
			// System.out.println(window.getWarningString());
		// }
		
		
	}
	
}