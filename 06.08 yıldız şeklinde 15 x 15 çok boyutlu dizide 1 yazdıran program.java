public class Main
{
	public static void main(String[] args) {
	    
        int m[][] = new int [15][15];
        
        int i, k, row, col, r, c;
        row = 15;
        col = 15;
        r = 0;
        c = 0;
        
        for (i = 0; i < row; i = i + 1) 
             for (k = 0; k < col; k = k + 1) {  
            m[i][i] = 1;
            m[i][col - 1 - i] = 1;
            m[i][col / 2] = 1;
            m[col / 2][k] = 1;
        }
        for (i = 0; i < row; i = i + 1)  {
            for (k = 0; k < col; k = k + 1)     
                System.out.print(m[i][k] + " ");
                System.out.println();
        }
                
    }
}