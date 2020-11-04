package fortuneminds;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class DateTime {
	// Date Time using JAVA 7
	public static String getCurrentDateTime() {
		Date date;
		SimpleDateFormat dateFormate = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		date = new Date();
		String dateTime = dateFormate.format(date);
		System.out.println("Printing DateTime::" + dateTime);
		return dateTime;
	}

	// Dat time using JAVA 8

	public static String getlocalDateTime() {
		LocalDateTime date = LocalDateTime.now();

		String dateTime = date.toString();
		System.out.println("Geeting Current date time::" + dateTime);
		return dateTime;

	}

	public static void main(String[] args) {

		DateTime.getCurrentDateTime();
		DateTime.getlocalDateTime();
	}

}
