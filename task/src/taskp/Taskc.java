package taskp;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Taskc {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		  File src =    new File("D:\\selenuim\\OSHlogins.xlsx");

		    FileInputStream fis = new FileInputStream(src);
		    XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1=wb.getSheetAt(0);
		
		/*String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from excel is "+data0);
		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel is "+data1);
		
		int row=sheet1.getLastRowNum()-sheet1.getFirstRowNum();
		System.out.println(row);*/
		
			for(int i=1;i<=sheet1.getLastRowNum();i++)
				{
					//double serial=sheet1.getRow(i).getCell(0).getNumericCellValue();
					String user=sheet1.getRow(i).getCell(1).getStringCellValue();
					String pass=sheet1.getRow(i).getCell(2).getStringCellValue();
					System.out.println(user + "			" +pass);
				
				}
		
		}


	}

