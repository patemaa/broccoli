public class Main
{
	public static void main(String[] args) {
	java.util.Scanner kb = new java.util.Scanner(System.in);
	
	int i, n, sum;
	
	sum = 0;
	
	for (i = 1; i <=5; i = i + 1){
    	System.out.print(i + ".sayıyı giriniz: ");
    	n = kb.nextInt();
    	sum = sum + n;
	}
	
	    System.out.println("toplam: " + sum);
    
	}
}
