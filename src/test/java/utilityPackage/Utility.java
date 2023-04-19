package utilityPackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import basePackage.BaseClass;

public class Utility extends BaseClass {
	
	public static void takeScreenshot(String Tcname) throws IOException {
		
		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		File dest = new File("C:\\Users\\hp\\Desktop\\All Testing\\bug Screenshot\\selenium SS\\"+Tcname+".png");
		FileHandler.copy(src, dest);
		System.out.println("Screenshot Taken");		
	}
	
	 public static String path;
	 public static String sheetno;
	 
	 public static  String getExcelData(int row, int cell) throws EncryptedDocumentException, IOException {
		   
		FileInputStream f = new FileInputStream(path);
		Workbook w = WorkbookFactory.create(f);
		Sheet sh=w.getSheet(sheetno);
		 String data = sh.getRow(row).getCell(cell).getStringCellValue();
		
		return data;
	}
}
