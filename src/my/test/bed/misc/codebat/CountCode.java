package my.test.bed.misc.codebat;

public class CountCode {

	/**
	 * 
	 * Return the number of times that the string "code" appears anywhere in the
	 * given string, except we'll accept any letter for the 'd', so "cope" and
	 * "cooe" count.
	 * 
	 * @param str
	 * @return
	 */
	public static int countCode(String str) {

		String searchStr = "code";
		
		if (str == null || str.length() < searchStr.length()) {
			return 0;
		}

		int count = 0;
		String regex = "co.e";

		for (int i = 0; i <= str.length() - searchStr.length(); i++) {

			String substr = str.substring(i, i + searchStr.length());
			if (substr.matches(regex)) {
				count++;
			}

		}
		return count;

	}
	
	public static void main(String[] args) {
		System.out.println(countCode("codecodecope con tablecoze"));
	}
	
	

}
