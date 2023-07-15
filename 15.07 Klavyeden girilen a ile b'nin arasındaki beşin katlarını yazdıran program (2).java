public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	int i, a, b;
	
	System.out.print("a'yı giriniz: ");
	a = kb.nextInt();
	
	System.out.print("b'yi giriniz: ");
	b = kb.nextInt();
	
	  for (i = a + (5 - a % 5) ; i < b; i = i + 5)
	      System.out.println(i);
	   
	}
}
