package Consumer1215;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import base.Base;
import myStudy.file.ExcelFile;

public class Tsdj_Zsdj {
//	static  String userName = "黄浦";
//	static  int No = 10;	
	public static  void register(WebDriver driver,int dataSource,int managerCategory,String userName,int userNo) throws Exception {
		String filePath = "C:\\userInfo.xlsx";
		String sheetName = "正式登记";
		Random rd = new Random();
//		业务处理
		String YWCL = ExcelFile.readXls_x(filePath, sheetName, 2, 7);
		Base.clickId(driver, YWCL);
//		投诉登记
		String YWCL_Tsdj = ExcelFile.readXls_x(filePath, sheetName, 3, 7);
		Base.clickId(driver, YWCL_Tsdj);

//		正式登记
		String YWCL_Tsdj_zsdj = ExcelFile.readXls_x(filePath, sheetName, 4, 7);
		Base.clickId(driver, YWCL_Tsdj_zsdj);
//		切换iframe	
		String iframeXpath = "//*[@id=\"mainFrame\"]";
		driver = Base.switchFrame(driver, iframeXpath);
//		消费者信息
		String A = ExcelFile.readXls_x(filePath, sheetName, 5, 7);
		Base.click(driver, A);
		
		System.out.println("start1");
//		接收方式
		String A_jsfs = ExcelFile.readXls_x(filePath, sheetName, 6, 7);
		Base.selectList(driver, A_jsfs, rd.nextInt(10));
//		事件级别
		String A_sjjb = ExcelFile.readXls_x(filePath, sheetName, 7, 7);
		Base.selectList(driver, A_sjjb, rd.nextInt(3));
//		消费者姓名
		String A_xfzxm = ExcelFile.readXls_x(filePath, sheetName, 8, 7);
//		Base.sendKeys(driver, A_xfzxm, Base.bz(3));
		Base.sendKeys(driver, A_xfzxm,  userName + userNo);
//		消费者性别
		String A_xfzxb = ExcelFile.readXls_x(filePath, sheetName, 9, 7);
		Base.selectList(driver, A_xfzxb, rd.nextInt(2) + 1);
//		是否二次以上投诉
		String A_sfecysts = ExcelFile.readXls_x(filePath, sheetName, 10, 7);
		Base.selectList(driver, A_sfecysts, rd.nextInt(2) + 1);
//		消费者年龄
		String A_xfznl = ExcelFile.readXls_x(filePath, sheetName, 11, 7);
		Base.sendKeys(driver, A_xfznl, String.valueOf(rd.nextInt(20) + 20));
//		类别
		String A_lb = ExcelFile.readXls_x(filePath, sheetName, 12, 7);
		Base.selectList(driver, A_lb, rd.nextInt(6) + 1);
		System.out.println("start2");
//		身份
		String A_sf = ExcelFile.readXls_x(filePath, sheetName, 13, 7);
		Base.selectList(driver, A_sf, rd.nextInt(5) + 1);
//		消费者地址
		String A_xfzdz = ExcelFile.readXls_x(filePath, sheetName, 14, 7);
		Base.sendKeys(driver, A_xfzdz, Base.bz(10));
		System.out.println("start3");
//		消费者邮编
		String A_xfzyb = ExcelFile.readXls_x(filePath, sheetName, 15, 7);
		driver.findElement(By.xpath(A_xfzyb)).clear();
		Base.sendKeys(driver, A_xfzyb, String.valueOf((rd.nextInt(9) + 1) * 100000 + rd.nextInt(99999)));
//		消费者联系方式
		String A_xfzlxfs = ExcelFile.readXls_x(filePath, sheetName, 16, 7);
		Base.sendKeys(driver, A_xfzlxfs, "14326987101");
//		固定电话
		String A_gddh = ExcelFile.readXls_x(filePath, sheetName, 17, 7);
		Base.sendKeys(driver, A_gddh, "0745-265489");
		System.out.println("start4");
//		消费者邮箱
		String A_xfzyx = ExcelFile.readXls_x(filePath, sheetName, 18, 7);
		Base.sendKeys(driver, A_xfzyx, "123645@qq.com");
//		消费者身份证号
		String A_xfzsfzh = ExcelFile.readXls_x(filePath, sheetName, 19, 7);
		Base.sendKeys(driver, A_xfzsfzh, "125478903105492178");

		Thread.sleep(1500);

//		来源及被诉单位
		String B = ExcelFile.readXls_x(filePath, sheetName, 20, 7);
		Base.click(driver, B);
//		来源
		String B_ly = ExcelFile.readXls_x(filePath, sheetName, 21, 7);
		Base.selectList(driver,B_ly,dataSource);
		
		switch (dataSource) {
		case 0:// 直接到12315
			break;
		case 1://上级交办
//		来源机关
			String B_lyjg = ExcelFile.readXls_x(filePath, sheetName, 24, 7);
			Base.selectList(driver,B_lyjg,rd.nextInt(5)+1);
//		信访来案编号
			String B_xflabh = ExcelFile.readXls_x(filePath, sheetName, 25, 7);
			Base.sendKeys(driver, B_xflabh, Base.bz(15));
//		来源联系人
			String B_lylxr = ExcelFile.readXls_x(filePath, sheetName, 26, 7);
			Base.sendKeys(driver, B_lylxr, Base.bz(3));
//		电话
			String B_dh = ExcelFile.readXls_x(filePath, sheetName, 27, 7);
			Base.sendKeys(driver, B_dh, "13518694698");
//		领导批示
			String B_ldps = ExcelFile.readXls_x(filePath, sheetName, 28, 7);
			Base.sendKeys(driver, B_ldps, Base.bz(15));
			break;
		case 2://部门转办
//		来源机关
			String B_lyjg2 = ExcelFile.readXls_x(filePath, sheetName, 30, 7);
			Base.selectList(driver,B_lyjg2,rd.nextInt(71)+1);
//		信访来案编号
			String B_xflabh2 = ExcelFile.readXls_x(filePath, sheetName, 31, 7);
			Base.sendKeys(driver, B_xflabh2, Base.bz(15));
//		来源联系人
			String B_lylxr2 = ExcelFile.readXls_x(filePath, sheetName, 32, 7);
			Base.sendKeys(driver, B_lylxr2, Base.bz(3));
//		电话
			String B_dh2 = ExcelFile.readXls_x(filePath, sheetName, 33, 7);
			Base.sendKeys(driver, B_dh2, "13518694695");
//		领导批示
			String B_ldps2 = ExcelFile.readXls_x(filePath, sheetName, 34, 7);
			Base.sendKeys(driver, B_ldps2, Base.bz(16));
			break;
		case 3://其他
//		来源部门
			String B_lybm = ExcelFile.readXls_x(filePath, sheetName, 36, 7);
			Base.sendKeys(driver, B_lybm, Base.bz(6));
			break;
		case 4://12345
//		12345工单编号
			String B_12345gdbh = ExcelFile.readXls_x(filePath, sheetName, 38, 7);
			Base.sendKeys(driver, B_12345gdbh, "S12345"+Base.bz(6));
//		12345工单来源
			String B_12345gdly = ExcelFile.readXls_x(filePath, sheetName, 39, 7);
			break;
		default:
			break;
		}
//		来源日期
		String B_lyrq = ExcelFile.readXls_x(filePath, sheetName, 41, 7);
//		System.out.println("来源日期："+1);
//		driver.findElement(By.xpath(B_lyrq)).clear();
//		System.out.println("来源日期："+2);
//		Base.sendKeys(driver, B_lyrq, "2019-07-18");
//		System.out.println("来源日期："+3);
//		经营者类别
		String B_jyzlb = ExcelFile.readXls_x(filePath, sheetName, 42, 7);
		System.out.println("经营者类别："+B_jyzlb);
		Base.selectList(driver, B_jyzlb, managerCategory);
		System.out.println("经营者类别：111111111111111");
		String currentWindowHandle = null;
		String cxXpath = null;
		String first = null;
		switch(managerCategory) {
		case 5://个体工商户
			System.out.println("个体工商户");
//			选择按钮
			String B_xzan5 = "//input[@name='queryButton']";
			currentWindowHandle = driver.getWindowHandle();
			Base.switchWindow(driver, B_xzan5);
//			字号
			String zhXpath = "//input[@name='keyName']";
			Base.sendKeys(driver, zhXpath, "上海黄浦区富荣鞋业经营部");
			cxXpath = "//input[@name='button2']";
			Base.click(driver, cxXpath);
			driver.switchTo().frame("frame1");
			first = "//tbody/tr[1]/td[1]/input";
			Base.click(driver, first);
			driver.switchTo().window(currentWindowHandle);
			driver = Base.switchFrame(driver, iframeXpath);
			break;
		case 6://自然人
			break;
		case 7://其他
			break;
		default:
			System.out.println("企业");
//			联网单位
			String B_lwdw = ExcelFile.readXls_x(filePath, sheetName, 43, 5);
			Base.click(driver, B_lwdw);
//			选择按钮
			String B_xzan = "//input[@name='queryButton']";
			currentWindowHandle = driver.getWindowHandle();
			Base.switchWindow(driver, B_xzan);
			String dwmcXpath = "//input[@name='organName']";
			Base.sendKeys(driver, dwmcXpath, "上海安能聚创供应链管理有限公司");
			cxXpath = "//input[@name='button2']";
			Base.click(driver, cxXpath);
			driver.switchTo().frame("frame1");
			first = "//tbody/tr[1]/td[1]/input";
			Base.click(driver, first);
			driver.switchTo().window(currentWindowHandle);
			driver = Base.switchFrame(driver, iframeXpath);
			break;
		}

//		经营者名称
		String B_jyzmc = ExcelFile.readXls_x(filePath, sheetName, 50, 7);
		
//		经营者电话
		String B_jyzdh = ExcelFile.readXls_x(filePath, sheetName, 51, 7);
		driver.findElement(By.xpath(B_jyzdh)).clear();
		Base.sendKeys(driver, B_jyzdh, "13456789200");
//		经营者邮编
		String B_jyzyb = ExcelFile.readXls_x(filePath, sheetName, 52, 7);
//		经营者联系人
		String B_jyzlxr = ExcelFile.readXls_x(filePath, sheetName, 53, 7);
		driver.findElement(By.xpath(B_jyzlxr)).clear();
		Base.sendKeys(driver, B_jyzlxr, "test安能");
//		经营者实际地址
		String B_jyzsjdz = ExcelFile.readXls_x(filePath, sheetName, 54, 7);
//		发生时间
		System.out.println("driver:"+driver);
		System.out.println("发生时间！！");
		String B_fssj = ExcelFile.readXls_x(filePath, sheetName, 55, 7);
		Base.sendKeys(driver, B_fssj, "2019-07-10");
		Base.click(driver, B_lyrq);
		
//		来源 
//		String B_Ly = "//*[@id=\"newsContent\"]/tbody/tr[1]/td/div";
//		WebElement WB_Ly = driver.findElement(By.xpath(B_Ly));
//		new Actions(driver).contextClick(WB_Ly);
//		所属区划
		String B_ssqh = ExcelFile.readXls_x(filePath, sheetName, 56, 7);
//		商业中心
		String B_syzx = ExcelFile.readXls_x(filePath, sheetName, 57, 7);
		Base.click(driver, B_syzx);
//		所属商业中心
		String B_sssyzx = ExcelFile.readXls_x(filePath, sheetName, 58, 7);
		Base.selectList(driver, B_sssyzx, rd.nextInt(31)+1);
//		销售方式
		System.out.println("销售方式");
		String B_xsfs = ExcelFile.readXls_x(filePath, sheetName, 59, 7);
		Base.selectList(driver, B_xsfs, rd.nextInt(12)+1);
//		经营者注册地址
		String B_jyzzcdz = ExcelFile.readXls_x(filePath, sheetName, 60, 7);
		
		Thread.sleep(1500);
		
//		具体信息
		String C = ExcelFile.readXls_x(filePath, sheetName, 61, 7);
		Base.click(driver, C);
//		商品（服务）类型
		String C_splx = ExcelFile.readXls_x(filePath, sheetName, 62, 7);
		WebDriver driver2 = Base.switchWindow(driver, C_splx);
		String C_splx_srk = "//*[@id=\"goodsName\"]";
		Base.sendKeys(driver2, C_splx_srk, "减肥");
		String C_splx_cx = "/html/body/table/tbody/tr[1]/td[1]/table/tbody/tr[1]/td/input[2]";
		Base.click(driver2, C_splx_cx);
		String C_splx_cxjg = "//*[@id=\"goods\"]/option[1]";
		Base.click(driver2, C_splx_cxjg);
		Thread.sleep(3000);
		String C_splx_qd = "//*[@id=\"btnConfirm\"]";
		Base.click(driver2, C_splx_qd);
		driver.switchTo().window(currentWindowHandle);
		driver = Base.switchFrame(driver, iframeXpath);
//		商品（服务）类型（Z）
		String C_splx2 = ExcelFile.readXls_x(filePath, sheetName, 67, 7);
		WebDriver driver3 = Base.switchWindow(driver, C_splx2);
		String C_splx2_srk = "//*[@id=\"goodsName\"]";
		Base.sendKeys(driver3, C_splx2_srk, "减肥");
		String C_splx2_cx = "/html/body/table/tbody/tr[1]/td[1]/table/tbody/tr[1]/td/input[2]";
		Base.click(driver3, C_splx2_cx);
		String C_splx2_cxjg = "//*[@id=\"goods\"]/option[1]";
		Base.click(driver3, C_splx2_cxjg);
		Thread.sleep(3000);
		String C_splx2_qd = "//*[@id=\"btnConfirm\"]";
		Base.click(driver3, C_splx2_qd);
		driver.switchTo().window(currentWindowHandle);
		driver = Base.switchFrame(driver, iframeXpath);
//		商品（服务）名称
		String C_spmc = ExcelFile.readXls_x(filePath, sheetName, 73, 7);
//		涉及金额
		String je = String.valueOf(rd.nextInt(10000)+1000);
		String C_sjje = ExcelFile.readXls_x(filePath, sheetName, 74, 7);
		Base.sendKeys(driver, C_sjje, je);
//		品牌名称
		String C_ppmc = ExcelFile.readXls_x(filePath, sheetName, 75, 7);
		String C_ppmc_cxk = ExcelFile.readXls_x(filePath, sheetName, 76, 7);
//		国产/进口
		String C_gcjk = ExcelFile.readXls_x(filePath, sheetName, 77, 7);
//		消费日期
		String C_xfrq = ExcelFile.readXls_x(filePath, sheetName, 78, 7);
		Base.sendKeys(driver, C_xfrq, "2019-07-10");
//		点击品牌名称的查询框
		Base.click(driver, C_ppmc_cxk);
//		凭证号码
		String C_pzhm = ExcelFile.readXls_x(filePath, sheetName, 79, 7);
		Base.sendKeys(driver, C_pzhm, "pz100"+rd.nextInt(100000));
		
//		投诉基本问题 //*[@id="newsContent"]/tbody/tr[6]/td[2]/input[2]
		String C_tsjbwt = ExcelFile.readXls_x(filePath, sheetName, 80, 7);
		
		WebDriver driver4 = Base.switchWindow(driver, C_tsjbwt);
		Thread.sleep(3000);
//		大类
		System.out.println("*******_1_***********");
		String C_tsjbwt_dl = ExcelFile.readXls_x(filePath, sheetName, 81, 7);
		Base.selectList(driver4, C_tsjbwt_dl, 7);
		System.out.println("*******_2_***********");
//		中类
		String C_tsjbwt_zl = ExcelFile.readXls_x(filePath, sheetName, 82, 7);
		Base.selectList(driver4, C_tsjbwt_zl, 1);
//		确定
		String C_tsjbwt__qd = ExcelFile.readXls_x(filePath, sheetName, 84, 7);
		Base.click(driver4, C_tsjbwt__qd);
		driver.switchTo().window(currentWindowHandle);
		driver = Base.switchFrame(driver, iframeXpath);
		
//		投诉基本问题（Z）
		String C_tsjbwt2 = ExcelFile.readXls_x(filePath, sheetName, 86, 7);
		WebDriver driver5 = Base.switchWindow(driver, C_tsjbwt2);
		Thread.sleep(3000);
//		投诉性质分类
		String C_tsjbwt2_tsxzfl = ExcelFile.readXls_x(filePath, sheetName, 87, 7);
		Base.selectList(driver5, C_tsjbwt2_tsxzfl, 6);
//		投诉性质细类
		String C_tsjbwt2_tsxzxl = ExcelFile.readXls_x(filePath, sheetName, 88, 7);
		Base.selectList(driver5, C_tsjbwt2_tsxzxl, 3);
//		确定
		String C_tsjbwt2_qr = ExcelFile.readXls_x(filePath, sheetName, 89, 7);
		Base.click(driver5, C_tsjbwt2_qr);
		driver.switchTo().window(currentWindowHandle);
		driver = Base.switchFrame(driver, iframeXpath);
//		投诉具体问题
		String C_tsjtwt = ExcelFile.readXls_x(filePath, sheetName, 91, 7);
		Base.sendKeys(driver, C_tsjtwt, Base.bz(30));
//		财产损失金额
		String C_ccssje = ExcelFile.readXls_x(filePath, sheetName, 92, 7);
		Base.sendKeys(driver, C_ccssje, je);
//      重大投诉
		if(rd.nextInt(20)>18) {
//			是否重大投诉
			String C_sfzdts = ExcelFile.readXls_x(filePath, sheetName, 93, 7);
			Base.click(driver, C_sfzdts);
//			重大投诉类型
			String C_zdtslx = ExcelFile.readXls_x(filePath, sheetName, 94, 7);
			Base.selectList(driver, C_zdtslx, rd.nextInt(13)+1);
//			批示日期
			String C_psrq = ExcelFile.readXls_x(filePath, sheetName, 95, 7);
			Base.sendKeys(driver, C_psrq, "2019-07-11");
//			受害人数
			String C_shrs = ExcelFile.readXls_x(filePath, sheetName, 96, 7);
			Base.click(driver, C_shrs);
			Base.sendKeys(driver, C_shrs, String.valueOf(rd.nextInt(5)+1));
//			重要批示
			String C_zyps = ExcelFile.readXls_x(filePath, sheetName, 97, 7);
			Base.sendKeys(driver, C_zyps, Base.bz(11));
//			初审日期
			String C_csrq = ExcelFile.readXls_x(filePath, sheetName, 98, 7);
			Base.sendKeys(driver, C_csrq, "2019-07-11");
//			初审意见
			String C_csyj = ExcelFile.readXls_x(filePath, sheetName, 99, 7);
			Base.sendKeys(driver, C_csyj, "同意，抓紧办理！");
//			备注
			String C_bz = ExcelFile.readXls_x(filePath, sheetName, 100, 7);
			Base.sendKeys(driver, C_bz, Base.bz(20));
		}
//		关键词
		String C_gjc1 = ExcelFile.readXls_x(filePath, sheetName, 101, 7);
		Base.sendKeys(driver, C_gjc1, Base.bz(3));
		String C_gjc2 = ExcelFile.readXls_x(filePath, sheetName, 102, 7);
		Base.sendKeys(driver, C_gjc2, Base.bz(3));
		String C_gjc3 = ExcelFile.readXls_x(filePath, sheetName, 103, 7);
		Base.sendKeys(driver, C_gjc3, Base.bz(3));
		String C_gjc4 = ExcelFile.readXls_x(filePath, sheetName, 104, 7);
		Base.sendKeys(driver, C_gjc4, Base.bz(3));
		
		Thread.sleep(1500);
		
	
//		处理流程
		System.out.println("*******_1.1_********");
		String D = ExcelFile.readXls_x(filePath, sheetName, 105, 7);
		Base.click(driver, D);
		System.out.println("*******_2.2_********");
//		经办结果
		int rs = rd.nextInt(2)+1;
		String D_jbjg = ExcelFile.readXls_x(filePath, sheetName, 106, 7);
		Base.selectList(driver,D_jbjg, 2);
		System.out.println("*******_3.3_********");
//		经办人意见
		String idea = null ;
		String D_jbryj = ExcelFile.readXls_x(filePath, sheetName, 107, 7);
		if(rs== 9) {
			idea = "正式登记 : 登记中";
		}else {
			idea = "正式登记 : 登记完毕";
		}
		Base.sendKeys(driver, D_jbryj, idea);
		System.out.println("*******_4.4_********");
//		提交
		String D_tj = ExcelFile.readXls_x(filePath, sheetName, 108, 7);
		Base.click(driver, D_tj);
		
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
//		投诉登记
		Base.clickId(driver, YWCL_Tsdj);
//		业务处理
		Base.clickId(driver, YWCL);
		
	}
}


