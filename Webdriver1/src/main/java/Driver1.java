import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;


//import com.sun.rowset.internal.Row;
import com.sun.rowset.internal.Row.*;

import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;

import Driver.XSSFWorkbook;

public class Driver1 {
	public  static void main(String args[]) throws Exception {
		 File src =    new File("D:\\selenuim\\OSHlogins.xlsx");
		 FileInputStream fis = new FileInputStream(src);
		    XSSFWorkbook wb = new XSSFWorkbook(fis);
		Sheet sheet1=wb.getSheetAt(0);
		String data0=sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println("Data from excel is "+data0);
		String data1=sheet1.getRow(0).getCell(1).getStringCellValue();
		System.out.println("Data from excel is "+data1);
		
		
		
	}

	/*public void  read() throws IOException {
		
		
		FileInputStream in=new FileInputStream("D:\\selenuim\\OSHlogins.xlsx");
		//Workbook w=null;
	   XSSFWorkbook w=new XSSFWorkbook(in);
	   Sheet s1=w.getSheet("Sheet1");
	    int row=s1.getLastRowNum()-s1.getFirstRowNum();
	    for(int i=0;i<row+1;i++) 
	    {
	    	Cell cell=s1.getRow(i).getCell(0);
	    	String text="";
	    	text=cell.getStringCellValue();	
	    }
	    
	    input.close();
		
		FileOutputStream output=new FileOutputStream("");
	    
	    System.out.println(row);
		
	}*/
	
	
}