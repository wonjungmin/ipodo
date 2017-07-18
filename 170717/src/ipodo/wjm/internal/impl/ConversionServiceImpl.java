package ipodo.wjm.internal.impl;

import java.text.DecimalFormat;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import ipodo.wjm.external.ValueOf;
import ipodo.wjm.internal.ConversionService;

public class ConversionServiceImpl implements ConversionService {

	ValueOf vo;

	@Override
	public void setExternalSpell(ValueOf spellingService) {
		this.vo = spellingService;
	}

	@Override
	public List<?> setSpelling(String string) {
		
		return asList(vo.getSpelling(string));
	}

	@SuppressWarnings("unchecked")
	private List<Character> asList(char[] charArray) {
		
		List<?> result = IntStream.range(0, charArray.length).mapToObj(i -> charArray[i]).collect(Collectors.toList());

		result.forEach(System.out::println);

		return (List<Character>) result;
	}

	@Override
	public void setExternalNum(double num) {

		String pattern = "#####.##";

		DecimalFormat fmt = new DecimalFormat(pattern);

		System.out.println(fmt.format(vo.getNum()));

	}
	
	

}
