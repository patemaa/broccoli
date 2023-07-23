public class Main
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);

                 //0  1  2  3  4   5  6   7   8  9
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size, temp, n, s;
        size = 10; 
        
        System.out.println("s'yi giriniz: ");
        s = kb.nextInt();
        System.out.println("n'yi giriniz: ");
        n = kb.nextInt();
        
        temp = a[s];
        
        for (i = s + 1; i < s + n; i = i + 1)
              a[i - 1] = a[i];
        
        a[n + s - 1] = temp;
        
        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");
    }
}