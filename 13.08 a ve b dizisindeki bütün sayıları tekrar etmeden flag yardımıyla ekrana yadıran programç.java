public class Main
{
	public static void main(String[] args) {
        //         0   1  2  3   4  5   6   7  8   9 
        int a[] = {4,  8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = {8, 13, 6, 12, 4, 5, 19, 1, 14, 25};
	    int i, k, indis, size, flag;
        size = 10;
        
        for (i = 0; i < size; i = i + 1){
            System.out.print(a[i] + " ");
            flag = 0;  //yok    
            for (k = 0; k < size; k = k + 1)
                if (a[k] == b[i]) 
                flag = 1;
            
            if (flag == 0)
            System.out.print(b[i] + " ");
        }
        
	}
}
