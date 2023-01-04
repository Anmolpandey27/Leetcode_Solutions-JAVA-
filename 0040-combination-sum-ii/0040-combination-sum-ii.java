class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList();
        Arrays.sort(candidates);
        traverse(0,target,answer, new ArrayList(),candidates);
        return answer;
    }
    
    public void traverse(int index,int target, List<List<Integer>> answer, List<Integer> curr, int[] candidates)
    {
        //base condition
        if(target==0)
        {
            answer.add(new ArrayList(curr));
            return;
        }
        
        for(int i=index;i<candidates.length;i++)
        {
            if(i>index && candidates[i]==candidates[i-1])
                continue;
            if(target<candidates[i])
                break;
            curr.add(candidates[i]); //do
            traverse(i+1,target-candidates[i],answer,curr,candidates); //recur
            curr.remove(curr.size()-1); //undo
        }
        
    }
}