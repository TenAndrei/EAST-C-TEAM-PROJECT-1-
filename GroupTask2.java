package groupTask;

public class GroupTask1_2_3 {

	public static void main(String[] args) {

		// 1st
		int[][] arr1 = { { 1, 2, 3, 4 }, { 10, 9, 8, 7 }, { 6, 5 }, };

		int sum = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				sum = sum + arr1[i][j];

			}
			System.out.println(sum);
		}
		System.out.println("TASK2");
		// 2nd task

		int[][] arr2 = { { 1, 2, 3, 4 }, { 10, 9, 8, 7 }, { 6, 5 }, };

		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				if (arr2[i][j] % 2 == 0) {
					System.out.println(arr2[i][j]);

				}

			}

		}
		System.out.println("TASK3");
		//3rd task
		
		int sumeven =0;
		int sumodd=0;
		
		int[][] arr = { { 1, 2, 3, 4 }, { 10, 9, 8, 7 }, { 6, 5 } };
		
	
	for(int[]i:arr) {
		
		for(int j:i) {
			
			if(j%2==0) {
				
				sumeven=sumeven+j;
				
			}else if( j%2!=0) {
				
				sumodd=sumodd+j;
			}
		
					
		}
	}
	
	System.out.println(sumeven);
	
	System.out.println("-------");
	
	System.out.println(sumodd);
	
	
	}}

	


