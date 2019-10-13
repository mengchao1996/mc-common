package com.mc.common.utils;

import java.util.Calendar;
import java.util.Date;

//根据生日计算年龄
public class AgeUtil {
	
	public static int getAge(Date birthday) {
		//获取当前的系统的日期类
		Calendar c = Calendar.getInstance();
		
		//获取当前年月日
		int yearNow = c.get(Calendar.YEAR);
		int monthNow = c.get(Calendar.MONTH);
		int dateNow = c.get(Calendar.DAY_OF_MONTH);
		
		//用生日初始化日历类
		c.setTime(birthday);
		int yearBirth = c.get(Calendar.YEAR);
		int monthBirth = c.get(Calendar.MONTH);
		int dateBirth = c.get(Calendar.DAY_OF_MONTH);
		
		//年龄1990-02-10  2019-02-08
		int age = yearNow - yearBirth;
		
		//出生月份大于前月份   年龄减少1
		if(monthBirth>monthNow) {
			age--;
		}
		
		return age;
	}
	
	
	
	
}
