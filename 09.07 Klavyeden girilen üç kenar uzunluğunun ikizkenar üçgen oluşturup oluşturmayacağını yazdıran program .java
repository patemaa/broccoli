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
	
    if (a == b)
        if (c != b)
            
            System.out.print("ikizkenar üçgendir");
            
        else 
            System.out.print("ikizkenar üçgen değildir");
    else 
        if (b == c)
            if (a != c)
                
                System.out.print("ikizkenar üçgendir");
               
            else 
                System.out.print("ikizkenar üçgen değildir");
        else 
              if (a == c)
                if (b != c)
                    
                    System.out.print("ikizkenar üçgendir");
                    
                else 
                    System.out.print("ikizkenar üçgen değildir");
            else 
                System.out.print("ikizkenar üçgen değildir");
            
            
    
	   
	   
	
	
	}
}