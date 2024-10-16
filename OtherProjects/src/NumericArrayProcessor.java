import java.util.Arrays;

public class NumericArrayProcessor {
	public static void main(String[] args) {
	    int[] testArray = { 1789, 2035, 1899, 1456, 2013 };
	    
	    Arrays.sort(testArray);
	    
	    int sum = 0;
	    for (int i : testArray) {
	    	sum += i;
	    }
	    double average = (double) sum / testArray.length;
	    
	    System.out.println("Sorted array: " + Arrays.toString(testArray));
	    System.out.println("Sum: " + sum);
	    System.out.println("Average: " + average);
	}
}
