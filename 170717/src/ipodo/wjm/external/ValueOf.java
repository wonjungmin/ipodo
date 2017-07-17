package ipodo.wjm.external;

public class ValueOf {

	double num;

	public char[] getSpelling(String spell) {
		return spell.toCharArray();

	}

	public double getNum() {
		return num;
	}

	public double setNum(double num) {
		this.num = num;

		return num;
	}

}
