class Solution {
    public String[] findWords(String[] words) {
        HashMap<Character, Integer> myMap= new HashMap<>();

       String[] kewWord={"qwertyuiop","asdfghjkl","zxcvbnm"};
       for( int i=0; i<kewWord.length; i++){
        for( char ch: kewWord[i].toCharArray()){
            myMap.put(ch, i); 
        }
       }
       List<String> res = new LinkedList<>();

       for(int i=0; i<words.length; i++){
        boolean isStore=true;
         int index=myMap.get(words[i].toLowerCase().charAt(0));
        for(char ch: words[i].toLowerCase().toCharArray()){
                if(myMap.get(ch)!=index){
                    isStore=false;
                    break;
                }
        }
        if(isStore)res.add(words[i]);
      
       }
       return res.toArray(new String[0]);

    }
}