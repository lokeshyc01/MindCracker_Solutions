import java.util.List;
import java.util.ArrayList;

class Keypad{
    public static boolean check(String str)
    {
        boolean flag = true;
        StringBuilder line1 = new StringBuilder("qwertyuiop");
        StringBuilder line2 = new StringBuilder("asdfghjkl");
        StringBuilder line3 = new StringBuilder("zxcvbnm");

        if(str.length() == 0)
        {
            return true;
        }

        char arr[] = str.toLowerCase().toCharArray();

        if(line1.indexOf(String.valueOf(arr[0])) != -1)
        {
            flag = true;
            for(int iCnt = 1; iCnt < arr.length;iCnt++)
            {
                if(line1.indexOf(String.valueOf(arr[iCnt])) == -1)
                {
                    flag = false;
                    break;

                }
            }
        }


        if(line2.indexOf(String.valueOf(arr[0])) != -1)
        {
            flag = true;
            for(int iCnt = 1; iCnt < arr.length;iCnt++)
            {
                if(line2.indexOf(String.valueOf(arr[iCnt])) == -1)
                {
                    flag = false;
                    break;

                }
            }
        }
        
        if(line3.indexOf(String.valueOf(arr[0])) != -1)
        {
            flag = true;
            for(int iCnt = 1; iCnt < arr.length;iCnt++)
            {
                if(line3.indexOf(String.valueOf(arr[iCnt])) == -1)
                {
                    flag = false;
                    break;

                }
            }
        }

        if(flag)
        {
            return true;
        }
        return false;
    }


    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        for(String str : words)
        {
           if(check(str))
           {
               list.add(str);
           }
        }
        return list.toArray(new String[0]);
    }
}