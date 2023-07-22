public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	    //         0, 1, 2, 3, 4,  5,  6,  7, 8, 9, 
	    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	    int i, size, count, sum; 
	    size = 10;
	    
	    sum = 0;
	    
	    count = 0;
	    
	    for (i = 0; i < size; i = i + 1)
	        if (a[i] % 2 != 0) {
	            System.out.println(a[i]);
	            count = count + 1;
	            sum = sum + a[i];    
	        }
	        
	  System.out.println("teklerin adedi: " + count);  
      System.out.println("teklerin toplamı: " + sum);  
	  System.out.println("teklerin ortalaması: " + sum / count);  
	}
}
