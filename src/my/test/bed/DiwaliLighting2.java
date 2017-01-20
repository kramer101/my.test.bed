package my.test.bed;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DiwaliLighting2 extends DiwaliLighting {
	
	private Character search = 'B';
	
	
	public DiwaliLighting2(final String inputFilePathParam) throws Exception {
		super(inputFilePathParam);
		
	}
	
	
	
	@Override
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
		
		System.out.println(start % basePattern.size());
		System.out.println(end % basePattern.size());
		
		long range = end - start;
		System.out.println("range : " + range);
		
		long rangeRem = range % basePattern.size();
		System.out.println("range rem : " + rangeRem);
		System.out.println("number of patterns inside the range  : " + Math.floorDiv(range, basePattern.size()));
		
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

	
	
	public static void main(String[] args) {
		try {
			String inputFilePath = args[0];
			DiwaliLighting2 program = new DiwaliLighting2(inputFilePath);
			program.count();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	
}
