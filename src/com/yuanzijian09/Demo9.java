package com.yuanzijian09;

/*
��jar��: ��Ҫʹ�õ�jdk�Ŀ������ߣ�jar.exe��.
	
jar���÷���
	
ʹ�ø�ʽ��
 
	jar cvf jar�ļ�������  class�ļ��������ļ��� 

��jar��Ҫע������
	1. һ�����������jar֮�� ����Ҫ���嵥�ļ���ָ������ࣺ ��ʽ Main-Class: ����.����
	2. jar��˫�����н�����ͼ�λ�����ĳ��������ã��Կ���̨�ĳ��������á�


jar�ļ������ã�
	1. �����û���������һ����Ŀ��
	2. �ṩ��������jar������ʽ������ʹ�á� 


���ʹ��jar������������Ҫ������classpath·����

jre = jvm+ �������

*/

import javax.swing.*;
class Demo9 
{
	public static void main(String[] args) 
	{
		System.out.println("QQ����..");
		JFrame frame = new JFrame("QQ����");
		frame.setSize(400,500);
		frame.setVisible(true); //���ô��ڿɼ���
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}