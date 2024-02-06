package mathematics_1;

public class GCD {

	static int gcd(int a, int b) {
		if (a == b)
			return a;
		if (a < b)
			return gcd(b, a);
		return gcd(a - b, b);
	}

	public static void main(String[] args) {

		System.out.println(gcd(24, 36));

	}

}
