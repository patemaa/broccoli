public class Main
{
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner (System.in);
		int a, b, c;
		
		System.out.print("a'yı giriniz: ");
		a = kb.nextInt();
		
		System.out.print("b'yi giriniz: ");
		b = kb.nextInt();
		
		c = a;
		a = b;
		b = c;
		
		System.out.print("a = " + a);
		System.out.print("b = " + b);
	}
}
