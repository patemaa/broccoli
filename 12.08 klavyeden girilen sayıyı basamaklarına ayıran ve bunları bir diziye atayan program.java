public class Main
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
        
        int a[] = new int [10];
        int p, n, digit, i;
        
        System.out.print("n'yi giriniz : ");
        n = kb.nextInt();
        
        p = 0;
        
        while (n != 0) {
            digit = n % 10;
            a[p] = digit;
            p = p + 1;
            n = n / 10;
        }
        for ( i = 0; i < p; i = i + 1)
        System.out.println(a[i]);
	}
}

