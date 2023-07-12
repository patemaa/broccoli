public class Main
{
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner (System.in);
		int a, b, c, n;
		
		System.out.print("2 basamaklı bir sayı giriniz: ");
		n = kb.nextInt();
		
		a = n / 10;
		b = n % 10;
		
		c = a*a + b*b;
		
		System.out.print("Sonuç: " + c);
		
		}
}
