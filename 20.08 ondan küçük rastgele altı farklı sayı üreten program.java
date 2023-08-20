public class Main
{
	public static void main(String[] args) {
        int a[] = new int [6];
        java.util.Random generator = new java.util.Random();
        int n, i, size, count, flag;
        size = 6;
        
        count = 0;
        while (count != size) {
            n = generator.nextInt(10);
            
            //farklı mı diye bakılıyor.
            flag = 0; // farklı 
            for (i = 0; i < count; i = i + 1)
                if (n == a[i])
                flag = 1;//farklı değil.
            
            if (flag == 0){
                a[count] = n;
                count = count + 1;
            }
        } 
            for (i = 0; i < size; i = i + 1)
                System.out.print(a[i] + " ");
            
    }
	
}