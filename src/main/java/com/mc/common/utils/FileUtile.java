package com.mc.common.utils;

import java.io.File;

//�ļ�������
public class FileUtile {
	
	/*
	* ����1������һ���ļ��������ظ��ļ�������չ�������硰aaa.jpg�������ء�.jpg��(3��)
	*/
	public static String getExtendName(String fileName){
		
		if(null!=fileName && fileName.length()>0) 
		return fileName.substring(fileName.lastIndexOf(".")+1);
		return null;
		
		
	}
	/*
	* ����2�����ز���ϵͳ��ʱĿ¼(5��)
	*/
	public static File getTempDirectory(){
		String path = System.getProperty("java.io.tmpdir");
		return new File(path);
	}
	/*
	* ����3�����ز���ϵͳ�û�Ŀ¼(5��)
	* ����Linuxϵͳ����/home/{�û��˺���}��Windowsϵͳ����C:\Users\{�û��˺���}> 
	*/
	public static File getUserDirectory(){
		String path = System.getProperty("user.home");
		return new File(path);
	}
	
	
	
}