public class Main
{
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner (System.in);
		int n;
		
		System.out.print("Bir sayı giriniz: ");
		n =kb.nextInt();
		
		if (n < 0)
		    n = n*-1;
		    
		    System.out.print(n);
		}
}
