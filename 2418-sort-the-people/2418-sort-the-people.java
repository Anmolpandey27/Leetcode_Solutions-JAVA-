class Solution 
{
    public String[] sortPeople(String[] names, int[] heights) 
    {
        Map<Integer, String> map = new HashMap<Integer, String>();
        for(int i=0; i<names.length; i++)
        {
            map.put(heights[i], names[i]);
        }
        
        Arrays.sort(heights);
        
        for(int i=heights.length-1, idx=0; i>=0; i--)
        {
            names[idx++] = map.get(heights[i]);
        }
        
        return names;
    }
}