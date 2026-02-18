class Solution {
    public int maxArea(int[] height) {
        // Approach 1 - Brutt force
        // int max =0;
        // for (int i=0; i<height.length; i++){
        //     for (int j=i+1; j<height.length; j++){
        //         int h = Math.min(height[i],height[j]);
        //         int w = j-i;
        //         int area = h * w;
        //         max = Math.max (area,max);
        //     }
            
        // }

        int i = 0;
        int j = height.length-1;
        int max = 0;
        while(i<=j){
            int h = Math.min(height[i],height[j]);
            int w = j-i;
            int area = h * w;
            max = Math.max (area,max);
            if(height[i]<height[j]){
                i++;
            }else{
                j--;
            }
        }
        return max;
    }
}