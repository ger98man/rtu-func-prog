package imperative;
import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumber {

// CORRECT TASK VARIANT
	public enum STATE {
		ABUNDANT,
		DEFICIENT,
		PERFECT;
	}

	public static ArrayList<Integer> divisors(int n) {
		ArrayList<Integer> divisors_list = new ArrayList<Integer>();
		for(int i = 1 ; i < n ; i++) {
			if(n % i == 0)  {
				divisors_list.add(i);
			}
		}
		divisors_list.add(n);
		return divisors_list;
	}
	
	public static STATE process(int n) {
		
		int sum = 0;
		for(int i = 1 ; i < n ; i++) {
			if(n % i == 0 && i!=n)  {
				sum = sum + i;
			}
		}
		
		STATE classification;
		if (sum < n) {
			classification = STATE.DEFICIENT;
		} else {
			if (sum == n) {
				classification = STATE.PERFECT;
			} else {
				classification = STATE.ABUNDANT;
			}
		}
		return classification;
	}
	
// MY VARIANT
	public static int divisorsSum(int n) {
		int sum = 0;
		for(int i = 1 ; i < n ; i++) {
			if(n % i == 0 && i!=n)  {
				sum = sum + i;
			}
		}
		return sum;
	}
	
	public static String detect(int number, int sum) {
		String classification;
		if (sum < number) {
			System.out.println("It is a dificient number");
			classification = "dificient";
		} else {
			if (sum == number) {
				System.out.println("It is a perfect number");
				classification = "perfect";
			} else {
				System.out.println("It is a abundant number");
				classification = "abundant";
			}
		}
		return classification;
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
		System.out.println("Your number sum is "+ divisorsSum(number));
		detect(number, divisorsSum(number));
		
	}

		
}
