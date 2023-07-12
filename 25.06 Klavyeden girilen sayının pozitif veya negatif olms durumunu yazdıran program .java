public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	int a;
	
	System.out.print("a'yı giriniz: ");
	a = kb.nextInt();
	
	
	if (a > 0)
	    System.out.print("pozitif");
	
	else 
	    System.out.print("negatif");
	}
}
