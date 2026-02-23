class Solution {
    public int majorityElement(int[] nums) {
        int king = 0;
        int vote = 0;
        for(int n : nums){
            if(vote == 0){
                king = n;
            }
            if(king == n){
                vote++;
            }
            else{
                vote--;
            }
        }
        return king;
    }
}