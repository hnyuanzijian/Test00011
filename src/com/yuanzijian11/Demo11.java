package com.yuanzijian11;

/*
ģ��ģʽ �����ĳ������Ĳ�����Щ�ǹ̶��ģ���Щ�ǻᷢ���仯�ģ���ô��ʱ�����ǿ���
Ϊ���������ṩһ��ģ����룬�Ӷ����Ч�� ��


���󣻱�дһ�������������ʱ�� ��ģ�塣

ģ��ģʽ�Ĳ��裺
	1. ��д����������������� ��һ���Ľ��������
	2. �������룬�ѻᷢ���仯�Ĵ����ȡ����������һ���������Ѹ÷���������һ������ķ�����
	3. ʹ��final����ģ�巽������ֹ���� ��д���ģ�巽����

*/
abstract class MyRuntime{
	
	public final void getTime(){
		long startTime = System.currentTimeMillis();	//��¼��ʼ��ʱ��
		code();
		long endTime = System.currentTimeMillis();  //��¼������ʱ��.
		System.out.println("����ʱ�� ��"+ (endTime-startTime));
	}

	public abstract void code();
}




class Demo11 extends MyRuntime
{
	public static void main(String[] args) 
	{
		Demo11 d = new Demo11();
		d.getTime();
	}


	
	//code�����ڲ���дҪ��������ʱ�� �Ĵ��룻
	public  void code(){
		int i = 0;
		while(i<100){
			System.out.println("i="+i);
			i++;
		}

	}
}

