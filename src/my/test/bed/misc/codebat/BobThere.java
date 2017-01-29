package my.test.bed.misc.codebat;

public class BobThere {

	public boolean bobThere(String str) {

		if (str == null) {
			return false;
		}

		String strNormalized = str.toLowerCase();
		strNormalized = strNormalized.replaceAll("b.b", "bob");

		return strNormalized.contains("bob");

	}
}
