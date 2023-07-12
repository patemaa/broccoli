public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	int a;
	
	System.out.print("a'yı giriniz: ");
	a = kb.nextInt();
	
	if (100 > a)
	  if (a > 9)
	   System.out.print("2 basamaklı");
	  else
	      System.out.print("1 basamaklı");
	
	else 
	    System.out.print("3 basamaklı");
	}
}
