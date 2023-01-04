class Solution {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> stack = new ArrayDeque();
        StringBuffer result = new StringBuffer();

        for(int i=s.length()-1; i>=0; i--)
            stack.push(s.charAt(i));

        while(!stack.isEmpty()) {
            if(result.length() > 0 && result.charAt(result.length()-1) == stack.peek()) {
                stack.pop();
                result.deleteCharAt(result.length()-1);
            } else {
                result.append(stack.pop());
            }
        }
        return result.toString();
    }
}