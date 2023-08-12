public class Main
{
	public static void main(String[] args) {
        int m[][] = new int [5][5];
        int i, k, row, col, count;
        row = 5;
        col = 5;
        
        count = 0;
        
        for (i = 0; i < row; i = i + 1)
            for (k = 0; k <= i; k = k + 1){
                count = count + 1;
                m[i][k] = count;
            }
            
        for (i = 0; i < row; i = i + 1){
            for ( k = 0; k < col; k = k + 1){
                if (m[i][k] <10)
                    System.out.print(" ");
                System.out.print(m[i][k] + " ");
            }
            System.out.println();

}

	}
}
