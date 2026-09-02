class Solution {
    public int[] productExceptSelf01(int[] nums) {
        int []products = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            int product =1;
            for(int j=0; j<nums.length; j++){
                if(i == j) continue;
                product = product*nums[j];
            }
            products[i] = product;
        }
        return products;
    }
    public int[] productExceptSelf(int[] nums) {
        int []products = new int[nums.length];
        int []leftProducts = new int[nums.length];
        int []rightProducts = new int[nums.length];
        
        leftProducts[0]=1;
        rightProducts[nums.length-1]=1;

        for(int i=1; i<nums.length; i++){
            leftProducts[i] = nums[i-1] * leftProducts[i-1];   
        }
        for(int i=nums.length-2; i>=0; i--){
            rightProducts[i] = nums[i+1] * rightProducts[i+1];   
        }
        for(int i=0; i<nums.length; i++){
            products[i] = rightProducts[i] * leftProducts[i];   
        }
        return products;
    }
}