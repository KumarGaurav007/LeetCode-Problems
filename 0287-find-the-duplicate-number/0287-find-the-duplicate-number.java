class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int l = 0;
        int r = 1;

        while(l < r){
            if(nums[l]!=nums[r]){
                l++;
                r++;
            }
            else{
                return nums[l];
            }
        }
        return -1;
    }
}