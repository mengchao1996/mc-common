package com.mc.common.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class DataUtilTest {

	@Test
	public void testGetDateByInitMonth() {
		//设置固定时间
		//Calendar c = Calendar.getInstance();
		//c.set(2018, 2, 23, 12, 12, 28);
		
		
		Date date = DateUtil.getDateByInitMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
	}

	@Test
	public void testGetDateByFullMonth() {
		
		Date date = DateUtil.getDateByFullMonth(new Date());
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(df.format(date));
		
	}

}
