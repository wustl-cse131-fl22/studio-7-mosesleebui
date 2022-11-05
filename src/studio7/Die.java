package studio7;

public class Die {

	private int n;
	private int random;
	
	public int random() {
		random = (int)(Math.random() * n + 1);
		return random;
	}
	
}
