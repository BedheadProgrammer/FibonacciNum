package printNum;
import java.util.Scanner;
public class FibonacciNum {
		public static void main(String[]args) {
			Scanner input = new Scanner(System.in);
			System.out.println("how many fibonacci numbers do you want printed");
			int length = input.nextInt();
			int [] fibo = new int [length+2];
			fibo[0] = 0;
			fibo[1] = 1;
			for(int i = 2; i <= fibo.length-1; i++) {
				fibo[i] = fibo[i-1] + fibo[i-2];
				System.out.println("The Fibonacci numbers are" + fibo[i]);
			}
		}
		}
