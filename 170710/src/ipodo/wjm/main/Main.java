package ipodo.wjm.main;

import java.util.Scanner;

import ipodo.wjm.serviceImpl.ClassA;
import ipodo.wjm.serviceImpl.ClassB;
import ipodo.wjm.serviceImpl.WriteStringFuncImpl;

public class Main {

	public static void main(String[] args) {

		WriteStringFuncImpl wsf = new WriteStringFuncImpl();

		String message;
		Scanner scan = new Scanner(System.in); // 문자 입력을 인자로 Scanner 생성

		System.out.println("메시지 a나 b를 입력하세요:");
		
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
