// Given an unsorted array ‘arr’. Sort the array in such a way that the array looks like a wave array.
// For example, if the given sequence ‘arr’ has ‘n’ elements then the sorted wave array looks like -
// ‘arr[0] >= arr[1]’ and ‘arr[1] <= arr[2]’
// ‘arr[2] >= arr[3]’ and ‘arr[3] <= arr[4]’
// ‘arr[4] >= arr[5]’ and ‘arr[5] <= arr[6]’ And so on.

import java.util.ArrayList;

public class Solution {
	
    public static void swap(int[] arr,int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=arr[a];
    }
	public static int[] waveFormArray(int[] arr, int n)
	{   
	    // Write your code here.
        for(int i=0;i<n;i+=2){
             if(i!=0 && arr[i]<arr[i-1])
                 swap(arr,i,i-1);
            if(i!=(n-1) && arr[i]<arr[i+1])
                swap(arr,i,i+1);
        }
        return arr;
	}

}
