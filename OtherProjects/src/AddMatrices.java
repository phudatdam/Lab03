import java.util.Arrays;

public class AddMatrices {
	public static void main(String[] args) {
		int[][] matrix1 = {
				{0, 2, 0, 9},
			    {1, 9, 4, 5}
	    };
	    int[][] matrix2 = {
			    {3, 0, 0, 4},
			    {1, 9, 7, 5}
	    };
	    
	    int[][] resultMatrix = new int[matrix1.length][matrix1[0].length];
	    
	    for (int row = 0; row < matrix1.length; row++) {
	    	for (int col = 0; col < matrix1[0].length; col++) {
	    		resultMatrix[row][col] = matrix1[row][col] + matrix2[row][col];
	    	}
	    }
	    
	    System.out.println(Arrays.deepToString(resultMatrix));
	}
}
