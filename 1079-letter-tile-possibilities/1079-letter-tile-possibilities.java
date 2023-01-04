class Solution {
    public int numTilePossibilities(String tiles) {
        int[] freq = new int[26];
		for (int i = 0; i < tiles.length(); i++) {
			int idx = tiles.charAt(i) - 'A';
			freq[idx]++;

		}
        return Tile_Possibilities(freq,"");
    }
    public static int Tile_Possibilities(int[] freq, String ans) {
		int count = 0;
		for (int i = 0; i < freq.length; i++) {
			if (freq[i] >= 1) {
				char ch = (char) (i + 'A');
				freq[i]--;
				count += Tile_Possibilities(freq, ans + ch) + 1;
				freq[i]++;
			}

		}
		return count;
	}

}