public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	int  a, b, c;
	
	System.out.print("a'yı giriniz: ");
	a = kb.nextInt();
	
	System.out.print("b'yi giriniz: ");
	b = kb.nextInt();
	
	System.out.print("c'yi giriniz: ");
	c = kb.nextInt();
	
	if (a + b >c) 
	    if (a + c > b)
	        if (b + c > a)
	            System.out.print("üçgendir");
	        
	        
	        else 
	            System.out.print("üçgen değildir");
	        
	    else 
	        System.out.print("üçgen değildir");
	    
	 else 
	    System.out.print("üçgen değildir");
	
	
	}
}