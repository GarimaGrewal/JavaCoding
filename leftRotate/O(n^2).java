

/*package whatever //do not write package name here */
Given an unsorted array arr[] of size N, rotate it by D elements (clockwise). 

//https://practice.geeksforgeeks.org/problems/rotate-array-by-n-elements/0
// Input:
// The first line of the input contains T denoting the number of testcases. 
//   First line of each test case contains two space separated elements, 
// N denoting the size of the array and an integer D denoting the number size of the rotation. 
//   Subsequent line will be the N space separated array elements.

import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		while(T-->0){
		    int N = sc.nextInt();
		    int D = sc.nextInt();
		    int array[]= new int[N];
		    for(int i=0;i<N;i++){
		        array[i]=sc.nextInt();
		    }
		    getRotatedArray(array,N,D);
		    for(int i=0;i<N;i++){
		        System.out.print(array[i]+" ");
		    }
		    System.out.println();
		}
	
	
	}
	private static void getRotatedArray(int[] array, int N, int D){
	    for(int i=0;i<D;i++){
	        rotateByOne(array,0,N);
	    }
	}
	private static void rotateByOne(int[] array,int i, int N){
	    int temp=array[i];
	    while(i<N-1){
	        array[i]=array[i+1];
	        i++;
	    }
	    array[N-1]=temp;
	}
}
