public class Main
{
	public static void main(String[] args) {
    //             0  1  2  3  4  5  6  7  8  9 10 11 12 13 14 15  16 17 18 19
        int a[] = {5, 5, 3, 7, 8, 5, 7, 7, 7, 3, 8, 9, 8, 9, 8, 8, 15, 5, 8, 4};
	    int i, k, size, flag, count;
        size = 20;
        
        for (i = 0; i < size; i = i + 1) {
            //Daha önce sayılmış mı?
            flag = 0;    //sayılmamış
            for (k = 0; k < i; k = k + 1)
                if (a[i] == a[k])
                flag = 1;   //sayılmış
                
            // Sayılmamışsa sayılıyor...
            if (flag == 0) {
                count = 1;
                for (k = i + 1; k < size; k = k + 1)
                    if (a[i] == a[k])
                        count = count + 1;
                System.out.println(a[i] + " : " + count);
            }
            
            
            
        }



	}
}