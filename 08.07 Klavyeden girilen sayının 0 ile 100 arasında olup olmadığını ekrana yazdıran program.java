public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	int a;
	
	System.out.print("a'yı giriniz: ");
	a = kb.nextInt();
	
	if (a > 0)
	  if (100 > a)
	   System.out.print("arasında");
	  else
	      System.out.print("arasında değil");
	
	else 
	    System.out.print("arasında değil");
	}
}
