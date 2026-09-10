class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left =0;
        int maxlen=0;
        HashSet<Character> set = new HashSet<>();

        for(int i=0; i<s.length(); i++){
            int len = 0;
            if(set.contains(s.charAt(i))){
                while(s.charAt(left) != s.charAt(i)){
                    set.remove(s.charAt(left));
                    left++;
                }
                if(s.charAt(left) == s.charAt(i)){
                    set.remove(s.charAt(i));
                    left++;
                }
                set.add(s.charAt(i));
                len = i - left +1;
                maxlen = Math.max(maxlen,len);
            }
            else{
                set.add(s.charAt(i));
                len = i - left +1;
                maxlen = Math.max(maxlen,len);
            }
        }
        return maxlen;
        
    }
}