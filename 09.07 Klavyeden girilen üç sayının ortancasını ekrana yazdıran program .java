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
	
    if (a > b)
        if (c > a)
            System.out.print(a);
        else
            if(b > c)
            System.out.print(b);
            else 
            System.out.print(c);
    else
        if (c > b)
        System.out.print(b);
        
        else
            if (c > a)
                System.out.print(c);
	        else 
	            System.out.print(a);
	}
}