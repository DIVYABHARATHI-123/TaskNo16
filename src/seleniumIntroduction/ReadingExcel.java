package seleniumIntroduction;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) throws IOException {

		File src = new File("Utils\\Students.xlsx"); // Referring to the file to read and write

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook Workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet1 = Workbook.getSheetAt(0);

		int size=sheet1.getLastRowNum();
		
		for(int i=0;i<=size;i++) {
		
			String data=sheet1.getRow(i).getCell(0).getStringCellValue();
		
			System.out.println(data);
		}		

	}

}
