package CucumP;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataConfig {
	XSSFWorkbook wb;
	  XSSFSheet s;
		public ExcelDataConfig(String excelpath) throws IOException {
			// TODO Auto-generated constructor stub
			 
				  File src =    new File(excelpath);

				      FileInputStream fis = new FileInputStream(src);
				       wb = new XSSFWorkbook(fis);
				  

			
			
			
		}

		public int getRowcount(int SheetIndex) {
			// TODO Auto-generated method stub
			int row = wb.getSheetAt(SheetIndex).getLastRowNum();
			row = row+1;
			return row;
			
			
		}

		public Object getData(int sheetNumber, int row, int column) {
			// TODO Auto-generated method stub
			  s=wb.getSheetAt(sheetNumber);
			  String data=s.getRow(row).getCell(column).getStringCellValue();
			  return data;
			
		}
}
