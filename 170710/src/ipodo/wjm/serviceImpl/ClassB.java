package ipodo.wjm.serviceImpl;

import ipodo.wjm.service.ClassFrame;

public class ClassB implements ClassFrame {

	@Override
	public void writeString() {
		System.out.println(this.getClass().getName().substring(22, 28)+"�Դϴ�");

	}

}
