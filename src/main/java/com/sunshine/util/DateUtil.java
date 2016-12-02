package com.sunshine.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ʱ�乤��
 */
public class DateUtil {
	/**
	 * ��ȡ��ǰʱ��
	 * @return
	 */
	public static Date getDate(){
		return new Date();
	}
	/**
	 * ����ʱ���ʽ���ض����ʽ����
	 * @param str
	 * @return
	 */
	public static String getDate(String str){
		SimpleDateFormat s=new SimpleDateFormat(str);
		return s.format(getDate());
	}
	/***
	 * //�����ʱ�䷵����Ӧ�Ĵ�
	 * @param dateString��ǰ��ʽ
	 * @param todateString��ת�ɺ�ĸ�ʽ
	 * @param date���ʽ��Ӧ��ʱ��
	 * @return
	 */
	public String getDate(String dateString,String todateString,String date){
		SimpleDateFormat s2=null;
		SimpleDateFormat s=null;
		String res="";
		try {
			s2 = null;
			s = new SimpleDateFormat(dateString);
			s.parse(date);
			s2 = new SimpleDateFormat(todateString);
			res=s2.format(s.parse(date));
		} catch (ParseException e) {
			return null;
		}
		return res;
	}
	
}
