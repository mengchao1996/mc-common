package com.mc.common.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.junit.Test;

public class DataUtilTest {

	@Test//�³�
	public void testGetDateByInitMonth() {
		
		Calendar c = Calendar.getInstance();
		c.set(2018, 2, 23, 12, 12, 28);
		Date date = DateUtil.getDateByInitMonth(c.getTime());
		SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
		
		
	}

	@Test
	public void testGetDateByFullMonth() {
		Calendar c = Calendar.getInstance();
		c.set(2012, 1, 23, 12, 12, 28);
		
		
		Date date = DateUtil.getDateByFullMonth(c.getTime());
		SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

	
	/**
	 * ƴ���������ʱ�䷶Χ��ѯ������SQL��
String sql = "select * from t_order where create_time>='{1}'
 and create_time<='{2}' ";
������{1}��λ��ʹ��DateUtil�������е�getDateByInitMonth()����ֵ�滻��
������{2}��λ��ʹ��DateUtil�������е�getDateByFullMonth()����ֵ�滻������ӡ����ȷƴ�ӵ�SQL�ַ�����
	 * @Title: testSQl 
	 * @Description: TODO
	 * @return: void
	 */
	@Test
	public void testSQl() {
		//�³�
		Date initMonth = DateUtil.getDateByInitMonth(new Date());
		
		//��ĩ
		Date fullMonth = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat df =new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

		
   String sql ="select * from t_order where create_time>='{1}' and create_time<='{2}'";
  
   //�滻��Ľ��
   String sql2 = sql.replace("{1}", df.format(initMonth)).replace("{2}", df.format(fullMonth));
	System.out.println(sql2);
	
	}
	
	
}
