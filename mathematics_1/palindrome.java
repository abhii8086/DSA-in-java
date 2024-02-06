package mathematics_1;

public class palindrome {

	static boolean Palindrome(int n) {
		int temp = n;
		int rev = 0;
		int ld = 0;
		while (temp > 0) {
			ld = temp % 10;
			rev = rev * 10 + ld;
			temp = temp / 10;
		}
		System.out.println(rev);
		return n == rev;
	}

	public static void main(String[] args) {

		System.out.println(Palindrome(121));

	}

}
