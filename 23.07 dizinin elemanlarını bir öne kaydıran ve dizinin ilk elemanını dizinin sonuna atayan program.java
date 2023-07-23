public class Main
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);

                 //0  1  2  3  4   5  6   7   8  9
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size, temp;
        size = 10; 
        
        temp = a[0];
        
        for (i = 1; i < size; i = i + 1)
            a[i - 1] = a[i];
        
        a[size - 1] = temp;
        
        for (i = 0; i < size; i = i + 1)
            System.out.println(a[i]);
    }
}