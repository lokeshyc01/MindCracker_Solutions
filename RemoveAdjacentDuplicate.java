class Solution {
    public String removeDuplicates(String s) 
    {
        Stack<Character> charStack = new Stack<>();
        StringBuilder result = new StringBuilder();

        for(Character c : s.toCharArray())
        {
            if(charStack.empty())
            {
                charStack.push(c);
            }
            else
            {
                if(charStack.peek() == c)
                {
                    charStack.pop();
                }
                else
                {
                    charStack.push(c);
                }
            }
        }
        for(Character c : charStack)
        {
            result.append(c);
        }
       return result.toString();
    }
}