class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;

        for (int i = 0; i < sentences.length; i++) {
            String s = sentences[i];
            int x = 1;
            for (int j = 0; j < s.length(); j++) {
                char c = s.charAt(j);
                if (c == ' ') {
                    x++;
                }
            }
            max = Math.max(max, x);
        }

        return max;
    }
}
