public class Main
{
	public static void main(String[] args) {
    //             0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15  16 17 18 19
        int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
        int b[] = {7, 100, 8, 3, 125};


	    int i, k, indis, sizeA, sizeB, flag;
        sizeA = 20;
        sizeB = 5;
        
        for (i = 0; i < sizeB; i = i + 1){
            flag = 0;  //yok
            for (k = 0; k < sizeA; k = k + 1)
                if (a[k] == b[i]) 
                    flag = 1;  //var
        
        System.out.print(b[i] + " a[i] dizisinde : " );
        if (flag == 0)
            System.out.println("yok");
        else 
            System.out.println("var");
            
        }
        
	}
}