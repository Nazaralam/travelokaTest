package Eklipse.FE.Web.Buyer.utils;

import org.joda.time.DateTime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class BuyerDateAndTime
{
	/*	To get the Current Time */
	public static String getTime() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm");
		return dateFormat.format(date);
	}

	/*	To get the Current Date */
	public static String getDate() {
		Date date = new Date();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
		return dateFormat.format(date);
	}

	//get

	public static String tanggal = getDate();
	public static String getafterDday(int tgl) throws ParseException {
		DateFormat dateFormat = new SimpleDateFormat("dd MMMM yy");
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateFormat.parse(tanggal));
		cal.add(Calendar.DATE, tgl);
		return dateFormat.format(cal.getTime());
	}

	public static String getMonth(int interval){
		DateFormat dateFormat = new SimpleDateFormat("dd MMMM yy");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MONTH, interval);
		String result = dateFormat.format(cal.getTime());
		return result;
	}

	public static String getFutureDate1(int n) {
		Calendar current = Calendar.getInstance();
		current.add(Calendar.DATE, n);
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
		Date date = new Date(current.getTimeInMillis());
		return dateFormat.format(date);
	}

//	public static String getNextMonth() {
//		DateTime dateNext = DateTime.now();
//		return dateNext.getNextMonth();
//	}

	/*	To get the Current Month in Integer */
	public static int getMonth_Integer() {
		DateTime datetime = DateTime.now();
		return datetime.getMonthOfYear();
	}
	
	/*	To get the Current Month Text as Full in String*/
	public static String getMonth_Full() {
		DateTime datetime = DateTime.now();
		return datetime.monthOfYear().getAsText();
	}
	
	/*	To get the Current Month Text as Short in String*/
	public static String getMonth_Short() {
		DateTime datetime = DateTime.now();
		return datetime.monthOfYear().getAsShortText();
	}
	
	/*	To get the Current Day of the Month */
	public static String getDayOfTheMonth() {
		DateTime datetime = DateTime.now();
		return datetime.dayOfMonth().getAsText();
	}
	
	/*	To get the Current Day Count in the Year */
	public static String getDayCount() {
		DateTime datetime = DateTime.now();
		return datetime.dayOfYear().getAsText();
	}
	
	/*	To get the Current Minute of the Hour in String */
	public static String getMinuteOfTheHourAsString() {
		DateTime datetime = DateTime.now();
		return datetime.minuteOfHour().getAsText();
	}
	
	/*	To get the Current Year as Integer */
	public static int getYear() {
		DateTime datetime = DateTime.now();
		return datetime.getYear();
	}
	
	/*	To get the Current Hour of the Day in String */
	public static String getHourOfTheDay() {
		DateTime datetime = DateTime.now();
		return datetime.hourOfDay().getAsShortText();
	}
	
	/*	To get the Current Week Count */
	public static String getWeekCount() {
		DateTime datetime = DateTime.now();
		return datetime.weekOfWeekyear().getAsText();
	}
	
	
}
