package com.futureskillit.assignments;

public class SmallestAndSecondSmallestElementInArray {

	public static void main(String[] args) {

		int arr[] = {55,65,79,12,250,25,38,101,369,369, -100, -200};
		int smallest = arr[0];
		int second_smallest = arr[0];
		
		for(int num : arr) {
			if(num<smallest) {
				second_smallest = smallest;
				smallest = num;
			}else if(num<second_smallest && num!=smallest) {
				second_smallest = num;
			}	
		}
		System.out.println("Smallest Number in an Array is: "+smallest);
		System.out.println("Second Smallest Number in an Array is: "+second_smallest);

	}

}
