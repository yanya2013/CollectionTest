package com.kbrx93;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionTest {
	List<String> stringList;
	public CollectionTest(){
		stringList=new ArrayList<String>();
	}
	/**
	 * 生成长度为10以内的乱字符串并对其进行排序
	 */
	public void testCollection(){
		String str="abcdefgijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		System.out.println("－－－－－－－生成长度为10以内的乱字符串－－－－－");
		Random ramdom=new Random();

		System.out.println("－－－－－－－－－－－排序前－－－－－－－－－－－－－");
		for(int i=0;i<10;i++){//输出10个随机字符串
			int ramdomInt=ramdom.nextInt(10);//每个字符串的长度
			StringBuffer stringBuffer=new StringBuffer();
			for(int j=0;j<ramdomInt+1;j++){//生成每个字符串

				stringBuffer.append(str.charAt(ramdom.nextInt(str.length())));
			}
			System.out.println("将存入stringList中的字符串："+stringBuffer);
			stringList.add(stringBuffer.toString());//存入stringList中
		}
		for (String string : stringList) {
			System.out.println("字符串："+string);
		}
		Collections.sort(stringList);
		System.out.println("－－－－－－－－－－－－－排序后－－－－－－－－－－－－");
		for (String string : stringList) {
			System.out.println("字符串："+string);
		}
	}
	public static void main(String[] args) {
		CollectionTest ct=new CollectionTest();
		ct.testCollection();
	}
}
