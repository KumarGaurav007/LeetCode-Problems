class Solution {
    public int[] shuffle(int[] nums, int n) {
        int len = nums.length;
        int res [] = new int[len];
        for(int i=0, j=0; i<len; i+=2){
            res[i]=nums[j];
            res[i+1]=nums[j+n];
            j++;
        }
        return res;
    }
}