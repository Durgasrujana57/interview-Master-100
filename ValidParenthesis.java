class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for(char ch : s.toCharArray()) {
            if(ch=='(' || ch=='{' || ch=='[') {
                stack.push(ch);    
            }
            else if(ch==')'&& ( stack.isEmpty() || stack.pop()!='(')) {
                return false;
            }
            else if(ch=='}'&& ( stack.isEmpty() || stack.pop()!='{')) {
                return false;
            }
            else if(ch==']'&& ( stack.isEmpty() || stack.pop()!='[')) {
                return false;
            }
        }
      return stack.isEmpty();
    }
}

complexity
  time : O(n)
  space :O(n) // n/2;
