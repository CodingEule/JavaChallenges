package Arrays;

public class Felder {

	public static void main(String[] args) {
		double[] a;
		int i, j;
		
		a = new double[5];
		for(i = 0; i<a.length; i++) {
			a[i] = i*i;
		}
		for(i=0; i<a.length; i++) {
			System.out.println(a[i]);
		}
		System.out.println();
		
		double [][] m = new double[4][3]; // 4x3-Matrix
		for(i=0; i<m.length; i++) {
			for(j=0; j<m[i].length; j++) {
				m[i][j] = i*j;
			}
		}

		for(i=0; i<m.length; i++) {
			for(j=0; j<m[i].length; j++) {
				System.out.print(m[i][j] + " " );
			}
			System.out.println();
		}
		
		System.out.println();
		
		int[][] dreieck = {{1}, {2, 3}, {4, 5, 6}};
		
		for(i=0; i<dreieck.length; i++) {
			for(j=0; j<dreieck[i].length; j++) {
				System.out.print(dreieck[i][j] + " " );
			}
			System.out.println();
		}
	}

}
