package my.test.bed;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * 
 * @author vyakovlev
 *
 */
public class BeatifulNumbers {
	
	private String inputPath;
	private List<String> inputLines;
	
	public BeatifulNumbers(final String inputPathParam) throws IOException {
		inputPath = inputPathParam;
		loadInput();
	}

	
	private void loadInput() throws IOException {
		File inputFile = new File(inputPath);
		inputLines=  FileUtils.readLines(inputFile, Charset.defaultCharset());
	}
	
	public void execute() {
		
		
	}
	
	
	
	public static void main(String[] args) {
		
		long decimal = 625;
		
		for (int base = 2; base <=36; base++) {
			
			
			System.out.println("base " + base + " " + Long.toString(decimal, base));
			
			
		
			double sumOfPositions = 0;
			
			double position = 0;
			for (int i = 0; ; i++) {
				
				position = Math.pow(base, i);
				sumOfPositions = sumOfPositions + position;
				
				
				if (sumOfPositions >= decimal) {
					break;
				}
			}
			
			
			
			if (sumOfPositions == decimal) {
				System.out.println("sumOfPositions: "+ sumOfPositions + "; base " + base);
				System.out.println("base " + base + " " + Integer.parseInt(String.valueOf(decimal), base));
				break;
			}
		}
	
	}
}
