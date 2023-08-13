public class Main
{
	public static void main(String[] args) {
                 //0  1  2  3  4   5   6   7  8   9
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	    int i, k, size, temp, flag;
    
        size = 10; 
        flag = 0;
        

        while (flag == 0) {
            flag = 1;
            for (k = 0; k < size - 1; k = k + 1)
                if (a[k] > a[k + 1]) {
                    flag =0;
                    temp = a[k];
                    a[k] = a[k + 1];
                    a[k + 1] = temp;
                
                }
            }
        for (k = 0; k < size; k = k + 1)
            System.out.print(a[k] + " ");
        System.out.println();


	}
}