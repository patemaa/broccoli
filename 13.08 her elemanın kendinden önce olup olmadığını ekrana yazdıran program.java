public class Main
{
	public static void main(String[] args) {
    //             0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15  16 17 18 19
        int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
        java.util.Scanner kb = new java.util.Scanner(System.in);
	    int i, k, indis, size, flag;
        size = 20;
        
        for (indis = 0; indis < size; indis = indis + 1){
            flag = 0; //yok
            
        for (i = 0; i < indis; i = i + 1)
            if (a[i] == a[indis]) 
                flag = 1;  //var
        
        System.out.print(indis + " nolu eleman " + a[indis] + " kendinden önce : ");      
        if (flag == 0)
            System.out.println("yok");
        else 
            System.out.println("var");
            
        }
	}
}