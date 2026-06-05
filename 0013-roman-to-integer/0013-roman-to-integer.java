class Solution {
    public int romanToInt(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        map.put('M', 1000);
        map.put('D', 500);
        map.put('C', 100);
        map.put('L', 50);
        map.put('X', 10);
        map.put('V', 5);
        map.put('I', 1);

        int ans = 0;

        for(int i=0; i<s.length(); i++){
            int curr= map.get((s.charAt(i)));
            if(i<s.length()-1 && curr< map.get(s.charAt(i+1))){
                ans-= curr;
            }else{
                ans+= curr;
            }
        }
        return ans;
    }
}