class Solution {
    
    int n;
    StringBuilder sb = new StringBuilder();
    List<String> res = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {
        this.n = n;
        dfs(0 , 0);
        return res;
    }
    public void dfs(int open, int close){
        if(open == n && close == n){
            res.add(sb.toString());
            return;
        }
        
        if(open < n){
            sb.append("(");
            dfs(open + 1, close);
            sb.deleteCharAt(sb.length() - 1);
        }
        
        if(close < open){
            sb.append(")");
            dfs(open, close + 1);
            sb.deleteCharAt(sb.length() - 1);
        }
        
    }
}