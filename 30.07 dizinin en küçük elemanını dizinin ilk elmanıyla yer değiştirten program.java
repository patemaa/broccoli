public class Main                      
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);

                 //0  1  2  3  4   5  6   7   8  9
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size, min, p;
        size = 10; 
        
        min = a[0];
        p = 0;
        
        for (i = 0; i < size; i = i + 1)
            if (a[i] < min){
                min = a[i];
                p = i;
            }
        
        a[p] = a[0];
        a[0] = min;
        
        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");
	}
}  
