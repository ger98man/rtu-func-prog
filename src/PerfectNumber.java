import java.util.Scanner;

public class PerfectNumber {
	
	public static int divisorsSum(int n) {
		int sum = 0;
		for(int i = 1 ; i < n ; i++) {
			if(n % i == 0 && i!=n)  {
				sum = sum + i;
			}
		}
		return sum;
	}
	
	public static void checkNumber(int number, int sum) {
		if (sum < number) {
			System.out.println("It is a dificient number");
		} else {
			if (sum == number) {
				System.out.println("It is a perfect number");
			} else {
				System.out.println("It is a abundant number");
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Germans Mjagkihs 2.grupa 3.kurss 171RDB031");
		
		System.out.print("Enter your number: ");
		
		int number;
		Scanner sc = new Scanner((System.in));
		if (sc.hasNextInt())
		    number = sc.nextInt();
		else {
		    System.out.println("input-output error");
		    sc.close();
		    return;
		}
		sc.close();
		
		System.out.println("Your number is " + number);
		System.out.println("Your number sum is: "+ divisorsSum(number));
		checkNumber(number, divisorsSum(number));
		
	}	
}
