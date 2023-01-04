class Solution {
    public int compress(char[] chars) {
        if(chars.length==0 || chars.length==1)
            return chars.length;
        char start = chars[0];
        StringBuffer sb = new StringBuffer();
        sb.append(start);
        int count=1;
        for(int i=1;i<chars.length;i++){
            if(start==chars[i])
                count++;
            else{
                if(count>1)
                    sb.append(count);
                sb.append(chars[i]);
                start=chars[i];
                count=1;
            }
        }
        if(count>1)
            sb.append(count);
        for(int i=0;i<sb.length();i++)
            chars[i]=sb.charAt(i);
        return sb.length();
    }
}