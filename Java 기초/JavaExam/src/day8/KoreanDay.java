package day8;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class KoreanDay {
	public static String day;
	public static String korDayName[]={"","�Ͽ���","������","ȭ����","������","�����","�ݿ���","�����"};
	static{
		GregorianCalendar cal=new GregorianCalendar();
		int numDay=cal.get(Calendar.DAY_OF_WEEK);
		day=korDayName[numDay];
				
	}
}
