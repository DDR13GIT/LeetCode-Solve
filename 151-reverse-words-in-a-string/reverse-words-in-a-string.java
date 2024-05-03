class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();

        String[] words = s.trim().split(" ");
        String[] wordsWithoutSpace = new String[words.length];
        int j = 0;
        for (String i : words) {
            if (!i.equals(" "))
                wordsWithoutSpace[j++] = i;
        }

        for (int i = wordsWithoutSpace.length - 1; i >= 0; i--) {
            if (!wordsWithoutSpace[i].isEmpty()) {
                sb.append(wordsWithoutSpace[i]);
                if (i > 0) {
                    sb.append(" ");
                }
            }

        }

        return sb.toString();
    }
}
