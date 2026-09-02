class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int maxSum =0;
        int maxNum = Integer.MIN_VALUE;
        if(nums.length == 0){
            return 0;
        }
        if(nums.length == 1){
            return nums[0];
        }
        for(int i=0; i<nums.length; i++){
            sum += nums[i];
            if(sum<0){
                sum = 0;
            }
            else{
                maxSum = Math.max(maxSum, sum);
            }
            maxNum = Math.max(maxNum, nums[i]);
        }
        if(maxNum < 0) return maxNum;
        return maxSum;
    }
}