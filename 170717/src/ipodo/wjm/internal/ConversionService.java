package ipodo.wjm.internal;

import java.util.List;

import ipodo.wjm.external.ValueOf;

public interface ConversionService {

	public void setExternalSpell(ValueOf spellingService);

	List<?> setSpelling(String string);
	
	public void setExternalNum(double num);
	

}
