class Solution {
    public static int carry=0;
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ar=new ArrayList<>();
        return add(num,k,ar);
    }
    public List<Integer> add(int[] num,int k,List<Integer> ar)
    {
        for(int i=num.length-1;i>=0;i--)
        {
            int sum=num[i]+(k%10)+carry;
            ar.add(0,sum%10);
            carry=sum/10;
            k=k/10;
        }
        while(carry==1)
        {
            int sum=carry+k%10;
            ar.add(0,sum%10);
            carry=sum/10;
            k/=10;
        }
        while(k!=0)
        {
            ar.add(0,k%10);
            k/=10;
        }
        return ar;
    }
}