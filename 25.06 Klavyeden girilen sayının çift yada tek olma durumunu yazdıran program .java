public class Main
{
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner (System.in);
		int n;
		
		System.out.print("Bir sayı giriniz: ");
		n =kb.nextInt();
		
		if (n % 2 == 0)
		    System.out.print("çift");
		
		else
		    System.out.print("tek");
		}
}
