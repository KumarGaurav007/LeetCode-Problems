class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List <Integer> l = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();
        for(int num:nums){
            if(!set.contains(num)){
                set.add(num);
            }
        }
        for(int i=1; i<=nums.length; i++){
            if(!set.contains(i)){
                l.add(i);
            }
        }
        return l;
    }
}