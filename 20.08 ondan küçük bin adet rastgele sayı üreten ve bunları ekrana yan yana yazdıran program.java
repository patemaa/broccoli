public class Main
{
	public static void main(String[] args) {

        java.util.Random generator = new java.util.Random();
        int n, i, total;

        total = 1000;
        
        for (i = 1; i <= total; i = i + 1){
            n = generator.nextInt(10);
            System.out.print(n + " ");
        }
	}
}
