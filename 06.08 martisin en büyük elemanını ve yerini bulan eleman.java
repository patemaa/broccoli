public class Main
{
	public static void main(String[] args) {
        int m[][] = {{  5,  7,   3},
                     {-15, -6, -10},
                     { 22,  9,   1},
                     { 11, 14,  18}};
        
        int i, k, row, col, max, r, c;
        row = 4;
        col = 3;
        
        max = m[0][0];
        r = 0;
        c = 0;
        
        for (i = 0; i < row; i = i + 1) 
            for (k = 0; k < col; k = k + 1)
                if (m[i][k] > max){
                    max = m[i][k];
                    r = i;
                    c = k;
                }
        System.out.println("matrisin en büyük elemanı : " + max);
        System.out.print("satır no : " + r + " sütun no : " + c);
    }
}