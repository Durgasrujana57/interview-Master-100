// optimual
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) {
            return false;
        }

        int[] count = new int[128];
        for(char c : s.toCharArray()) {
            count[c]++;
        }
        for(char c : t.toCharArray()) {
            count[c]--;
            if(count[c]<0) {
                return false;
            }
        }
        return true;
    }
}

complexity 
time O(n)
space O(1)
