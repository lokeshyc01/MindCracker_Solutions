class Solution {
public int countCharacters(String[] words, String chars) 
    {
        int sum = 0;
    //    create a hashmap for counting the frequency of char
        HashMap<Character,Integer> charCount = new HashMap<>();
        for(Character c : chars.toCharArray())
        {
            if(charCount.get(c) == null)
            {
                charCount.put(c,1);
            }
            else
            {
                charCount.put(c,charCount.get(c) + 1);
            }
        }

        // count the frequency of each word in words arrray

        for(String str : words)
        {
        HashMap<Character,Integer> wordCount = new HashMap<>();
                for(Character c : str.toCharArray())
                {
                    if(wordCount.get(c) == null)
                    {
                        wordCount.put(c,1);
                    }
                    else
                    {
                        wordCount.put(c,wordCount.get(c) + 1);
                    }
                }

                    boolean good = true;
                    for(Character c : wordCount.keySet())
                    {
                        if(charCount.getOrDefault(c, 0) < wordCount.get(c))
                        {
                            good = false;
                            break;
                        }
                    }

                    if(good)
                    {
                        sum += str.length();
                    }

        }

        return sum;
    }
}
