package my.test.bed.misc.codebat;

public class CatDog {

	public boolean catDog(String str) {

		if (str == null || str.length() == 0) {
			return false;
		}

		String searchStr1 = "cat";
		String searchStr2 = "dog";

		if (str.indexOf(searchStr1) == -1 || str.indexOf(searchStr2) == -1) {
			return false;
		}

		int countStr1 = 0;
		int countStr2 = 0;

		int index = 0;

		String stringLocal = str;

		while (index != -1) {
			index = stringLocal.indexOf(searchStr1, index);
			if (index != -1) {
				index = index + searchStr1.length();
				countStr1++;
			}
		}

		stringLocal = str;
		index = 0;
		while (index != -1) {
			index = stringLocal.indexOf(searchStr2, index);
			if (index != -1) {
				index = index + searchStr2.length();
				countStr2++;
			}
		}

		if (countStr1 == countStr2) {
			return true;
		}

		return false;
	}

}
