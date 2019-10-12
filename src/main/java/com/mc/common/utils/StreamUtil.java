package com.mc.common.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

//���Ĺ�����
public class StreamUtil {
	
	
	/*
	* ����1�������ر����������ܴ����޸���(3��)
	* ���紫��FileInputStream����JDBC��Connection���󶼿��Թرա�
	*/
	public static void closeAll(AutoCloseable ... autoCloseables ){
		if(autoCloseables!=null && autoCloseables.length>0) {
			//�жϿɱ�����Ƿ���ֵ
			for (AutoCloseable autoCloseable2 : autoCloseables) {
				try {
					autoCloseable2.close();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
		
	}
	/*
	* ����2������һ���ı��ļ�����Ĭ��ΪUTF-8���룬���ظ��ļ�����(3��)��Ҫ�󷽷��ڲ����������1�������ر���(3��)
	*/
	public static String readTextFile(InputStream src){
		String str = "";
		byte[] b = new byte[1024];
		int x = 0;
		try {
			while((x=src.read(b))!=-1) {
				str += new String(b, 0, x, "utf-8");
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeAll(src);//����
		}
		return str;
	}
	/*
	* ����3�������ı��ļ����󣬷��ظ��ļ�����(3��)������Ҫ���ڲ����������2������(5��)��* ���ǵ��͵ķ������أ���ס�������ꡭ
	*/
	public static String readTextFile(File txtFile){
		try {
			return readTextFile(new FileInputStream(txtFile));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	//TODO ʵ�ִ���
	}
	
	
	
}
