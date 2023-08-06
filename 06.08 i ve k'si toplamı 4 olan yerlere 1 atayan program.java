public class Main
{
	public static void main(String[] args) {
	    
        int m[][] = new int [5][5];
        
        int i, k, row, col, r, c;
        row = 5;
        col = 5;
        r = 0;
        c = 0;
        
        for (i = 0; i < row; i = i + 1) 
            m[i][col - 1 - i] = 1;
               
        for (i = 0; i < row; i = i + 1)  {
            for (k = 0; k < col; k = k + 1)     
                System.out.print(m[i][k] + " ");
                System.out.println();
        }
                
    }
}