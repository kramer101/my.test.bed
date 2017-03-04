package my.test.bed;

import java.math.BigInteger;
import java.util.Scanner;

public class MiscTest3 {

	
	public static void main(String[] args) {
		
		
		Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        
        BigInteger result = BigInteger.valueOf(1);

        for (long i = 1; i <= input; i++) {
            
            BigInteger indexAsBig = BigInteger.valueOf(i);
            result =  result.multiply(indexAsBig);
            
        }
       
        System.out.println(result);
        
		
	        
	}
}
