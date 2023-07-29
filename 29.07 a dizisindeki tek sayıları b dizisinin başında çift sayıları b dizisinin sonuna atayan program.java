public class Main
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);

                 //0  1  2  3  4   5  6   7   8  9
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = new int[10];
        int i, size, temp, po, pe;
        size = 10; 
        
        po = 0;
        pe = size - 1 ;
        
        for (i = 0; i < size; i = i + 1)
             if (a[i] % 2 != 0){
            b[po] = a[i];
            po = po + 1;
            }
            
            else {
                b[pe] = a[i];
                pe = pe - 1;
            }    
               
        for (i = 0; i < size; i = i + 1)
            System.out.print(b[i] + " ");
            
    }
} 
