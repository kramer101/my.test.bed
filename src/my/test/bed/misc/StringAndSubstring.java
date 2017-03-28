package my.test.bed.misc;

public class StringAndSubstring {

	public static boolean isSubstringOf(final String string, final String subString) {

		if ((string == null || string.length() == 0) || (subString == null || subString.length() == 0)) {
			return false;
		}

		if (subString.length() > string.length()) {
			return false;
		}

		int stop = string.length() - subString.length();

		for (int i = 0; i <= stop; i++) {

			boolean allMatch = true;
			int subStringIndex = 0;

			for (int j = i; j <= i + (subString.length() - 1); j++) {
				if (string.charAt(j) != subString.charAt(subStringIndex)) {
					allMatch = false;
					break;
				}
				subStringIndex++;
			}

			if (allMatch) {
				System.out.println("index of " + subString + ": " + i);

				return true;

			}

		}

		return false;
	}

	public static void main(String[] args) {
		System.out.println(isSubstringOf("retrospective", "spec"));
	}

	
	
}
