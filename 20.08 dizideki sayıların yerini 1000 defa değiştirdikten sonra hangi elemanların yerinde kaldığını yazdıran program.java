public class Main
{
	public static void main(String[] args) {
                 //0  1  2  3  4   5  6   7   8   9
        int a[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        int b[] = {4, 8, 3, 1, 18, 9, 21, 20, 5, 17};
        
        java.util.Random generator = new java.util.Random();
        int i, size, index1, index2, total, temp, count;

        total = 1000;
        count = 0;
        size = 10;
        
        for (i = 1; i <= total; i = i + 1){
            index1 = generator.nextInt(size);
            index2 = generator.nextInt(size);
            temp = a[index1];
            a[index1] = a[index2];
            a[index2] = temp;
        }    
        
        for (i = 0; i < size; i = i + 1){
            System.out.print(a[i] + " ");
            if (a[i] < 10)
                System.out.print(" ");
        }
        System.out.println();
        
        for (i = 0; i < size; i = i + 1){
            System.out.print(b[i] + " ");
            if (b[i] < 10)
                System.out.print(" ");
        }
        System.out.println();
        
        for (i = 0; i < size; i = i + 1)
            if (a[i] == b[i])
                count = count + 1;
                
        System.out.println(count + " eleman yerinde kalmış.");    
	}
}
