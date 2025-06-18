*** Valid Palindrome  ****
public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
    StringBuilder cleaned = new StringBuilder();

    for (char c : s.toCharArray()) {
        if (Character.isLetterOrDigit(c)) {
            cleaned.append(Character.toLowerCase(c));
        }
    }

    String cleanedStr = cleaned.toString();
    String reversedStr = cleaned.reverse().toString();

    return cleanedStr.equals(reversedStr);
   }
} 
  time :  O(n)
  space :  O(n)



class Solution {
    public boolean isPalindrome(String s) {
        int left=0;
        int right = s.length()-1;
        while(left<right) {
            if(!Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }
            else {
                if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))) {
                   return false;
                }
            left++;
            right--;
            }
        }
        return true;
    }
}
   time :O(n)
   space :O(1);


