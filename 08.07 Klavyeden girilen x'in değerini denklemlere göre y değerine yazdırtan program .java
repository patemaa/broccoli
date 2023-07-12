public class Main
{
	public static void main(String[] args) {
		java.util.Scanner kb = new java.util.Scanner(System.in);
		int k, x, t, y;
		
		System.out. print("x'i giriniz: ");
		x= kb.nextInt();
		
		if (x < 0) {
		k = 2;
		t = 0;
		}
		
		else
		    if(x <= 5) { 
		        k = -1;
		        t = 10;
		    }
		    
		    else {
		        k=  3;
		        t=-20;
		    }
		 
		 y = k*x + t;
	    
	   System.out.print("y = " + y);
		
		
	}
}
