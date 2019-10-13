package com.mc.common.utils;

import java.util.Calendar;
import java.util.Date;

//�������ռ�������
public class AgeUtil {
	
	public static int getAge(Date birthday) {
		//��ȡ��ǰ��ϵͳ��������
		Calendar c = Calendar.getInstance();
		
		//��ȡ��ǰ������
		int yearNow = c.get(Calendar.YEAR);
		int monthNow = c.get(Calendar.MONTH);
		int dateNow = c.get(Calendar.DAY_OF_MONTH);
		
		//�����ճ�ʼ��������
		c.setTime(birthday);
		int yearBirth = c.get(Calendar.YEAR);
		int monthBirth = c.get(Calendar.MONTH);
		int dateBirth = c.get(Calendar.DAY_OF_MONTH);
		
		//����1990-02-10  2019-02-08
		int age = yearNow - yearBirth;
		
		//�����·ݴ���ǰ�·�   �������1
		if(monthBirth>monthNow) {
			age--;
		}
		
		return age;
	}
	
	
	
	
}
