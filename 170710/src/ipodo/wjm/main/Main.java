package ipodo.wjm.main;

import java.util.Scanner;

import ipodo.wjm.serviceImpl.ClassA;
import ipodo.wjm.serviceImpl.ClassB;
import ipodo.wjm.serviceImpl.WriteStringFuncImpl;

public class Main {

	public static void main(String[] args) {

		WriteStringFuncImpl wsf = new WriteStringFuncImpl();

		String message;
		Scanner scan = new Scanner(System.in); // ���� �Է��� ���ڷ� Scanner ����

		System.out.println("�޽��� a�� b�� �Է��ϼ���:");
		
		message = scan.nextLine();
		
		if (message.equals("a")) {
			
			
			wsf.setString(new ClassA());
			wsf.writeString();
		}else {
			
			wsf.setString(new ClassB());
			wsf.writeString();
		}


	}

}
