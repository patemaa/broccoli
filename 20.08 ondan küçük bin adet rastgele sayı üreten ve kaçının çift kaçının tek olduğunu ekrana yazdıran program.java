public class Main
{
	public static void main(String[] args) {

        java.util.Random generator = new java.util.Random();
        int n, i, total, countOdd, countEven;

        total = 1000;
        countOdd = 0;
        
        for (i = 1; i <= total; i = i + 1){
            n = generator.nextInt(10);
            countOdd = countOdd + n % 2;
        }
        countEven = total - countOdd;
        
        System.out.print("tekler: " + countOdd + " çiftler: " + countEven);
	}
}
