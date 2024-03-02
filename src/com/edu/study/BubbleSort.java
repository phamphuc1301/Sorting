package com.edu.study;

public class BubbleSort {
	public static void main(String[] args){
		printInput(bubbleSort(new int[] {6 ,20, 4 , 11, 9 , 7, 3 , 21,5 ,32,1}));

	}
	static int[] bubbleSort(int[] input ){
		for (int i = 0; i < input.length; i++) {
			System.out.println("Check gia tri : " + input[i]);
			for (int j = 0; j < input.length-1; j++) {
				if(input[j]>input[j+1]){
					int temp = input[j];
					input[j] = input[j+1];
					input[j+1] = temp;
				}
				
			}
			printInput(input);
//			i0  i1  i2  i3  i4
			
//			j0  j1  j2  j3  j4
			
		}
		return input;
	}
	
	static void printInput(int[] input){
		int n = input.length;
		for (int i = 0; i < n; i++) {
			System.out.print(input[i] + " ");	
		}
		System.out.println();
	}

}		
		
