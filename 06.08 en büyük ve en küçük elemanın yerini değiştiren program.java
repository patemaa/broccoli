public class Main
{
	public static void main(String[] args) {
        int m[][] = {{ 5,  7,   3},
                     {15,  6,  10},
                     {22,  9,   1},
                     {11, 14,  18}};
        
        int i, k, row, col, max, rMax, rMin, min, cMax, cMin;
        row = 4;
        col = 3;
        
        min = m[0][0];
        rMax = 0;
        cMax = 0;
        
        max = m[0][0];
        rMin = 0;
        cMin = 0;
        
        for (i = 0; i < row; i = i + 1) 
            for (k = 0; k < col; k = k + 1)
                if (m[i][k] > max){
                    max = m[i][k];
                    rMax = i;
                    cMax = k;
                }
                else if (m[i][k] < min) {
                    min = m[i][k];
                    rMin = i;
                    cMin = k;   
                    }
                
                m[rMax][cMax] = min;
                m[rMin][cMin] = max;
        
        for (i = 0; i < row; i = i + 1) {
            for (k = 0; k < col; k = k + 1)        
                System.out.print(m[i][k] + " ");
                System.out.println();
        }
                
    }
}