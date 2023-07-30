public class Main                      
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);

                 //0  1  2  3  4   5  6   7   8  9
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int i, size, max, min, pMax, pMin, temp;
        size = 10; 
        
        temp = 0;
        min = a[0];
        max = a[0];
        pMax = 0;
        pMin = 0;
        
        for (i = 0; i < size; i = i + 1)
            if (a[i] > max){
                max = a[i];
                pMax = i;
            }   
            else if (a[i] < min){
                min = a[i];
                pMin = i;
            }
        
        a[pMax] = min;
        a[pMin] = max; 
      
        for (i = 0; i < size; i = i + 1)
            System.out.print(a[i] + " ");
        
        
        
      
        
        
        
	}
}  
