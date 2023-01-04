class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int [] winners=new int[100001];
        int [] lousers=new int[100001];

        for(int match[]:matches){
            int winner=match[0];
            int louser=match[1];

            if(lousers[winner]==0) winners[winner]=1;;
            if(winners[louser]==1) winners[louser]=0;
            lousers[louser]++;
        }

        List<List<Integer>> result=new ArrayList<>();

        List<Integer> winner=new ArrayList<>();
        List<Integer> louser=new ArrayList<>();
        for(int i=0;i<100001;i++){
            if(winners[i]==1) winner.add(i);
            if(lousers[i]==1) louser.add(i);
        }

        result.add(winner);
        result.add(louser);

        return result;
    }
}