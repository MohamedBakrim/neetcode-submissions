class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-zA-Z0-9]", "");

        char[] schar = s.toCharArray();

        int left = 0;
        int right = schar.length - 1;

        while (left < right) {
            if (schar[left] != schar[right]) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}