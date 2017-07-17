package ipodo.wjm.serviceImpl;

import ipodo.wjm.service.ClassFrame;
import ipodo.wjm.service.WriteStringFunc;

public class WriteStringFuncImpl implements WriteStringFunc {
	
	ClassFrame cFrame; 

	@Override
	public void setString(ClassFrame cFrame) {
		
		this.cFrame = cFrame;

	}

	@Override
	public void writeString() {
		
		cFrame.writeString();

	}

}
