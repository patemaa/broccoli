public class Main
{
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner (System.in);
		double c, f;
		
		System.out.print("fahrenheit cinsinden sıcaklık değerini giriniz: ");
		f = kb.nextDouble();
		
		c = 5.0 / 9.0 * (f -32);
		System.out.print("f: " + f + " c : " + c );
		}
}
