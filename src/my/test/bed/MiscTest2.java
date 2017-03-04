package my.test.bed;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.lang.StringUtils;

public class MiscTest2 {

	
	public void test() {
		
		List<String> list = new ArrayList<>();
		
		TestClass c = new TestClass(list);
		c.test();
		System.out.println(list);
		
	}
	
	
	private class TestClass {
		private List<String> list;
		TestClass(List<String> list) {
			this.list = list;
		}
		
		void test() {
			list.add("A");
		}
		
		
	}
	
	
	public static void main(String[] args) {
		
		int x = 1;
		int y = 3;
		List<Integer> list = new ArrayList<>();
		
		test(y, x, list);
		y = x + 1;
		System.out.println("x" + x + " y" + y);
		System.out.println(list);
		System.out.println(Math.PI * Math.pow(5, 2));
		
		System.out.println("Bobby".hashCode());
		
		MiscTest2 t = new  MiscTest2();
		t.test();
		
		
		
		
		String s1 = "Fox Chase Cancer Center, Philadelphia, PA";
		
		//String s2 = "Division of Hematology-Oncology, "
		//		+ "Division of Internal Medicine and the Abramson Cancer Center, University of Pennsylvania, "
		//		+ "Philadelphia, PA, USA.";
		
		//String s2 = "Department of Medical Oncology, Fox Chase Cancer Center, Philadelphia, PA";
		
		String s2 = "Hamatology Unit, Hasharon Hospital, Golda Medical Center, Petah-Tikva, Israel.";
		
		s1 = removeCommonWords(s1);
		s2 = removeCommonWords(s2);
		
		s1 = s1.toLowerCase();
		s2 = s2.toLowerCase();
		
		s1 = s1.replace(",", "");
		s2 = s2.replace(",", "");
		
		String name = "Herman";
		String nameNoDuplicates = "";
		Set<Character> nameSet = new LinkedHashSet<>();
		for (char c : name.toCharArray()) {
			boolean added = nameSet.add(c);
			System.out.println(added);
			if (added) {
				nameNoDuplicates = nameNoDuplicates + c;
			}
		}
		System.out.println(nameNoDuplicates);
		
		
		
		System.out.println(CollectionUtils.intersection(Arrays.asList(StringUtils.split(s1, " ")), 
				Arrays.asList(StringUtils.split(s2, " "))).size());
		
		/*System.out.println(CollectionUtils.disjunction(Arrays.asList(StringUtils.split(s1, " ")), 
				Arrays.asList(StringUtils.split(s2, " "))));*/
	}
	
	
	private static String removeCommonWords(final String str) {
		List<String> commonWords = new ArrayList<>();
		
		String result = str;
		
		
		commonWords.add("National Center");
		commonWords.add("Center");
		commonWords.add("Center of");
		commonWords.add("University");
		commonWords.add("University of");
		commonWords.add("Laboratory");
		commonWords.add("Laboratory of");
		commonWords.add("College");
		commonWords.add("College of");
		
		for (String s : commonWords) {
			int length = s.length();
			int position = result.toLowerCase().indexOf(s.toLowerCase());
			if (position != -1) {
				result = result.substring(0, position) + result.substring(position + (length ));
			}
		}
		//System.out.println(result);
		return result;
		
		
		
	}
	
	@Override
	public boolean equals(Object objParam) {
	
		return super.equals(objParam);
	}
	
	@Override
	public int hashCode() {
		
		return super.hashCode();
	}
	
	private static void test(int x, int y, List<Integer> list) {
		
		x++;
		System.out.println("x" + x + " y" + y);
		list.add(55);
		list = new ArrayList<>();
		System.out.println(list);
		
		
		
		
	}
}
