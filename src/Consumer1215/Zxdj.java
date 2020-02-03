package Consumer1215;

import java.util.Random;

import org.openqa.selenium.WebDriver;

import base.Base;
import myStudy.file.ExcelFile;

public class Zxdj {

	public static void register(WebDriver driver) {
		String filePath = "C:\\userInfo.xlsx";
		String sheetName = "咨询登记";
		Random rd = new Random();
		int column = 4;

//		业务处理
		String YWCL = ExcelFile.readXls_x(filePath, sheetName, 1, 3);
		Base.clickId(driver, YWCL);
//		业务处理_咨询登记
		String YWCL_Zxdj = ExcelFile.readXls_x(filePath, sheetName, 2, 3);
		Base.clickId(driver, YWCL_Zxdj);
		System.out.println("---------------1-------------");
		driver = driver.switchTo().frame("mainFrame");
//		业务处理_咨询登记_接收方式
		String jsfs = ExcelFile.readXls_x(filePath, sheetName, 4, 3);
		System.out.println(jsfs);
		Base.selectList(driver, jsfs, rd.nextInt(6) + 1);
		String jsfsText = Base.getElementText(driver, jsfs);
		ExcelFile.writeXls_x(filePath, sheetName,jsfsText, 4, column);
		System.out.println("---------------2-------------");
//		业务处理_咨询登记_咨询人联系电话
		String zxrlxdh = ExcelFile.readXls_x(filePath, sheetName, 5, 3);
		Base.sendKeys(driver, zxrlxdh, Base.bz(11));
		String zxrlxdhText = Base.getElementText(driver, zxrlxdh);
		ExcelFile.writeXls_x(filePath, sheetName,zxrlxdhText, 5, column);
		System.out.println("---------------3-------------");
//		业务处理_咨询登记_咨询人姓名
		String zxrxm = ExcelFile.readXls_x(filePath, sheetName, 6, 3);
		Base.sendKeys(driver, zxrxm, Base.bz(3));
		String zxrxmText = Base.getElementText(driver, zxrxm);
		ExcelFile.writeXls_x(filePath, sheetName,zxrxmText, 6, column);
//		业务处理_咨询登记_咨询人性别
		String zxrxb = ExcelFile.readXls_x(filePath, sheetName, 7, 3);
		Base.selectList(driver, zxrxb, rd.nextInt(2));
		String zxrxbText = Base.getElementText(driver, zxrxb);
		ExcelFile.writeXls_x(filePath, sheetName,zxrxbText, 7, column);
//		业务处理_咨询登记_咨询人年龄
		String zxrnl = ExcelFile.readXls_x(filePath, sheetName, 8, 3);
		Base.sendKeys(driver, zxrnl, "25");
		String zxrnlText = Base.getElementText(driver, zxrnl);
		ExcelFile.writeXls_x(filePath, sheetName,zxrnlText, 8, column);
//		业务处理_咨询登记_咨询人民族
		String zxrmz = ExcelFile.readXls_x(filePath, sheetName, 9, 3);
		Base.selectList(driver, zxrmz, rd.nextInt(57) + 1);
		String zxrmzText = Base.getElementText(driver, zxrmz);
		ExcelFile.writeXls_x(filePath, sheetName,zxrmzText, 9, column);
//		业务处理_咨询登记_咨询人身份证号
		String zxrsfzh = ExcelFile.readXls_x(filePath, sheetName, 10, 3);
		Base.sendKeys(driver, zxrsfzh, "354789016471478965");
		String zxrsfzhText = Base.getElementText(driver, zxrsfzh);
		ExcelFile.writeXls_x(filePath, sheetName,zxrsfzhText, 10, column);
//		业务处理_咨询登记_咨询人地址
		String zxrdz = ExcelFile.readXls_x(filePath, sheetName, 11, 3);
		Base.sendKeys(driver, zxrdz, Base.bz(10));
		String zxrdzText = Base.getElementText(driver, zxrdz);
		ExcelFile.writeXls_x(filePath, sheetName,zxrdzText, 11, column);
//		业务处理_咨询登记_咨询人邮编
		String zxryb = ExcelFile.readXls_x(filePath, sheetName, 12, 3);
		Base.sendKeys(driver, zxryb, "123456");
		String zxrybText = Base.getElementText(driver, zxryb);
		ExcelFile.writeXls_x(filePath, sheetName,zxrybText, 12, column);
//		业务处理_咨询登记_咨询人电子邮箱
		String zxrdzyx = ExcelFile.readXls_x(filePath, sheetName, 13, 3);
		Base.sendKeys(driver, zxrdzyx, "376686807@qq.com");
		String zxrdzyxText = Base.getElementText(driver, zxrdzyx);
		ExcelFile.writeXls_x(filePath, sheetName,zxrdzyxText, 13, column);
//		业务处理_咨询登记_人员类别
		String rylb = ExcelFile.readXls_x(filePath, sheetName, 14, 3);
		Base.selectList(driver, rylb, rd.nextInt(4) + 1);
		String rylbText = Base.getElementText(driver, rylb);
		ExcelFile.writeXls_x(filePath, sheetName,rylbText, 14, column);
//		业务处理_咨询登记_人员身份
		String rysf = ExcelFile.readXls_x(filePath, sheetName, 15, 3);
		Base.selectList(driver, rysf, rd.nextInt(6) + 1);
		String rysfText = Base.getElementText(driver, rysf);
		ExcelFile.writeXls_x(filePath, sheetName,rysfText, 15, column);
//		业务处理_咨询登记_信息提供方类型
		String xxtgflx = ExcelFile.readXls_x(filePath, sheetName, 16, 3);
		Base.selectList(driver, xxtgflx, rd.nextInt(8) + 1);
		String xxtgflxText = Base.getElementText(driver, xxtgflx);
		ExcelFile.writeXls_x(filePath, sheetName,xxtgflxText, 16, column);
//		业务处理_咨询登记_信息来源
		String xxly = ExcelFile.readXls_x(filePath, sheetName, 17, 3);
		Base.selectList(driver, xxly, rd.nextInt(13) + 1);
		String xxlyText = Base.getElementText(driver, xxly);
		ExcelFile.writeXls_x(filePath, sheetName,xxlyText, 17, column);
//		业务处理_咨询登记_经营者名称
		String jyzmz = ExcelFile.readXls_x(filePath, sheetName, 18, 3);
		Base.sendKeys(driver, jyzmz, Base.bz(6));
		String jyzmzText = Base.getElementText(driver, jyzmz);
		ExcelFile.writeXls_x(filePath, sheetName,jyzmzText, 18, column);
//		业务处理_咨询登记_所在行业类别
		String szhylb = ExcelFile.readXls_x(filePath, sheetName, 19, 3);
		Base.selectList(driver, szhylb, rd.nextInt(19) + 1);
		String szhylbText = Base.getElementText(driver, szhylb);
		ExcelFile.writeXls_x(filePath, sheetName,szhylbText, 19, column);
//		业务处理_咨询登记_事发时间
		String sfsj = ExcelFile.readXls_x(filePath, sheetName, 20, 3);
		Base.sendKeys(driver, sfsj, "2019-07-17");
		String sfsjText = Base.getElementText(driver, sfsj);
		ExcelFile.writeXls_x(filePath, sheetName,sfsjText, 20, column);
//		业务处理_咨询登记_事发地
		String sfd = ExcelFile.readXls_x(filePath, sheetName, 21, 3);
		Base.sendKeys(driver, sfd, Base.bz(9));
		String sfdText = Base.getElementText(driver, sfd);
		ExcelFile.writeXls_x(filePath, sheetName,sfdText, 21, column);
//		业务处理_咨询登记_咨询内容
		String zxnr = ExcelFile.readXls_x(filePath, sheetName, 22, 3);
		Base.sendKeys(driver, zxnr, Base.bz(15));
		String zxnrText = Base.getElementText(driver, zxnr);
		ExcelFile.writeXls_x(filePath, sheetName,zxnrText, 22, column);
		if (rd.nextInt(100) > 49) {
//		业务处理_咨询登记_ 是否能当时回复(S)
			String sfndshf = ExcelFile.readXls_x(filePath, sheetName, 23, 3);
			Base.click(driver, sfndshf);
//		业务处理_咨询登记_答复内容
			String dfnr = ExcelFile.readXls_x(filePath, sheetName, 24, 3);
			Base.sendKeys(driver, dfnr, Base.bz(15));
			String dfnrText = Base.getElementText(driver, dfnr);
			ExcelFile.writeXls_x(filePath, sheetName,dfnrText, 24, column);
		} else {
//		业务处理_咨询登记_不能当时答复原因(S)
			String bndsdfyy = ExcelFile.readXls_x(filePath, sheetName, 25, 3);
			Base.selectList(driver, bndsdfyy, rd.nextInt(4) + 1);
			String bndsdfyyText = Base.getElementText(driver, bndsdfyy);
			ExcelFile.writeXls_x(filePath, sheetName,bndsdfyyText, 25, column);
		}
//		业务处理_咨询登记_关键字
		String gjz1 = ExcelFile.readXls_x(filePath, sheetName, 26, 3);
		Base.sendKeys(driver, gjz1, Base.bz(3));
		String gjz1Text = Base.getElementText(driver, gjz1);
		ExcelFile.writeXls_x(filePath, sheetName,gjz1Text, 26, column);
		String gjz2 = ExcelFile.readXls_x(filePath, sheetName, 27, 3);
		Base.sendKeys(driver, gjz2, Base.bz(3));
		String gjz2Text = Base.getElementText(driver, gjz2);
		ExcelFile.writeXls_x(filePath, sheetName,gjz2Text, 27, column);
		String gjz3 = ExcelFile.readXls_x(filePath, sheetName, 28, 3);
		Base.sendKeys(driver, gjz3, Base.bz(3));
		String gjz3Text = Base.getElementText(driver, gjz3);
		ExcelFile.writeXls_x(filePath, sheetName,gjz3Text, 28, column);
		String gjz4 = ExcelFile.readXls_x(filePath, sheetName, 29, 3);
		Base.sendKeys(driver, gjz4, Base.bz(3));
		String gjz4Text = Base.getElementText(driver, gjz4);
		ExcelFile.writeXls_x(filePath, sheetName,gjz4Text, 29, column);
//		业务处理_咨询登记_无效电话
		String wxdh = ExcelFile.readXls_x(filePath, sheetName, 30, 3);
		Base.click(driver, wxdh);
//		业务处理_咨询登记_咨询问题类别
		String zxwtlb = ExcelFile.readXls_x(filePath, sheetName, 33, 3);
		Base.selectList(driver, zxwtlb, rd.nextInt(4) + 1);
//		业务处理_咨询登记_咨询范围
		String zxfw = ExcelFile.readXls_x(filePath, sheetName, 34, 3);
//		业务处理_咨询登记_咨询基本问题
		String zxjbwt = ExcelFile.readXls_x(filePath, sheetName, 35, 3);
//		业务处理_咨询登记_商品（服务）类型
		String splx = ExcelFile.readXls_x(filePath, sheetName, 36, 3);
//		业务处理_咨询登记_咨询法规
		String zxfg = ExcelFile.readXls_x(filePath, sheetName, 37, 3);
		Base.sendKeys(driver, zxfg, Base.bz(6));
//		业务处理_咨询登记_商品进口标志
		String spjkbz = ExcelFile.readXls_x(filePath, sheetName, 38, 3);
		Base.selectList(driver, spjkbz, rd.nextInt(3) + 1);
//		业务处理_咨询登记_商品（服务）名称
		String spmc = ExcelFile.readXls_x(filePath, sheetName, 39, 3);
		Base.sendKeys(driver, spmc, Base.bz(7));
//		业务处理_咨询登记_商标
		String sb = ExcelFile.readXls_x(filePath, sheetName, 40, 3);
		Base.sendKeys(driver, sb, Base.bz(2));
//		业务处理_咨询登记_型号规格
		String xhgg = ExcelFile.readXls_x(filePath, sheetName, 41, 3);
		Base.sendKeys(driver, xhgg, Base.bz(2));
//		业务处理_咨询登记_提交
//		String tj = ExcelFile.readXls_x(filePath, sheetName, 43, 3);

	}

}
