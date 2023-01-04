class Solution {
    public List<String> letterCombinations(String digits) {
        Character[][] keyboard = new Character[][]{{' '}, {}, {'a', 'b', 'c'}, {'d', 'e', 'f'}, {'g', 'h', 'i'}, {'j', 'k', 'l'}, {'m', 'n', 'o'}, {'p', 'q', 'r', 's'}, {'t', 'u', 'v'}, {'w', 'x', 'y', 'z'}};
        return concatCharacters(digits, keyboard, "");
    }

    private List<String> concatCharacters(String digits, Character[][] chars, String prefix) {
        ArrayList<String> result = new ArrayList<>();
        if (digits.length() == 0) return result;
        Character[] characters = chars[digits.charAt(prefix.length()) - '0'];
        for (Character character : characters) {
            if (digits.length() > prefix.length() + 1) {
                result.addAll(concatCharacters(digits, chars, prefix + character));
            } else {
                result.add(prefix + character);
            }
        }
        return result;
    }
}