package groupTask;

public class Task5 {

	public static void main(String[] args) {

		int num = 11;

		boolean isPrime = true;
		for (int i = 2; i <= num / 2; i++) {
			if (num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (isPrime == true)
			System.out.println(num + " is a prime number");
		else
			System.out.println(num + " is not a prime number");

	}
}
