public class Main
{
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner (System.in);
		int a, b;
		
		System.out.print("a'yı giriniz: ");
		a = kb.nextInt();
		
		System.out.print("b'yi giriniz: ");
		b = kb.nextInt();
		
		if (a % b == 0 )
		    System.out.print("tam katıdır");
		
		else
		    System.out.print("tam katı değildir");
		
	    
	}
}
