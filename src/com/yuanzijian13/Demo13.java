package com.yuanzijian13;

import java.util.Scanner;

class User{

	String userName;


	String password;


}


class Demo13 
{
	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);

		User[] users = new User[10];
		while(true){
			System.out.println("��ѡ���� : A(ע��)   B(�鿴�û�)");
			String option = scanner.next();
			if(option.equals("A")){
				System.out.println("�������û���:");
				String userName = scanner.next();
				System.out.println("����������:");
				String password = scanner.next();
				


			}else if(option.equals("B")){
				
			}
		}
	}
}
