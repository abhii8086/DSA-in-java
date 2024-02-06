package mathematics_1;

public class gcdbyElucidianmodifiedLema {

	static int lema(int a, int b) {
		if (a < b)
			return lema(b, a);
		if (a % b == 0)
			return b;
		return lema(a % b, b);
	}

	public static void main(String[] args) {

		System.out.println(lema(24, 36));

	}

}
