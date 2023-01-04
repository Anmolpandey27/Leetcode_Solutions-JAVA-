class Solution {
    public char slowestKey(int[] releaseTimes, String keysPressed) {
	char result = 0;
    int max = Integer.MIN_VALUE;
    Map<Character, Integer> map = new HashMap<>();
    char[] cc = keysPressed.toCharArray();
    
    for(int i=0; i<releaseTimes.length; i++) {
        if(i == 0)
            map.put(cc[i], releaseTimes[i]);
        else {
        	if(map.containsKey(cc[i])) {
        		int count = map.get(cc[i]);
        		if(count > releaseTimes[i] - releaseTimes[i-1])
        			continue;
        		else
        			map.put(cc[i], releaseTimes[i] - releaseTimes[i-1]);
        	} else {
        		map.put(cc[i], releaseTimes[i] - releaseTimes[i-1]);
        	}
        }
        
        if(map.get(cc[i]) > max) {
        	result = cc[i];
        	max = map.get(cc[i]);
        } else if(map.get(cc[i]) == max) {
        	if((int) cc[i] < (int) result)
                continue;
            else
                result = cc[i];
        }
    }
    return result;
}
}