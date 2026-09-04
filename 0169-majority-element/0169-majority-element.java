class Solution {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i]==candidate){
                count++;
            }
            else if(count==0){
                candidate = nums[i];
            }
            else {
                count--;
            }
        }
        return candidate;
    }
}