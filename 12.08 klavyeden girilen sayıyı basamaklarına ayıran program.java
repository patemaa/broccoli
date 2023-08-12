public class Main
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
        
        int n, digit;
        
        System.out.print("n'yi giriniz : ");
        n = kb.nextInt();
        
        while (n != 0) {
            digit = n % 10;
            System.out.println(digit);
            n = n / 10;
        }

	}
}

