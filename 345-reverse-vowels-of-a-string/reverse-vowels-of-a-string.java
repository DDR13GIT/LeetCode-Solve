class Solution {
    public String reverseVowels(String s) {
        StringBuilder reverseVowel = new StringBuilder();
        StringBuilder result = new StringBuilder(s);
        for (int i = s.length()-1; i >=0; i--) {

            if (isVowel(s.charAt(i))) {
                reverseVowel.append(s.charAt(i));
            }
        }
        int j=0;
        for (int i = 0; i < s.length(); i++) {

            if (isVowel(s.charAt(i))) {
                result.setCharAt(i, reverseVowel.charAt(j++));
            }
        }

        return result.toString();
    }

    public boolean isVowel(char s) {
        if (s == 'A' || s == 'E' || s == 'I' || s == 'O' || s == 'U' || s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u') {
            return true;
        }
        return false;
    }
}