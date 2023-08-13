public class Main
{
	public static void main(String[] args) {
        //         0   1  2  3   4  5   6   7  8   9 
        int a[] = {4,  8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = {8, 13, 6, 12, 4, 5, 19, 1, 14, 25};
        int c[] = {6, 18, 8, 14, 2, 4, 72, 7, 28, 52};
	    int i, k, m, indis, size, flag;
        size = 10;
        
        for (i = 0; i < size; i = i + 1)
            for (k = 0; k < size; k = k + 1)
                if (a[i] == b[k]) {
                    flag = 0;  //yok
                    for (m = 0; m < size; m = m + 1)
                        if (a[i] == c[m])
                            flag = 1;  //var
                    if (flag == 0)   
                        System.out.println(a[i] + " ");
                }
	}
} 