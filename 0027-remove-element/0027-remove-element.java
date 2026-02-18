class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length-1;
        int r = 0;
       
        for (int l=0; l<=n; l++){
            if(nums[l]!=val){
               
                nums[r] = nums[l];
                
                r++;
            }
        }
        
        return r;
    }
}