public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
        int n, sum;
        
        sum = 0;
        
        while (sum <= 1000) {
            System.out.print("n'yi giriniz :");
            n = kb.nextInt();
            sum = sum + n;
        }    
            System.out.println("Toplam : " + sum);
        
	}
}

