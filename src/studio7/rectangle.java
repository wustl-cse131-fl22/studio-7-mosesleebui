package studio7;

public class rectangle {

	private int length2;
	private int width2;
	private int length3;
	private int width3;
	int area;

	public rectangle (int length, int width) {

		length2 = length;
		width2 = width;
	}

	public int area () {   

		area = length2*width2;
		return area;
		//  System.out.println (area);
	}

	public int perimeter () {

		int perimeter = ((length2 * 2) + (width2 *2));
		return perimeter;
	}

	public boolean rectangle2 (int l, int w ) {
		int length3 = l;
		int width3 = w;
		int areaRec2 = l*w;

		boolean sizeCompare = (areaRec2 < area);
		return sizeCompare;

	}

	public boolean Square () {
		boolean isSquare = (length2 == width2);
		return isSquare;
	}
}

