public class Main
{
	public static void main(String[] args) {
        int ma[][] = {{ 5,  7,   3},
                     {15,  6,  10},
                     {22,  9,   1},
                     {11, 14,  18}};
                     
        int mb[][] = new int [3][4];
        
        int i, k, rowA, colA, rowB, colB ;
        rowA = 4;
        colA = 3;
        rowB = 3;
        colB = 4;
        
        for (i = 0; i < rowA; i = i + 1) 
            for (k = 0; k < colA; k = k + 1) 
                mb[k][i] = ma[i][k];
               
        for (i = 0; i < rowB; i = i + 1)  {
            for (k = 0; k < colB; k = k + 1)     
                System.out.print(mb[i][k] + " ");
                System.out.println();
        }
                
    }
}