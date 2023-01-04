class Solution {
    int []parent;
    int []rank;
    public int numSimilarGroups(String[] strs) {
        parent=new int[strs.length];
        rank=new int[strs.length];
        for(int i=0;i<parent.length;i++){
            parent[i]=i;
            rank[i]=1;
        }
        for(int i=0;i<strs.length-1;i++){
            for(int j=i+1;j<strs.length;j++){
                String str1=strs[i];
                String str2=strs[j];
                
                if(issimilar(str1,str2)){
                    int x=find(i);
                    int y=find(j);
                    
                    if(x!=y){
                        union(x,y);
                    }
                }
            }
        }
        int count=0;
        for(int i=0;i<parent.length;i++){
            if(parent[i]==i){
                count++;
            }
        }
        return count;
    }
    public int find(int x){
        if(parent[x]==x){
            return x;
        }else{
            parent[x]=find(parent[x]);
            return parent[x];
        }
    }
    public void union(int x,int y){
        if(rank[x]>rank[y]){
            parent[y]=x;
        }
        if(rank[y]>rank[x]){
            parent[x]=y;
        }
        else{
            parent[x]=y;
            rank[x]++;
        }
    }
    public boolean issimilar(String s1,String s2){
        int count=0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)!=s2.charAt(i)){
                count++;
            }
        }
        if(count>2){
            return false;
        }else{
            return true;
        }
    }
}