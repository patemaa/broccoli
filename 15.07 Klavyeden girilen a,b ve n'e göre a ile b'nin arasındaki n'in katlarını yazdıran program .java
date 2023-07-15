public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	int i, a, b, n;
	
	System.out.print("a'yı giriniz: ");
	a = kb.nextInt();
	
	System.out.print("b'yi giriniz: ");
	b = kb.nextInt();
	
	System.out.print("n'i giriniz: ");
	n = kb.nextInt();
	
	  for (i = a + (n - a % n) ; i < b; i = i + n)
	      System.out.println(i);
	   
	}
}
