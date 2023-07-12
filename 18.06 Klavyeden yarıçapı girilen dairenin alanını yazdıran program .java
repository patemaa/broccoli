public class Main
{
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner (System.in);
		double yarıçap, pi, area;
		
		System.out.print("Dairenin yarıçapını giriniz: ");
		yarıçap = kb.nextDouble();
		
		pi=3.14159;
		
		area = yarıçap* yarıçap* pi;
		
		System.out.print("Dairenin alanı: " + area);
	}
}
