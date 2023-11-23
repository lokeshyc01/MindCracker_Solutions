class MergeAlternate{
    public String mergeAlternately(String word1, String word2) {
        StringBuilder str = new StringBuilder();

        int word1len = word1.length() - 1;
        int word2len = word2.length() - 1;

        int i = 0; 
        int j = 0;

        while(i <= word1len && j<= word2len)
        {
            str.append(word1.charAt(i));
            str.append(word2.charAt(j));
            i++;
            j++;
        }

        while(i <= word1len)
        {
            str.append(word1.charAt(i));
            i++;
        }

        while(j <= word2len)
        {
            str.append(word2.charAt(j));
            j++;
        }
    return new String(str);
    }
}