public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	int i, a, b;
	
	System.out.print("a'yı giriniz: ");
	a = kb.nextInt();
	
	System.out.print("b'yi giriniz: ");
	b = kb.nextInt();
	
	if (a < b)
	    for (i = a; i <= b; i = i + 1)
	        System.out.println(i);
	else 
	    if (a > b)
	        for (i = a; i >= b; i = i - 1)
	            System.out.println(i);
	    else 
	       System.out.println(a); 
	}
}
