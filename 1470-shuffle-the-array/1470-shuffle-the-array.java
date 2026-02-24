class Solution {
    public int[] shuffle(int[] nums, int n) {
        int [] res = new int [nums.length];
        for(int i=0, j=0; i< nums.length; i+=2){
            res[i] = nums[j];
            res[i+1] = nums[j+n];
            j++;
        }
        return res;

    }
}