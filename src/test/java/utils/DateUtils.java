package utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class DateUtils {
	
	public static String getcurrentdateandtime() {
		String str = null;
		try {
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss:SSS");
			Date date = new Date();
			str = dateFormat.format(date);
			str = str.replace(" ", "").replaceAll("/", "").replaceAll(":", "");
		} catch (Exception e) {
		}
		return str;
	}
	
	public static String getCurrentTimestamp(String format) {
		SimpleDateFormat formatter = new SimpleDateFormat(format);
		Date date = new Date();
		return formatter.format(date);
	}

	public static String getFutureDateByWeek(String dateFormat, int weekno) {
		String futureDate = "";
		LocalDate result = LocalDate.now().plus(weekno, ChronoUnit.WEEKS);
		futureDate = DateTimeFormatter.ofPattern(dateFormat, Locale.ENGLISH).format(result);
		return futureDate;
	}

	public static String reformatDate(String inputdate) throws ParseException {
		DateFormat format = new SimpleDateFormat("MM/dd/yyyy");
		Date d = format.parse(inputdate);
		DateFormat format1 = new SimpleDateFormat("EEE, MMM dd");
		String newDate = format1.format(d);
		return newDate;
	}
}
