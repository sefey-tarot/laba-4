/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	    System.out.println("Введите b");
	    int b = scanner.nextInt();
	    System.out.println("Введите c");
	    int c = scanner.nextInt();
	    System.out.println("Введите i");
	    int digit2 = scanner.nextInt();
	    long start = System.currentTimeMillis();
	    long answer = 0;
	    long result = 0;
        	if (digit2 == 0) {
		        answer = answer + 0;
	        } else if (digit2 > 0) {
    		    for (int i = 1; i <= digit2; i++) {
			        if (i == 1) {
				        answer = answer + (((b * 2) + c - 1)*100000000);}
				    else {
				        answer = 0;
				        for (int j = 1; j < 100000001; j++) {
					        answer = answer + ((b * 2) + c - i);}
				    }
				    }
				}
			result = answer + result;
		System.out.println(result);
		long finish = System.currentTimeMillis();
        long elapsed = finish - start;

        System.out.println("Прошло времени, мс: " + elapsed);
        
	}
}



