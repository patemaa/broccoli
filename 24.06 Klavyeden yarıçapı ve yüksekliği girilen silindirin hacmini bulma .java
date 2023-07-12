public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	double yarıçap, yükseklik, pi, area;
	
	System.out.print("Silindirin yarıçapını giriniz: ");
	yarıçap = kb.nextDouble();
	
	System.out.print("Silindirin yüksekliğini giriniz: ");
	yükseklik = kb.nextDouble();
	
	pi = 3.14159;
	
	area = yarıçap* yarıçap* pi* yükseklik;
	
	System.out.print("Silindirin hacmi: " + area );
	}
}