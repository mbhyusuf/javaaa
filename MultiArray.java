
public class MultiArray {

	public static void main(String[] args) {
		
		int[][] x = {{1,3,5,7},{2,4,6,8}};
		
		for (int i = 0; i < x.length; i++) {
			
			for (int j = 0; j < x[i].length; j++) {
		        
				System.out.println(x[i][j]);
		    }
		}

	}

}
