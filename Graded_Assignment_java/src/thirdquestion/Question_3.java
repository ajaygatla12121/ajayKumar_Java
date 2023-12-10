package thirdquestion;

import java.util.Arrays;

public class Question_3 {

	public static void main(String[] args) {
		int[] inputArray = {1, 2, 3, 4, 5};

		System.out.print("Input       : [");
		for(int i=0;i<inputArray.length;i++) {
			if(i<inputArray.length-1) 
				System.out.print(inputArray[i]+", ");
			else 
				System.out.print(inputArray[i]+"]");
		}
		System.out.println();

		int sum = Arrays.stream(inputArray)
				.filter(num -> num % 2 != 0)
				.map(num -> num * num)
				.sum();

		System.out.println("Odd NUMBERS : " + Arrays.toString(Arrays.stream(inputArray).filter(num -> num % 2 != 0).toArray()));
		System.out.println("SQUARES     : " + Arrays.toString(Arrays.stream(inputArray).filter(num -> num % 2 != 0).map(num -> num * num).toArray()));
		System.out.println("SUM         : "+sum);
	}

}
