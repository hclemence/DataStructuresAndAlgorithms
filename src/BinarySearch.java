public class BinarySearch {

    public int bsearch(int left, int right, int[] nums, int target){
        if(left>right) return -1;
        int mid = left + (right - left)/2;

        if(nums[mid] == target) return mid;
        return ((nums[mid] < target) ? bsearch(mid+1, right, nums, target) : bsearch(left, mid-1, nums, target));
    }
    public int search(int[] nums, int target) {
        return bsearch(0, nums.length-1, nums, target);
    }

}
