package ipodo.wjm.main;

import ipodo.wjm.external.ValueOf;
import ipodo.wjm.internal.impl.ConversionServiceImpl;

public class Main {

	public static void main(String[] args) {

		ConversionServiceImpl csi = new ConversionServiceImpl();

		ValueOf vo = new ValueOf();
		
		// 문자열 list
		csi.setExternalSpell(vo);
		
		csi.setSpelling("wonjungmin");

		// 소수점 2자리
		csi.setExternalNum(vo.setNum(123.36656456456));

	}

}
