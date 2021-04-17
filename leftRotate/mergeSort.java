


/*package whatever //do not write package name here */

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
		    reverseArray(array,0,D-1);
		    reverseArray(array,D,N-1);
		    reverseArray(array,0,N-1);
		    
		    for(int i=0;i<N;i++){
		        System.out.print(array[i]+" ");
		    }
		    System.out.println();
		}
	
	
	}
	private static void reverseArray( int[] array, int L, int R){
	    while(L<R)
	    {
	        swap(array, L, R);
	        L++;
	        R--;
	    }
	}
	private static void swap(int[] array,int a, int b){
	    int temp=array[a];
	    array[a]=array[b];
	    array[b]=temp;
	}
}
