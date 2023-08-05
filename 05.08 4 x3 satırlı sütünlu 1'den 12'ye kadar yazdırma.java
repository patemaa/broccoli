public class Main
{
	public static void main(String[] args) {
        int m[][] = new int [4][3];
        int i, k, row, col, count;
        row = 4;
        col = 3;
        
        count = 0;
    
        for (i = 0; i < row; i = i + 1)
            for (k = 0; k < col; k = k + 1){
                count = count + 1;
                   m[i][k] = count;
            }

        for (i = 0; i < row; i = i + 1) {
            for (k = 0; k < col; k = k + 1)
                System.out.print(m[i][k] + " ");
            System.out.println();
        }
	}
}
