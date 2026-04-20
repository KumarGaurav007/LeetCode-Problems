class Solution {
    public int[] getConcatenation(int[] nums) {
        int newArr[] = new int[2*nums.length];
        // int i=0;
        // for(i=0; i<nums.length; i++){
        //     newArr[i] = nums[i];
        
        // for(int j = nums.length; j<newArr.length; j++){
        //     newArr[j] = nums[i];
           
        // }}

        int j = nums.length;
        for(int i=0; i<nums.length;i++){
            newArr[i]=nums[i];
            newArr[j]=nums[i];
            j++;
        }
        return newArr;
    }
}