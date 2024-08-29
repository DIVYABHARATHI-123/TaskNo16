package seleniumIntroduction;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) throws IOException {
		
		
		File src=new File("Utils\\Info.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		XSSFSheet sheet=workbook.createSheet("Sheet1");
		
		XSSFRow heading=sheet.createRow(0); 
		heading.createCell(0).setCellValue("EmpName");
		heading.createCell(1).setCellValue("Age");
		heading.createCell(2).setCellValue("Deparment");
		
		
		XSSFRow data1=sheet.createRow(1); 
		data1.createCell(0).setCellValue("Divya");
		data1.createCell(1).setCellValue("27");
		data1.createCell(2).setCellValue("IT");
		
		XSSFRow data2=sheet.createRow(2); 
		data2.createCell(0).setCellValue("Ziya");
		data2.createCell(1).setCellValue("25");
		data2.createCell(2).setCellValue("IT");
		
		
		FileOutputStream fis=new FileOutputStream(src);
		workbook.write(fis);
		
	}

}
