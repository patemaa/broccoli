public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	    //         0, 1, 2, 3, 4,  5,  6,  7, 8, 9, 
	    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	    int i, size, n; 
	    size = 10;
	   
	    System.out.println("n'i giriniz: ");
	    n = kb.nextInt();
	    
	    for (i = 0; i < n; i = i + 1)
    	System.out.println(a[i]);
	}
}
