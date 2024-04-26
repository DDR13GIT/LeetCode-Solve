class Solution {
    public int maxVowels(String s, int k) {
        int l = 0;
        int r = k - 1;
        int vowel = 0;
        int res = 0;
        for(int i = l; i<=r ; i++){
            if(checkVowel(s.charAt(i))) vowel++;
        }
        res = vowel;
        for(int i = k; i<s.length(); i++){
            if(checkVowel(s.charAt(i))) vowel++;
            if(checkVowel(s.charAt(i-k))) vowel--;
            res = Math.max(res, vowel);
        }

        return res;
    }

    public boolean checkVowel(char i) {
        return i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u';   
    }

   

}