public class Main
{
	public static void main(String[] args) {

        java.util.Random generator = new java.util.Random();
        int i, n, dice1, dice2, total, count;
        
        total = 3600000;
        
        count = 0;
        
        for (i = 1; i <= total; i = i + 1) { 
            dice1 = generator.nextInt(6) + 1;
            dice2 = generator.nextInt(6) + 1;
            
            if (dice1 + dice2 == 12)
                count = count + 1;
        }
        
        System.out.println(count + " defa 6 - 6 geldi");
    
	}
}