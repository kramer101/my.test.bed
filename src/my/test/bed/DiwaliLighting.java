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

public class DiwaliLighting {
	
	private Character search = 'B';
	private String inputFilePath;
	private List<InputTestCase> cases = new LinkedList<>();
	
	public DiwaliLighting(final String inputFilePathParam) throws Exception {
		inputFilePath = inputFilePathParam;
		loadInput();
	}
	
	
	protected void loadInput() throws IOException {
		
		File inputFile = new File(inputFilePath);
		
		List<String> inputLines = 
				FileUtils.readLines(inputFile, Charset.defaultCharset());
		
		//begin with line 1, as the line 0 is a number of tests
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
	
	
	protected String processLine(final int caseIndex, final String pattern, final long start, final long end) {
		List<Character> basePattern = loadPattern(pattern);

		
		Set<Long> searchIndex = new HashSet<Long>();
		for (int i = 0; i < basePattern.size(); i++) {
			Character item = basePattern.get(i);
			
			if (search == item) {
				searchIndex.add(Long.valueOf(i+1));
			}
		}
		
		if (end < start) {
			throw new IllegalArgumentException("End cannot be less than start");
		}
		int count = 0;
		
		
		
		for (long i = start; i <= end; i++) {
			
			long indexToBase = i;
			if (indexToBase > basePattern.size()) {
				indexToBase = indexToBase % basePattern.size();
			}
			if (indexToBase == 0) {
				indexToBase = basePattern.size();
			}
			if (searchIndex.contains(indexToBase)) {
				count++;
			} 
		}
		
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
			String inputFilePath = args[0];
			DiwaliLighting program = new DiwaliLighting(inputFilePath);
			program.count();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
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
