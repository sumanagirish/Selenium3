package Generic;

import java.io.FileInputStream;


import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchLoginCredentials {
	
	static String value;
	public static String getData(String path,String sheet,int row,int cell)
	{
		try {
			FileInputStream f = new FileInputStream(path);
			Workbook book=WorkbookFactory.create(f);
			value= book.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		} 
		
		catch (Exception e) {
			
			e.printStackTrace();
		}
		return value;
	}

}
