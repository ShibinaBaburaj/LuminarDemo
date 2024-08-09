package my_space;

public class MatrixAddition3by3 {

	public static void main(String[] args) {
		
		int first[][]= {{2,2,3},{1,5,6},{7,5,2}};
		int second[][]= {{1,1,3},{2,5,6},{3,2,1}};
		
		int sum[][]= new int[3][3];
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				sum[i][j]= first[i][j] + second[i][j];
				System.out.print(sum[i][j]+" ");
			}
			System.out.println();
		}

	}

}
