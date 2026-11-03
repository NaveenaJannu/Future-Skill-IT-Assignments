package com.futureskillit.assignments;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {
		
		int arr[] = {55,65,79,12,250,25,38,101,369,369, -100, -200,55,65};
		
		int count = 0;
		boolean isDuplicate = false;
		
		for(int i=0;i<=arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
					break;
				}
			}
		}


	}

}
