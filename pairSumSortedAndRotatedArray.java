// Alice and Bob always loved to play with arrays. Alice took a sorted array and rotated it clockwise for a certain number of times. For example, Alice took a sorted array = [4,6,8,10,11] and if she rotates it by 3, then the array becomes: [8, 10, 11, 4, 6].
// After rotating a sorted array, Alice gave a number ‘K’ to Bob and asked him to search for a pair in an array whose sum is equal to K. Since Bob was busy preparing for his semester exams, he asked you to help him.
// You are given an array of integers ARR and a number K. Your task is to find out whether there exists a pair in the array ARR with sum K or not. If there exists a pair then you can return TRUE else return FALSE;
//https://www.codingninjas.com/codestudio/problems/find-pair-sum-in-rotated-and-sorted-array_985350
public class Solution {
    public static int findPivot(int[] arr, int l, int h){
      if(l>h)
          return -1;
      if(l==h)
          return l;
      int mid=(l+h)/2;
      if(mid<h && arr[mid+1]<arr[mid] )
          return mid+1;
      if(l<mid && arr[mid]<arr[mid-1])
          return mid;
      if(arr[l]<arr[mid])
          return findPivot(arr,mid+1,h);
      return findPivot(arr,l, mid-1);
  }
    public static boolean findPairSum(int[] arr, int target) {
      int n=arr.length;
      int pivot=findPivot(arr,0,n-1);
      int l,h;
      if(pivot==-1)
      {
          l=0;
          h=n-1;
      }
      else{
          l=pivot;
          h=(pivot-1+n)%n;
      }
      while(l!=h){
          if(arr[l]+arr[h]==target)
              return true;
          if(arr[l]+arr[h]<=target)
              l=(l+1)%n;
          else
              h=(h-1+n)%n;
      }
      return false;
    }
}
