public class Main
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);

                 //0  1  2  3  4   5  6   7   8  9
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = new int[10];
        int i, size, temp, k, n;
        size = 10; 
        
        System.out.println("n'yi giriniz: ");
        n = kb.nextInt();
        
        for (i = 0; i < n; i = i + 1)
                b[i] =  a[i];
        
        for (i = n; i < size; i = i + 1) 
                a[i - n] = a[i];
        
        for (i = 0; i < n; i = i + 1)
                a[size - n + i] = b[i];
        
        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");
        
    }
}