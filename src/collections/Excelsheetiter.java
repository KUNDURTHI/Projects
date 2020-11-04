package collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class Excelsheetiter {
	
@SuppressWarnings("resource")
public static void main(String[] args) throws IOException{
Iterator<Sheet> rt;
String sht;
HSSFWorkbook bk;
		
	String na = "C:/Users/ucoal/Documents/Test1.xls";
	FileInputStream in = new FileInputStream(na);
	 bk= new HSSFWorkbook(in);
	rt = bk.sheetIterator();
	
	while(rt.hasNext()){
			Sheet sh = rt.next();	
			sht = sh.getSheetName();
			System.out.println(sht);


	}
}
}