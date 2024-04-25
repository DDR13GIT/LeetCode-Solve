class Solution {
    public String mergeAlternately(String word1, String word2) {
        
        StringBuilder combineTwoWords = new StringBuilder();
        for(int i=0; i<word1.length() || i<word2.length(); i++){
            if(i<word1.length()) combineTwoWords.append(word1.charAt(i));
            if(i<word2.length()) combineTwoWords.append(word2.charAt(i));
        }

        System.out.println(combineTwoWords);
        return combineTwoWords.toString();
    }
    
}