package excel;

import myStudy.file.ExcelFile;

public class Hb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "H:\\Desktop\\test\\上海测试进度10.24.xls";
		String sheetName = "问题列表";
		for(int x = 2;x<107;x++) {
			String nr = "" ;
			for(int y=3;y<6;y++) {
				String rNr = ExcelFile.readXls_x(filePath, sheetName, x, y);
				if(rNr != null) {
					nr = nr+rNr +"-》";
				}else {
					continue;
				}
			}
			if(nr.length()>0) {
				nr = nr.substring(0, nr.length()-2);
			}
			System.out.println("第"+x+"行："+nr);
			ExcelFile.writeXls_x(filePath, sheetName, nr, x, 8);
		}
	}

}
