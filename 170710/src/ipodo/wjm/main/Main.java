package ipodo.wjm.main;

import ipodo.wjm.serviceImpl.ClassA;
import ipodo.wjm.serviceImpl.WriteStringFuncImpl;

public class Main {

	public static void main(String[] args) {
		
		WriteStringFuncImpl wsf = new WriteStringFuncImpl();
		
		wsf.setString(new ClassA());
		wsf.writeString();

		
	}

}
