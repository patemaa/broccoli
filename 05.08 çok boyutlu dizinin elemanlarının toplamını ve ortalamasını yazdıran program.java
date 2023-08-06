public class Main
{
	public static void main(String[] args) {
        int m[][] = {{5, 7, 3},
                     {15, 6, 10},
                     {22, 9, 1},
                     {11, 14, 18}};
        
        int i, k, row, col, sum, avg;
        row = 4;
        col = 3;
        
        sum = 0;
    
        for (i = 0; i < row; i = i + 1) 
            for (k = 0; k < col; k = k + 1)
               sum = sum + m[i][k];
            
        avg = sum / (row * col);
        
            System.out.println("toplam = " + sum + " ortalama = " + avg);
        
	}
}
