package com.mc.common.utils;

import java.util.Calendar;
import java.util.Date;

//���ڹ�����
public class DateUtil {
	
	/**
	 * ���ظ���minDate��maxDAte֮����������
	 * @Title: getDate 
	 * @Description: TODO
	 * @param minDate
	 * @param maxDate
	 * @return
	 * @return: Date
	 */
	public static Date getDate(Date minDate ,Date maxDate) {
		
		//��С������
		long min = minDate.getTime();
		long max = maxDate.getTime();
	
		long x =(long) ((Math.random() * (max -min +1)) +min);
		
		
		return new Date(x);
		
	}
	
	
	
	/*
	* ����1��(5��) ���ظ������ڵ��³�
	* ��һ��ʱ����󣬷��ظ�ʱ�������µ�1��0ʱ0��0�롣����һ��Date�����ֵ��2019-05-18 11:37:22
	* �򷵻صĽ��Ϊ2019-05-01 00:00:00
	*/
	public static Date getDateByInitMonth(Date src){
		//��ȡ������
		Calendar c = Calendar.getInstance();
		
		//�ô�������ڳ�ʼ��������
		c.setTime(src);
		//�ı�����,����Ϊ�³� �� 1�� ��00:00:00
		c.set(Calendar.DAY_OF_MONTH, 1);
		c.set(Calendar.HOUR_OF_DAY, 0);
		c.set(Calendar.MINUTE, 0);
		c.set(Calendar.SECOND, 0);
		
		return c.getTime();
		
	}
	/*
	* ����2��(5��) //���ظ������ڵ���ĩ
	* ��һ��ʱ����󣬷��ظ�ʱ�������µ������23ʱ59��59�룬��Ҫ�����´���С�Ͷ������������
	* ����һ��Date�����ֵ��2019-05-18 11:37:22���򷵻ص�ʱ��Ϊ2019-05-31 23:59:59
	* ����һ��Date�����ֵ��2019-02-05 15:42:18���򷵻ص�ʱ��Ϊ2019-02-28 23:59:59
	*/
	public static Date getDateByFullMonth(Date src){
		//˼·: �ô�����·�+1 ,�ٰ��� Сʱ���붼����Ϊ0 .���.�����ڼ�ȥ1��
		//��ȡ������
	   Calendar c = Calendar.getInstance();
	   //�ô�������ڳ�ʼ��������
	   c.setTime(src);
	   //���·ݼ�1 
		c.add(Calendar.MONTH, 1);
		//�����³��Ĺ����෵��,�³�
		Date date = getDateByInitMonth(c.getTime());
		//���³���ʼ��������
		c.setTime(date);
		//�����ڼ�ȥ1��
		c.add(Calendar.SECOND, -1);
		
		return c.getTime();
	}

	
}
