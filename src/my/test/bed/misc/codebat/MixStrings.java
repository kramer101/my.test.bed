package my.test.bed.misc.codebat;

public class MixStrings {

	/**
	 * 
	 * Given two strings, a and b, create a bigger string made of the first char of a, the first char of b, 
	 * the second char of a, the second char of b, and so on. Any leftover chars go at the end of the result
	 * 
	 * mixString("abc", "xyz") → "axbycz"
mixString("Hi", "There") → "HTihere"
mixString("xxxx", "There") → "xTxhxexre"

	 * @param a
	 * @param b
	 * @return
	 */
	public String mixString(String a, String b) {

		if (a == null || b == null) {
			return a == null ? b : a;
		}

		if (a.length() == 0 || b.length() == 0) {
			return a.length() == 0 ? b : a;
		}

		int maxLength = Math.max(a.length(), b.length());
		String result = "";
		for (int i = 0; i < maxLength; i++) {
			if (i < a.length()) {
				result = result + a.charAt(i);
			}

			if (i < b.length()) {
				result = result + b.charAt(i);
			}
		}

		return result;

	}

}
