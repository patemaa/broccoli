public class Main
{
	public static void main(String[] args) {
	    
	    //         0, 1, 2, 3, 4,  5,  6,  7, 8, 9, 
	    int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
	    int i, size;
	    size = 10; 
	    
	   
        for (i = 0; i < size; i = i + 1){
        if (a[i] % 2 != 0)
            System.out.println(a[i]);
        }
        
	}
}
