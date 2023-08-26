public class Main
{
	public static void main(String[] args) {

        java.util.Random generator = new java.util.Random();
        int i, n, countHead, countTail, total;
        
        total = 1000000;
        
        countHead = 0; 
        
        for (i = 1; i <= total; i = i + 1){
            n = generator.nextInt(2);
            countHead = countHead + n;
        }
        
        countTail = total - countHead;
        
        System.out.println("Yazı : " + countTail + " Tura : " + countHead);

	}
}