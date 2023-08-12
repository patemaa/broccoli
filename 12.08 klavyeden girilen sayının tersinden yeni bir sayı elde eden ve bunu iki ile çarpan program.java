public class Main
{
	public static void main(String[] args) {
    java.util.Scanner kb = new java.util.Scanner(System.in);
        
        int newNum, n, digit;
        
        System.out.print("n'yi giriniz : ");
        n = kb.nextInt();
    
        newNum = 0;
        
        while (n != 0) {
            digit = n % 10;
            newNum = newNum * 10 + digit;
            n = n / 10;
        }
        
        System.out.println(newNum * 2);
    }
}
