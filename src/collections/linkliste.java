package collections;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

public class linkliste implements Runnable{

	private Iterator<Sheet> rt;
	private LinkedList<String> sht;
	private HSSFWorkbook bk;
	private Iterator<Row> rw;
	private Iterator<Cell> cel;
	public  Row rtw;
	/**
	 * @param args
	 * @throws IOException
	 */
	public void excelsheetrd() throws IOException{
	String na = "C:/Users/ucoal/Documents/Test1.xls";
	FileInputStream in = new FileInputStream(na);
	sht = new LinkedList<String>();
	bk= new HSSFWorkbook(in);
	rt = bk.sheetIterator();
System.out.println(rt.next().getColumnWidth(0));
	}
public void rowiter(){ 	
	try {
		Thread.sleep(500);
		ArrayList<String> sr = new ArrayList<>();
		DataFormatter dft = new DataFormatter();
			for(Sheet sh: bk){	
			rw = sh.rowIterator();
			while(rw.hasNext()){
				rtw = rw.next();
				cel = rtw.cellIterator();
				String srt = dft.toString();
				sr.add(cel.next().getRow().toString());
				
			}
			System.out.println(sr);
			}
		
		
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void celiter(){	
	ArrayList cst = new ArrayList(); 
	Row rtw = this.rtw;		
	cel = rtw.cellIterator();
	while(cel.hasNext()){
			Cell ce = cel.next();
			System.out.println(cst.add(ce));
				}
}
	@Override
	public void run(){
	try {
		this.excelsheetrd();
	Iterator<Sheet> rt=this.rt;
	while(rt.hasNext()){
				Sheet sh = rt.next();
				LinkedList<String> sht=this.sht;
				sht.push(sh.getSheetName());
				System.out.println(sht);
				
			}
}
 catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
}
public static void main(String[] args) throws IOException{
	
	linkliste lil = new linkliste();
	lil.excelsheetrd();	 
	lil.rowiter();
		//lil.celiter();
	}
}