package Driver;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.SpreadsheetVersion;
import org.apache.poi.ss.formula.udf.UDFFinder;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.CreationHelper;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.Name;
import org.apache.poi.ss.usermodel.PictureData;
import org.apache.poi.ss.usermodel.Row.MissingCellPolicy;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.SheetVisibility;
import org.apache.poi.ss.usermodel.Workbook;

public class XSSFWorkbook implements Workbook {

	public XSSFWorkbook(FileInputStream in) {
		
		// TODO Auto-generated constructor stub
	}

	public Iterator<Sheet> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public int addOlePackage(byte[] arg0, String arg1, String arg2, String arg3) throws IOException {
		// TODO Auto-generated method stub
		return 0;
	}

	public int addPicture(byte[] arg0, int arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void addToolPack(UDFFinder arg0) {
		// TODO Auto-generated method stub

	}

	public Sheet cloneSheet(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public void close() throws IOException {
		// TODO Auto-generated method stub

	}

	public CellStyle createCellStyle() {
		// TODO Auto-generated method stub
		return null;
	}

	public DataFormat createDataFormat() {
		// TODO Auto-generated method stub
		return null;
	}

	public Font createFont() {
		// TODO Auto-generated method stub
		return null;
	}

	public Name createName() {
		// TODO Auto-generated method stub
		return null;
	}

	public Sheet createSheet() {
		// TODO Auto-generated method stub
		return null;
	}

	public Sheet createSheet(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Font findFont(boolean arg0, short arg1, short arg2, String arg3, boolean arg4, boolean arg5, short arg6,
			byte arg7) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getActiveSheetIndex() {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<? extends Name> getAllNames() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<? extends PictureData> getAllPictures() {
		// TODO Auto-generated method stub
		return null;
	}

	public CellStyle getCellStyleAt(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public CreationHelper getCreationHelper() {
		// TODO Auto-generated method stub
		return null;
	}

	public int getFirstVisibleTab() {
		// TODO Auto-generated method stub
		return 0;
	}

	public Font getFontAt(short arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean getForceFormulaRecalculation() {
		// TODO Auto-generated method stub
		return false;
	}

	public MissingCellPolicy getMissingCellPolicy() {
		// TODO Auto-generated method stub
		return null;
	}

	public Name getName(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Name getNameAt(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getNameIndex(String arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<? extends Name> getNames(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getNumCellStyles() {
		// TODO Auto-generated method stub
		return 0;
	}

	public short getNumberOfFonts() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getNumberOfNames() {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getNumberOfSheets() {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getPrintArea(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Sheet getSheet(String arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public Sheet getSheetAt(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getSheetIndex(String arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int getSheetIndex(Sheet arg0) {
		// TODO Auto-generated method stub
		return 0;
	}

	public String getSheetName(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public SheetVisibility getSheetVisibility(int arg0) {
		// TODO Auto-generated method stub
		return null;
	}

	public SpreadsheetVersion getSpreadsheetVersion() {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean isHidden() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSheetHidden(int arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean isSheetVeryHidden(int arg0) {
		// TODO Auto-generated method stub
		return false;
	}

	public int linkExternalWorkbook(String arg0, Workbook arg1) {
		// TODO Auto-generated method stub
		return 0;
	}

	public void removeName(int arg0) {
		// TODO Auto-generated method stub

	}

	public void removeName(String arg0) {
		// TODO Auto-generated method stub

	}

	public void removeName(Name arg0) {
		// TODO Auto-generated method stub

	}

	public void removePrintArea(int arg0) {
		// TODO Auto-generated method stub

	}

	public void removeSheetAt(int arg0) {
		// TODO Auto-generated method stub

	}

	public void setActiveSheet(int arg0) {
		// TODO Auto-generated method stub

	}

	public void setFirstVisibleTab(int arg0) {
		// TODO Auto-generated method stub

	}

	public void setForceFormulaRecalculation(boolean arg0) {
		// TODO Auto-generated method stub

	}

	public void setHidden(boolean arg0) {
		// TODO Auto-generated method stub

	}

	public void setMissingCellPolicy(MissingCellPolicy arg0) {
		// TODO Auto-generated method stub

	}

	public void setPrintArea(int arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	public void setPrintArea(int arg0, int arg1, int arg2, int arg3, int arg4) {
		// TODO Auto-generated method stub

	}

	public void setSelectedTab(int arg0) {
		// TODO Auto-generated method stub

	}

	public void setSheetHidden(int arg0, boolean arg1) {
		// TODO Auto-generated method stub

	}

	public void setSheetHidden(int arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	public void setSheetName(int arg0, String arg1) {
		// TODO Auto-generated method stub

	}

	public void setSheetOrder(String arg0, int arg1) {
		// TODO Auto-generated method stub

	}

	public void setSheetVisibility(int arg0, SheetVisibility arg1) {
		// TODO Auto-generated method stub

	}

	public Iterator<Sheet> sheetIterator() {
		// TODO Auto-generated method stub
		return null;
	}

	public void write(OutputStream arg0) throws IOException {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
