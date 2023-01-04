class Solution {
    public String intToRoman(int num) {
        String[] notation={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int[] values={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String roman=new String();
        for(int pos=0;num>0;pos++){
            while(num>=values[pos]){
                roman+=notation[pos];
                num-=values[pos];
            }
        }
        return roman;
    }
}