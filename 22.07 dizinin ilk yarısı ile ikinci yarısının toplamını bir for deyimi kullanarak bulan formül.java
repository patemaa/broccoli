public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	    //         0, 1, 2, 3, 4,  5,  6,  7, 8, 9, 
	    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	    int i, size, sumEven, sumOdd; 
	    size = 10;
	   
	    sum1 = 0;
	    sum2 = 0;
	    
	    for (i = 0; i < size / 2; i = i + 1)
	    sum1 = sum1 + a[i];
    	sum2 = sum2 + a[size / 2 + i];   
    	    
    	    
    	   	
    	System.out.println("ilk yarının toplamı: " + sum2);
    	System.out.println("ikinci yarının toplamı: " + sum1);
        
    
    	
    	
	}
}
