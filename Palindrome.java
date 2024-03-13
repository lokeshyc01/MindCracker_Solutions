public class Palindrome {
    public static boolean checkPalindrome(int digit)
    {
        String orginalNumber = String.valueOf(digit);
        String reveseString = new StringBuilder(""+digit).reverse().toString();
        return orginalNumber.equals(reveseString);
    }
    
    public static void main(String[] args) {
        System.out.println(checkPalindrome(7887));
    }
}
