class StringReverse{
    public String reverseWords(String s) {
        String [] arr = s.split(" +");
        StringBuilder str = new StringBuilder();

        for(int i = arr.length - 1; i >= 0; i--)
        {
            str.append(arr[i]);
            str.append(" ");
        }
        return str.toString().trim();
    }
}