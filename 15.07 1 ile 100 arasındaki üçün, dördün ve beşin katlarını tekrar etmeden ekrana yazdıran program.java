public class Main{	public static void main(String[] args) {	java.util.Scanner kb = new java.util.Scanner(System.in);		int i;    for (i = 1; i <= 100; i = i + 1)	    	    if (i % 5 == 0)	        System.out.print(i + " ");	    else 	       if (i % 4 == 0)	        System.out.print(i + " ");	       else 	            if(i % 3 == 0)	                System.out.print(i + " ");	}}