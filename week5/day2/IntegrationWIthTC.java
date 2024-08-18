package week5.day2;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class IntegrationWIthTC {
//retain - static keyword
	//it will have common reference to all testcase 
	
//step -4
	public static String[][] readValue() throws IOException {
	
	
		XSSFWorkbook wb=new XSSFWorkbook("./data/CreateLead.xlsx");
		
		
		XSSFSheet sheetAt = wb.getSheet("CreateLead");
	 
	 int rowcount = sheetAt.getLastRowNum();
	 
	 
	 int cellcount = sheetAt.getRow(1).getLastCellNum();
	
	 //step1
		String[][] data=new String[rowcount][cellcount];

	 for (int i = 1; i <=rowcount; i++) {
	
		 for (int j = 0; j < cellcount; j++) {
			String value = sheetAt.getRow(i).getCell(j).getStringCellValue();
			
			//step 2
			data[i-1][j]=value;
		}
	}
	 
	 
		wb.close();
		//step 3
		 return data;


	}

}
