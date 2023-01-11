package Arrays;

public class MatrixMultiplikation {

	public static void main(String[] args) {
		final int N = 4;
		
		int[][] a = {{ 1,  2,  3,  4},
					 { 5,  6,  7,  8},
					 { 9, 10, 11, 12},
					 {13, 14, 15, 16}};
		int[][] b = {{17, 18, 19, 20},
				 	 {21, 22, 23, 24},
				 	 {25, 26, 27, 28},
				 	 {29, 30, 31, 32}};
		int[][]c = new int[N][N];
		
		//Matrix-Multiplikation
		
		 for(int i=0; i<N; i++) {
			 for(int j=0; j<N; j++) {
				 c[i][j] = 0;
				 for(int k=0; k<N; k++) {
					 c[i][j] = c[i][j] + (a[i][k] * b[k][j]);
				 }
			 }
		 }
		//Ausgabe
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				System.out.printf("%6d", c[i][j]);
			}
			System.out.println();
		}
		}

	}


