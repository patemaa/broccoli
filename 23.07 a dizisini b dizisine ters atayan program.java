public class Main
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);

                 //0  1  2  3  4   5  6   7   8  9
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = new int[10];
        int i, size;
        size = 10; 
 
        for (i = 0; i < size; i = i + 1)
                b[size - 1 -i] =  a[i];
        
        for (i = 0; i < size; i = i + 1)
            System.out.print(b[i] + " ");
    }
}