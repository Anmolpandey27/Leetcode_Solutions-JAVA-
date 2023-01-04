class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String str="";
        StringBuilder n = new StringBuilder();
        for(String x: s.split("-")){
            str+=x;
        }
        int count= 0;
        for(int i=str.length()-1;i>=0;i--){
            count++;
            n.append(Character.toUpperCase(str.charAt(i))+"");
            if(count ==k&& i!=0){
                n.append("-");
                count =0;
            }
        }
        return n.reverse().toString();
    }
}