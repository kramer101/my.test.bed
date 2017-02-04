package my.test.bed.misc.codebat;

public class WithoutString {

	public static String withoutString(final String base, final String remove) {

		if (!base.toLowerCase().contains(remove.toLowerCase())) {
			return base;
		}

		String[] split = base.split(remove.toLowerCase());

		StringBuilder result = new StringBuilder();
		for (String s : split) {

			int index = s.toLowerCase().indexOf(remove.toLowerCase());
			if (index != -1) {
				CharSequence subSeqToReplace = s.subSequence(index, index + (remove.length()));

				s = s.replace(subSeqToReplace.toString(), "");
			}

			result.append(s);

		}

		return result.toString();

	}

	public static void main(String[] args) {
		System.out.println(withoutString("THIS is a FISH", "iS"));
		String s = "This is test";
		s = s.substring(2, s.length());
		System.out.println(Character.getNumericValue('f'));
		
		/*
		 String singleGregex = "^g|[^g]g[^g]|[^g]g$";
		  String doubleGregex = "gg";
		  
		  return str.matches(doubleGregex) && !str.matches(singleGregex);*/
	}
}
