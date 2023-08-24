package exercise1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		
		Workbook  workBook = new XSSFWorkbook();
		
		Sheet sheet = workBook.createSheet("Fullname");
		
		createHeader (workBook , sheet, 0);
		
		List<Fullname> fullname = new ArrayList<>();
		fullname.add(new Fullname(1,"Amit","Shulka"));
		fullname.add(new Fullname(2,"Lokesh","Gupta"));
		fullname.add(new Fullname(3,"John","Adwards"));
		int rowIndex = 1;
		
		for(Fullname f : fullname) {
			createFullnameToEXcel(f, sheet, rowIndex);
			rowIndex++;
		}
	
		workBook.write(new FileOutputStream("./src/main/resources/fullname.xlsx"));
	}

	public static void createHeader (Workbook workBook,Sheet sheet, int rowIndex) {
		
		Row fullname = sheet.createRow(rowIndex);
		
		Cell id = fullname.createCell(0);
		id.setCellValue("ID");
		//id.setCellStyle(createStyleForHeader(workBook));
		
		Cell name  = fullname.createCell(1);
		name.setCellValue("Name");
		//name.setCellStyle(createStyleForHeader(workBook));
		
//		CellStyle cellStyle = workBook.createCellStyle();
//		cellStyle.setFillForegroundColor(IndexedColors.LIGHT_YELLOW.getIndex());
//		cellStyle.setFillPattern(FillPatternType.SOLID_FOREGROUND);
		
		Cell lastname = fullname.createCell(2);
		lastname.setCellValue("Lastname");
		//lastname.setCellStyle(cellStyle);
		
		
	}
	private static void createFullnameToEXcel(Fullname fullname,Sheet sheet,int rowIndex) {
		
		Row rowfullname = sheet.createRow(rowIndex);
	
		
		Cell id = rowfullname.createCell(0);
		id.setCellValue(fullname.getId());
		
		
		Cell name  = rowfullname.createCell(1);
		name.setCellValue(fullname.getName());
		
		
		Cell lastname = rowfullname.createCell(2);
		lastname.setCellValue(fullname.getLastname());

		
	}
}
