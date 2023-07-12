public class Main
{
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner (System.in);
		int a, b;
		
		System.out.print("a'yı giriniz: ");
		a = kb.nextInt();
		b = -a;
		
		if (a > b)
		    System.out.print(a);
		else 
		    System.out.print(b);
		}
}
