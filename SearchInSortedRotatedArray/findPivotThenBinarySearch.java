// There is an integer array nums sorted in ascending order (with distinct values).

// Prior to being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

// Given the array nums after the rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

class Solution {
     public int findPivot(int[] nums, int l,int r){
        if(l>=r)
            return -1;
        int mid=(l+r)/2;
        if(mid<r && nums[mid]>nums[mid+1])
            return mid+1;
        if(mid>l && nums[mid]<nums[mid-1])
            return mid;
        if(nums[l]>=nums[mid])
            return findPivot(nums,l,mid-1);
        return findPivot(nums, mid+1,r);
        
    }
    public int binarySearch(int[] nums,int l, int r, int target){
        if(l>r)
            return -1;
        else{
            int mid=(l+r)/2;
            if(nums[mid]==target)
                return mid;
            if(target<nums[mid])
                return binarySearch(nums,l,mid-1,target);
            else
                return binarySearch(nums,mid+1,r,target);
        }
    }
    public int search(int[] nums, int target) {
        int pivot= findPivot(nums,0,nums.length-1);
        if(pivot==-1)
            return binarySearch(nums,0, nums.length-1 ,target);
        if(nums[pivot]==target)
            return pivot;
        if(nums[0]<=target)
            return binarySearch(nums,0, pivot-1, target);
        else
            return binarySearch(nums, pivot+1, nums.length-1, target);
    }
    
   
}
