package studio7;

public class fraction {

	
	int numerator;
	int denominator;
	
	public int GCF() {
		int i;
		for (i = 1; i < 100000; i++) {
			if ((i % numerator == 0) && (i % denominator == 0)) {
				break;
			}
		}
		return i;
	}
}
