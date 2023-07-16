public class Main
{
	public static void main(String[] args) {
	
	    int a[] = new int[5];
	    int i;
	    
        for (i = 0; i < 5; i = i + 1)
	    a[i] = (i + 1) * 2;
	    
	    for (i = 0; i < 5; i = i + 1)
	        System.out.println(a[i]);
	}
}
