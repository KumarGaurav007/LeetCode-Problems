class Solution {
    public int reverse(int x) {
        long rev = 0, temp = 0;
        while (x != 0) {
            temp = x % 10;
            rev = rev * 10 + temp;
            x = x / 10;

        }
        if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
            return 0;
        }

        return (int)rev;

    }
}