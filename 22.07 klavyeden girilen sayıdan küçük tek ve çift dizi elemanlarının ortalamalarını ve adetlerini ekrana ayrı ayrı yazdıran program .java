public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	    //         0, 1, 2, 3, 4,  5,  6,  7, 8, 9, 
	    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	    int i, size, n, sumOdd, countOdd, sumEven, countEven; 
	    size = 10;
	   
	    System.out.println("n'i giriniz: ");
	    n = kb.nextInt();
	   
	    sumOdd = 0;
	    countOdd = 0; 
	    sumEven = 0; 
	    countEven = 0;
	   
	   for (i = 0; i < size; i = i + 1)
	         if (a[i] < n) 
	            if (a[i] % 2 != 0){
    	            System.out.println(a[i]);
    	            sumOdd = sumOdd + a[i];
    	            countOdd = countOdd + 1;
	            }    
	            else {
	                countEven = countEven + 1;
	                sumEven = sumEven + a[i];
	            }
	   
	   System.out.println("teklerin adedi: " + countOdd);
	   System.out.println("teklerin toplamı: " + sumOdd);
	   System.out.println("çiftlerin adedi: " + countEven);
	   System.out.println("çiftlerin toplamı: " + sumEven); 	    
        	    
       
	}
}
