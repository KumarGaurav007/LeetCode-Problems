class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list =new ArrayList<>();
   
        for(int i=1, j=0; j<target.length; i++){
            if(target[j] == i){
                list.add("Push");
                j++;
            }
            else{
                list.add("Push");
                list.add("Pop");
            }
           
        } 
        return list;
    }
}