
public class Skalar {

	public static void main(String[] args) {
		int[][] a = new int[10][10];
		a=skalarProdukt(a,2);
	}
	
	public static int[][] skalarProdukt (int[][]a, int b){
		for (int i = 0;i<10;i++)
			for (int j = 0;j<10;j++)
			a[i][j]=a[i][j]*b;
		return a;
	}

}
