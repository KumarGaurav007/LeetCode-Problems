class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int king1 = nums[0];
        int king2 = Integer.MIN_VALUE;
        int vote1 = 0;
        int vote2 = 0;
        int n = nums.length;
        List<Integer> l = new ArrayList<>();
        
        for(int i=0; i<n; i++){
            if(nums[i]==king1){
                vote1++;
            }
            else if(nums[i] == king2 ){
                
                vote2++;
            }
            else if(vote1 ==0 ){
                king1 = nums[i];
                vote1++;
            }
            else if(vote2 ==0 ){
                king2 = nums[i];
                vote2++;
            }
            else{
                vote1--;
                vote2--;
            }
        }
        int count1 = 0;
        int count2 = 0;
        for(int i : nums){
            if(i == king1) count1++;
            if(i == king2) count2++;
        }
            if(count1 > n/3){
                l.add(king1);
            } 
                
            
            if(count2 > n/3 ){
                if(king1 != king2) {
                    l.add(king2);
                    
                }
                

            }
            
        return l;
    }
}