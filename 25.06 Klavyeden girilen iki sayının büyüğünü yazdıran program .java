public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	int ilk, ikinci;
		
	System.out.print("İlk sayıyı giriniz: ");
	ilk = kb.nextInt();
	
	System.out.print("İkinci sayıyı giriniz: ");
	ikinci = kb.nextInt();
	
	if (ilk > ikinci)
	System.out.print(ilk);
	
	else
	System.out.print(ikinci);
		
	}
}
