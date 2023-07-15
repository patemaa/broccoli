public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	int i, n;
	
	System.out.print("n'i giriniz: ");
	n = kb.nextInt();
	
	if (n % 2 == 0)
	    for (i = 0; i <= n; i = i + 2)
	        System.out.println(i);
	else
	    for (i = 1; i <= n; i = i + 2)
	        System.out.println(i);
	   
	}
}
