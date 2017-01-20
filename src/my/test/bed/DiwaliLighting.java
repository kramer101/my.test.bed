package my.test.bed;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.StringUtils;

/**
 * Implementation of Diwali Lightings challenge posted on 
 * https://code.google.com/codejam/contest/dashboard?c=5264487#s=p0
 *
 */
public class DiwaliLighting {
	
	private Character search = 'B';
	private String inputFilePath;
	private List<InputTestCase> cases = new LinkedList<>();
	
	public DiwaliLighting(final String inputFilePathParam) throws Exception {
		inputFilePath = inputFilePathParam;
		loadInput();
	}
	
	
	/**
	 * Parsing and loading input file into the List of strings.
	 * @throws IOException
	 */
	protected void loadInput() throws IOException {
		
		File inputFile = new File(inputFilePath);
		
		List<String> inputLines = 
				FileUtils.readLines(inputFile, Charset.defaultCharset());
		
		//begin with line 1, as the line 0 is a number of tests, ignore that.
		for (int i = 1; i < inputLines.size(); i+=2) {
		
			String pattern = inputLines.get(i);
			String boundaries = inputLines.get(i+1);
			
			String[] boundariesSplit = StringUtils.split(boundaries, " ");
			long start = Long.valueOf(boundariesSplit[0]);
			long end = Long.valueOf(boundariesSplit[1]);
			
			InputTestCase caseItem = new InputTestCase();
			caseItem.setStart(start);
			caseItem.setEnd(end);
			
			caseItem.setPattern(pattern);
			
			cases.add(caseItem);
		
		}
		
		System.out.println(cases.size() + " cases loaded");
		
	}
	
	/**
	 * Parsing and loading pattern.
	 * @param pattern pattern as string
	 * @return pattern as List of characters
	 */
	protected List<Character> loadPattern(final String pattern) {
		if  (pattern == null || pattern.length() == 0) {
			throw new IllegalArgumentException("Pattern must not be blank");
		}
		char[] patternChar = pattern.toCharArray();
		
		List<Character> basePatternAsList = new LinkedList<Character>();
		for (char c : patternChar) {
			basePatternAsList.add(c);
			
		}
		
		return basePatternAsList;
	}
	
	
	/**
	 * Processing a case and producing the output result.
	 * @param caseIndex case index
	 * @param pattern pattern
	 * @param start starting point
	 * @param end end point
	 * @return Case as specified in requirements
	 */
	protected String processLine(final int caseIndex, final String pattern, final long start, final long end) {
		List<Character> basePattern = loadPattern(pattern);

		long searchCountInPattern = 0;

		//load search index where an element represents the position of a search letter within a single pattern
		Set<Long> searchIndex = new HashSet<Long>();
		for (int i = 0; i < basePattern.size(); i++) {
			Character item = basePattern.get(i);

			if (search == item) {
				searchIndex.add(Long.valueOf(i + 1));
				searchCountInPattern++;
			}
		}

		if (end < start) {
			throw new IllegalArgumentException("End cannot be less than start");
		}

		
		long count = 0;
		
		long evenStart = start;
		long evenEnd = end;

		//begin iteration from the start point until we hit the beginning of the complete pattern
		for (long i = start;; i++) {
			long iToBase = i % basePattern.size();
			if (iToBase == 0) {
				iToBase = basePattern.size();
			}

			if (iToBase == 1) {
				evenStart = i;
				break;
			}
			if (searchIndex.contains(iToBase)) {
				count++;

			}

			if (iToBase == basePattern.size()) {
				evenStart = i;
				break;
			}

		}

		//iterate backward from the end point until we hit the end of the complete pattern
		for (long i = end;; i--) {
			long iToBase = i % basePattern.size();
			if (iToBase == 0) {
				iToBase = basePattern.size();
			}

			if (iToBase == basePattern.size()) {
				evenEnd = i;
				break;
			}

			if (searchIndex.contains(iToBase)) {
				count++;
			}
			if (iToBase == 1) {
				evenEnd = i;
				break;
			}

		}

		long evenRange = evenEnd - (evenStart - 1);

		//now that we counted the instances of the search letter in the incomplete patterns (at the start and at the end)
		//we simply calculate the number of occurrences of the search letter within the infinite
		//set of the complete patterns.
		//This works because the number of the search letter occurrences within a single pattern is constant.
		count = count + searchCountInPattern * (evenRange / basePattern.size());
		return "Case #" + (caseIndex + 1) + ": " + count;

	}

	public void count() throws IOException {
		List<String> outputLines = new ArrayList<String>();
		
		for (int c = 0; c < cases.size(); c++) {
			
			InputTestCase caseItem = cases.get(c);
			System.out.println("Processing case " + (c + 1)); 
			String outputLine = processLine(c, caseItem.getPattern(), caseItem.getStart(), caseItem.getEnd());
			
			outputLines.add(outputLine);
			System.out.println(outputLine);	
			
			FileUtils.writeLines(new File("diwali-lightning-out.out"), outputLines);
		}
		
	}
	
	public static void main(String[] args) {
		try {
			long startTime = System.currentTimeMillis();
			String inputFilePath = args[0];
			DiwaliLighting program = new DiwaliLighting(inputFilePath);
			program.count();
			long endTime = System.currentTimeMillis();
			long time = endTime - startTime;
			System.out.println("***Completed in " + time + "ms ***");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * A class that represents a single input test case.
	 * 
	 *
	 */
	public class InputTestCase {
		private String pattern;
		private long start;
		private long end;
		public String getPattern() {
			return pattern;
		}
		public void setPattern(String pattern) {
			this.pattern = pattern;
		}
		public long getStart() {
			return start;
		}
		public void setStart(long start) {
			this.start = start;
		}
		public long getEnd() {
			return end;
		}
		public void setEnd(long end) {
			this.end = end;
		}
		
		
		
	}
	
}
