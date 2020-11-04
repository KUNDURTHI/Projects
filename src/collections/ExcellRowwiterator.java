package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class ExcellRowwiterator {
	
	public static void main(String[] args) throws IOException{
		Iterator<Sheet> rt;
		String sht;
		HSSFWorkbook bk;
		Iterator<Row> rw;
		Iterator<Cell> cel;
		Row rtw;
		//ArrayList sr = new ArrayList();
		String na = "C:/Users/ucoal/Documents/Test1.xls";
		FileInputStream in = new FileInputStream(na);
		 bk= new HSSFWorkbook(in);
		rt = bk.sheetIterator();
		String sr ;
		double sr2;
			for(Sheet sh: bk){	
			rw = sh.rowIterator();
			while(rw.hasNext()){
				rtw = rw.next();
					cel = rtw.cellIterator();
					sr = cel.next().getStringCellValue();
					//sr2 = cel.next().getCellType().getNumericCellValue();
					System.out.println(sr);
				
		
			}
		
			}
		
	}

}
