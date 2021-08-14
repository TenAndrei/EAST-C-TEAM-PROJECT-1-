package groupTask;

public class Task8 {

	public static void main(String[] args) {

		// Write a java program to find the second largest number in the array?

		int arr[] = { 1,2,3,4,5 };
	    int largest = arr[0];
	    int secondLargest = arr[0];
	   

	    for (int i = 0; i < arr.length; i++) {
	      System.out.print(arr[i]+" ");
	    }
	    for (int i = 0; i < arr.length; i++) {
	
	      if (arr[i] > largest) {
	        secondLargest = largest;
	        largest = arr[i];
	
	      } else if (arr[i] > secondLargest) {
	        secondLargest = arr[i];
	
	      }
	    }
	
	    System.out.println("\nSecond largest number is:" + secondLargest);
	
	}
}