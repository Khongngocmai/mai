package exercise2;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.microsoft.schemas.office.visio.x2012.main.CellType;




public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Workbook  workBook = new XSSFWorkbook();
		
		Sheet sheet = workBook.createSheet("Studnets");
		
		createHeader (workBook , sheet, 0);
		
		List<Students> students = new ArrayList<>();
		students.add(new Students("Student 1",1,7,74,23,75,55,51));
		students.add(new Students("Student 2",73,17,5,52,18,26,26));
		students.add(new Students("Student 3",27,29,29,35,96,17,45));
		
		int rowIndex = 1;
		for(Students f : students) {
			createFullnameToEXcel(f, sheet, rowIndex);
			rowIndex++;
		
			
		}
		workBook.write(new FileOutputStream("./src/main/resources/students.xlsx"));
		
	}
	public static CellStyle createStyleForHeader (Workbook workbook) {
		CellStyle cellStyle = workbook.createCellStyle();
		cellStyle.setFillForegroundColor(IndexedColors.LIGHT_BLUE.getIndex());
		cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		return cellStyle;
	}
	 
	public static void createHeader(Workbook workBook, Sheet sheet, int rowIndex) {
		
		Row students = sheet.createRow(rowIndex);
		
		
		Cell Students = students.createCell(0);
		Students.setCellValue("Students");
		
		
		Cell Paper1 = students.createCell(1);
		Paper1.setCellValue("Paper1");
		Paper1.setCellStyle(createStyleForHeader(workBook));
		
		Cell Paper2 = students.createCell(2);
		Paper2.setCellValue("Paper2");
		Paper2.setCellStyle(createStyleForHeader(workBook));
		
		Cell Paper3 = students.createCell(3);
		Paper3.setCellValue("Paper3");
		Paper3.setCellStyle(createStyleForHeader(workBook));
		
		Cell Paper4 = students.createCell(4);
		Paper4.setCellValue("Paper4");
		Paper4.setCellStyle(createStyleForHeader(workBook));
		
		Cell Paper5 = students.createCell(5);
		Paper5.setCellValue("Paper5");
		Paper5.setCellStyle(createStyleForHeader(workBook));
		
		Cell Paper6 = students.createCell(6);
		Paper6.setCellValue("Paper6");
		Paper6.setCellStyle(createStyleForHeader(workBook));
		
		Cell Paper7 = students.createCell(7);
		Paper7.setCellValue("Paper7");
		Paper7.setCellStyle(createStyleForHeader(workBook));
		
		Cell Total = students.createCell(8);
		Total.setCellValue("Total");
		Total.setCellStyle(createStyleForHeader(workBook));
		
	}
	
	private static void createFullnameToEXcel(Students students,Sheet sheet,int rowIndex) {
		
		Row rowstudents = sheet.createRow(rowIndex);
		
		
		Cell Students = rowstudents.createCell(0);
		Students.setCellValue(students.getStudent());
				
		Cell Paper1 = rowstudents.createCell(1);
		Paper1.setCellValue(students.getPaper1());
		
		
		Cell Paper2 = rowstudents.createCell(2);
		Paper2.setCellValue(students.getPaper2());
		
		
		Cell Paper3 = rowstudents.createCell(3);
		Paper3.setCellValue(students.getPaper3());
	
		
		Cell Paper4 = rowstudents.createCell(4);
		Paper4.setCellValue(students.getPaper4());
		
		
		Cell Paper5 = rowstudents.createCell(5);
		Paper5.setCellValue(students.getPaper5());
		
		
		Cell Paper6 = rowstudents.createCell(6);
		Paper6.setCellValue(students.getPaper6());
		
		Cell Paper7 = rowstudents.createCell(7);
		Paper7.setCellValue(students.getPaper7());
		
		
		Cell Total  = rowstudents.createCell(8);
		Total.setCellFormula("B"+(rowIndex+1) +"+ C" +(rowIndex +1)+ " + D"+(rowIndex +1)+ "+ E"+(rowIndex + 1)+ "+ F"+(rowIndex + 1)
				+"+ G"+(rowIndex +1)+"+ H"+(rowIndex +1));
	}
}
