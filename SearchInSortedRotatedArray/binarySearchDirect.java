// 1) Find middle point mid = (l + h)/2
// 2) If key is present at middle point, return mid.
// 3) Else If arr[l..mid] is sorted
//     a) If key to be searched lies in range from arr[l]
//        to arr[mid], recur for arr[l..mid].
//     b) Else recur for arr[mid+1..h]
// 4) Else (arr[mid+1..h] must be sorted)
//     a) If key to be searched lies in range from arr[mid+1]
//        to arr[h], recur for arr[mid+1..h].
//     b) Else recur for arr[l..mid] 
class Solution {
    
    public int search(int[] nums,int l, int h, int target){
        if(l>h)
            return -1;
        int mid=(l+h)/2;
        if(nums[mid]==target)
                return mid;
        //check if nums[l...mid] is sorted
        if(nums[l]<=nums[mid])
            if(target>=nums[l] && target<=nums[mid])
                return search(nums,l,mid-1,target);
            else
                return search(nums,mid+1,h,target);
        //check if nums[mid...h] is sorted
        if(nums[mid]<=nums[h])
            if(target>=nums[mid] && target<=nums[h])
                return search(nums,mid+1,h,target);
        return search(nums,l,mid-1,target);
        
    }
    public int search(int[] nums, int target) {
        return search(nums,0,nums.length-1, target);
       
    }
    
   
}
