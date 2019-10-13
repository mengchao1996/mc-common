package com.mc.common.utils;

import java.util.HashSet;
import java.util.Random;

public class RandomUtil {
	//����1������min-max֮����������������min��maxֵ�������緵��1-3֮������������ô����1��2��3������ȷ�ģ�����4�Ͳ��ԡ� (5��)
	//1    3
	public static int random(int min, int max){
		
		//ʵ����������
		Random r = new Random();
		int i = r.nextInt(3);
		System.out.println(i);
		return max;
	//TODO ʵ�ִ���
	}
		
		
	// ����2������Сֵmin�����ֵmax֮���ȡsubs�����ظ����������������1-10֮��ȡ3�����ظ������������ô[2,6,9]�ǶԵģ�[3,5,5]�򲻶ԣ���Ϊ5�ظ��ˡ�Ӧ�ó�������100ƪ���������ȡ10ƪ���£��¿����ܻ�ʹ�õ���
		// (8��)
		public static int[] subRandom(int min, int max, int subs) {
			// ����������.���������ظ�����
			HashSet<Integer> set = new HashSet<Integer>();

			// ����Ŀ������.������������
			int[] dest = new int[subs];
			
			//��set����������������,
			while (set.size() != subs) {
				int x = random(min, max);
				set.add(x);
			}
			//����set����,����Ŀ������
			int y = 0;
			for (int value : set) {
				dest[y] = value;
				y++;
			}

			return dest;
		}


		// ����3������1��1-9,a-Z֮�������ַ��� (8��)
		public static char randomCharacter() {
			String str="123456789qwrtyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM";
			
			return str.charAt(random(0, str.length() -1));
		}

		// ����4�����ز���length���ַ���(5��)�������ڲ�Ҫ����randomCharacter()���� (4��)
		public static String randomString(int length) {
			String str="";
			for(int i =0;i<length; i++) {
				str+=randomCharacter();
			}
			
			return str;
		}
}
