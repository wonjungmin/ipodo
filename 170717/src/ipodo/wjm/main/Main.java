package ipodo.wjm.main;

import ipodo.wjm.external.ValueOf;
import ipodo.wjm.internal.impl.ConversionServiceImpl;

public class Main {

	public static void main(String[] args) {

		ConversionServiceImpl csi = new ConversionServiceImpl();

		ValueOf vo = new ValueOf();
		
		// ���ڿ� list
		csi.setExternalSpell(vo);
		
		csi.setSpelling("wonjungmin");

		// �Ҽ��� 2�ڸ�
		csi.setExternalNum(vo.setNum(123.36656456456));

	}

}
