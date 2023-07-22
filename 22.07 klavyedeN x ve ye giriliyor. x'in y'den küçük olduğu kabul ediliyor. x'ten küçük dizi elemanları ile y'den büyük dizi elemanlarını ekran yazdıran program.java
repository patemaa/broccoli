public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	    //         0, 1, 2, 3, 4,  5,  6,  7, 8, 9, 
	    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	    int i, size, x, y; 
	    size = 10;
	   
	    System.out.println("x'i giriniz: ");
	    x = kb.nextInt();
	    System.out.println("y'yi giriniz: ");
	    y = kb.nextInt();
	    
	    for (i = 0; i < size; i = i + 1)
	         if (a[i] < x)  
	            System.out.println(a[i]);
	         else
	            if (a[i] > y) 
	                System.out.println(a[i]);
	    
	}
}
