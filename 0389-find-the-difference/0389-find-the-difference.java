class Solution {
    public char findTheDifference(String s, String t) {
        int x =0;
        int y = 0;
        for(char s1 : s.toCharArray()){
            x= (int)s1^x;

        }
        for(char s2 : t.toCharArray()){
            y = (int)s2^y;

        }

        return (char)(x^y);
    }
}