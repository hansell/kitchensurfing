package com.kitchensurfing.common;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateTimeUtil implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public static String getYesterday(){
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Calendar cpcalendar = new GregorianCalendar();
        cpcalendar.add(Calendar.DATE, -1);
        String now = format.format(cpcalendar.getTime());
         return now;
	}
	/**
	 * 获得当前日期yyyy-MM-dd格式的字符串
	 * @return YYYY-MM-DD格式的

	 */
	public static String getCurrentDateString(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date now=new Date();
	    return sdf.format(now);
	}
	
	/**
	 * 获得当前日期和时间,日期加时分秒,yyyy-MM-dd hh:mm:ss
	 * @return
	 */
	public static String getCurrentDateTimeString(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now=new Date();
	    return sdf.format(now);		
	}

	public static Date getCurrentDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date now=new Date();
		String tmp=sdf.format(now);
	    try {
			return sdf.parse(tmp);
		} catch (ParseException e) {
			e.printStackTrace();
			return null;
		}		
	}
	
	public static Date parse(String param) {
	    Date date = null;
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    try {
	      date = sdf.parse(param);
	    }
	    catch (ParseException ex) {
	    }
	    return date;
	}
	public static Date parse(String param,String format) {
	    Date date = null;
	    SimpleDateFormat sdf = new SimpleDateFormat(format);
	    try {
	      date = sdf.parse(param);
	    }
	    catch (ParseException ex) {
	    }
	    return date;
	}
	public static Date parseShort(String param) {
	    Date date = null;
	    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
	    try {
	      date = sdf.parse(param);
	    }
	    catch (ParseException ex) {
	    }
	    return date;
	}
	
	public static String date2String(Date date) {
		return date2String(date,"yyyy-MM-dd HH:mm:ss");
	}
	
	public static String date2StringShort(Date date) {
		return date2String(date,"yyyy-MM-dd");
	}
	
	public static String date2String(Date date,String format) {
		if(date == null){
			return "";
		}
	    SimpleDateFormat sdf = new SimpleDateFormat(format);
	    String date_str = "";
	    try{
	    	date_str = sdf.format(date);
	    }catch(Exception e){}
	    return date_str;
	}
	
	public static String time2String(Date date) {
		if(date == null){
			return "";
		}
	    SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
	    String date_str = "";
	    try{
	    	date_str = sdf.format(date);
	    }catch(Exception e){}
	    return date_str;
	}
	
	public static Date getAfterDate(Date date, int year, int month, int day){
		if(date == null){
			date = new Date();
		}
		
		Calendar cal = new GregorianCalendar ();
		
		cal.setTime(date);
		if(year != 0){
			cal.add(Calendar.YEAR, year);
		}
		if(month != 0){
			cal.add(Calendar.MONTH, month);
		}
		if(day != 0){
			cal.add(Calendar.DATE, day);
		}
		return cal.getTime();
	}
	
	public static int getDateYear(Date date){
		if(date == null){
			date = new Date();
		}
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		return cal.get(Calendar.YEAR);
	}
	public static int getDateMonth(Date date){
		if(date == null){
			date = new Date();
		}
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		return cal.get(Calendar.MONTH);
	}
	public static int getDateDay(Date date){
		if(date == null){
			date = new Date();
		}
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		return cal.get(Calendar.DAY_OF_MONTH);
	}
	public static int getDateHour(Date date){
		if(date == null){
			date = new Date();
		}
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		return cal.get(Calendar.HOUR_OF_DAY);
	}
	public static int getDateMinute(Date date){
		if(date == null){
			date = new Date();
		}
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		return cal.get(Calendar.MINUTE);
	}
	public static int getDateSecond(Date date){
		if(date == null){
			date = new Date();
		}
		Calendar cal = new GregorianCalendar();
		cal.setTime(date);
		return cal.get(Calendar.SECOND);
	}
	 /**
	   *  取得当前月的最大天数
	   *
	   *@return
	   */
	  public static int getDaysOfMonth() {
	    return getDaysOfMonth(getCurrentYear(), getCurrentMonth());
	  }

	  /**
	   *  取得一个月的最大天数
	   *
	   *@param  year
	   *@param  month
	   *@return
	   */
	  public static int getDaysOfMonth(int year, int month) {
	    return (int) ( (toLongTime(month == 12 ? (year + 1) : year,
	                               month == 12 ? 1 : (month + 1), 1) -
	                    toLongTime(year, month, 1)) / (24 * 60 * 60 * 1000));
	  }


	  /**
	   * 取得下一个月的最大天数
	   * @param  year
	   * @param  month
	   * @return
	   */
	  public static int getDaysOfNextMonth(int year, int month) {
	    year = month == 12 ? year + 1 : year;
	    month = month == 12 ? 1 : month + 1;
	    return getDaysOfMonth(year, month);
	  }

	  /**
	   * 取得上个月的最大天数
	   * @param  year
	   * @param  month
	   * @return
	   */
	  public static int getDaysOfProMonth(int year, int month) {
	    year = month == 1 ? year - 1 : year;
	    month = month == 1 ? 12 : month - 1;
	    return getDaysOfMonth(year, month);
	  }

	  /**
	   *  取上月第一天
	   *
	   *@param  dqrq  Description of Parameter
	   *@return       String
	   *@since        2003-0416
	   */
	  public static String getFirstDayOfPreMonth(String dqrq) {
	    String strDQRQ = dqrq;
	    String strYear = "";
	    String strMonth = "";
	    String strDay = "";
	    if (strDQRQ == null) {
	      return "";
	    }
	    if (strDQRQ.length() == 8) {
	      strYear = strDQRQ.substring(0, 4);
	      strMonth = strDQRQ.substring(4, 6);
	      strDay = strDQRQ.substring(6, 8);
	    }
	    if (strDQRQ.length() == 10) {
	      strYear = strDQRQ.substring(0, 4);
	      strMonth = strDQRQ.substring(5, 7);
	      strDay = strDQRQ.substring(8, 10);
	    }

	    int iMonth = Integer.parseInt(strMonth);
	    int iYear = Integer.parseInt(strYear);
	    if (iMonth == 1) {
	      iYear = iYear - 1;
	      iMonth = 12;
	    }
	    else if (iMonth > 1) {
	      iMonth = iMonth - 1;
	    }
	    else {
	      return "";
	    }
	    if (iMonth < 10) {
	      strMonth = "0" + iMonth;
	    }
	    else {
	      strMonth = "" + iMonth;
	    }
	    strDay = "01";
	    if (strDQRQ.length() == 8) {
	      return iYear + strMonth + strDay;
	    }
	    else if (strDQRQ.length() == 10) {
	      return iYear + "-" + strMonth + "-" + strDay;
	    }
	    else {
	      return "";
	    }
	  }
	  /**
	   *  从给定的 year,mongth,day 得到时间的long值表示
	   *  milliseconds after January 1, 1970 00:00:00 GMT).
	   *
	   *@param  year   年
	   *@param  month  月
	   *@param  day    日
	   *@return        给定的 year,mongth,day 得到时间的long值表示
	   */
	  public static long toLongTime(int year, int month, int day) {
	    return toDate(year, month, day).getTime();
	  }

	  /**
	   * 从年月日得到一个Date对象
	   * @param  year   年
	   * @param  month  月
	   * @param  day    日
	   * @return        得到的Date对象
	   */
	  public static java.util.Date toDate(int year, int month, int day) {
	    Calendar cld = new GregorianCalendar();
	    cld.clear();
	    cld.set(Calendar.YEAR, year);
	    cld.set(Calendar.MONTH, month - 1);
	    cld.set(Calendar.DAY_OF_MONTH, day);
	    return cld.getTime();
	    //.getTime();
	  }
	  /**
	   *  取得当前的年 以整数形式返回， 例如：1999
	   *
	   *@return    返回当前年

	   */
	  public static int getCurrentYear() {
	    return getCurrentYear( (Date)null);
	  }

	  /**
	   *  根据Date对象取得 年份 整数形式
	   *
	   *@param  date  java.util.Date 对象
	   *@return       返回 java.util.Date 的年份

	   */
	  public static int getCurrentYear(Date date) {
	    Calendar rightYear = Calendar.getInstance();
	    if (date != null) {
	      rightYear.setTime(date);
	    }
	    return rightYear.get(Calendar.YEAR);
	  }
	  /**
	   * Gets the CurrentMonth attribute of the DateUtil class
	   * @return    The CurrentMonth value
	   */
	  public static int getCurrentMonth() {
	    return getCurrentMonth( (Date)null);
	  }

	  /**
	   * Gets the CurrentMonth attribute of the DateUtil class
	   * @param  date  Description of Parameter
	   * @return       The CurrentMonth value
	   */
	  public static int getCurrentMonth(Date date) {
	    Calendar rightMonth = Calendar.getInstance();
	    if (date != null) {
	      rightMonth.setTime(date);
	    }
	    return rightMonth.get(Calendar.MONTH) + 1;
	  }
}
