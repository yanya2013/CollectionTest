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
	 * ���ɳ���Ϊ10���ڵ����ַ����������������
	 */
	public void testCollection(){
		String str="abcdefgijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
		System.out.println("�����������������ɳ���Ϊ10���ڵ����ַ�������������");
		Random ramdom=new Random();

		System.out.println("��������������������������ǰ��������������������������");
		for(int i=0;i<10;i++){//���10������ַ���
			int ramdomInt=ramdom.nextInt(10);//ÿ���ַ����ĳ���
			StringBuffer stringBuffer=new StringBuffer();
			for(int j=0;j<ramdomInt+1;j++){//����ÿ���ַ���

				stringBuffer.append(str.charAt(ramdom.nextInt(str.length())));
			}
			System.out.println("������stringList�е��ַ�����"+stringBuffer);
			stringList.add(stringBuffer.toString());//����stringList��
		}
		for (String string : stringList) {
			System.out.println("�ַ�����"+string);
		}
		Collections.sort(stringList);
		System.out.println("������������������������������󣭣���������������������");
		for (String string : stringList) {
			System.out.println("�ַ�����"+string);
		}
	}
	public static void main(String[] args) {
		CollectionTest ct=new CollectionTest();
		ct.testCollection();
	}
}
