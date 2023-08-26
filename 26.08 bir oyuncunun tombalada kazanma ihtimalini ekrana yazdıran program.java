public class Main
{
	public static void main(String[] args) {
        int a[] = new int [3];
        java.util.Random generator = new java.util.Random();
        int i, k, size, n, count, flag;
        double total, win, ratio;
        size = 3;
        
        total = 1000000.0;
        win = 0;
        
        for (k = 1; k <= total; k = k + 1) { 
            count = 0;
            while (count != size) {
                n = generator.nextInt(90) + 1;
                flag = 0;  //ÜRETİLMEMİŞ
                for (i = 0; i < count; i = i + 1)
                    if (n  == a[i]) 
                        flag = 1; //ÜRETİLMİŞ
                if (flag == 0){
                    a[count] = n;
                    count= count + 1;
                }
	        }
                if (a[0] + a[1] + a[2] < 101)
                win = win + 1;
        }    
        
        ratio = win / total * 100;
        
        
        System.out.println("oyuncunun kazanma oranı : %" + ratio);
    
	}
}