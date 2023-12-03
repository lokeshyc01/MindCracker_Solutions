import java.util.LinkedHashMap;
import java.util.*;
public class SherlockString 
{
   public static String isValid(String s) 
   {
    LinkedHashMap<Character,Integer> map = new LinkedHashMap<>();
    char[] arr = s.toCharArray();
    
   
    // add key value pair in map
    for(int iCnt = 0; iCnt < arr.length ; iCnt++)
    {
        if(map.get(arr[iCnt]) == null)
        {
            map.put(arr[iCnt], 1);
        }
        else
        {
            map.put(arr[iCnt],map.get(arr[iCnt]) + 1);
        }
        System.out.println(arr[iCnt]);
    }
    
     //iterate through all values check they are same
        if(map.values().stream().distinct().count() > 2 )
        {
            return "NO";
        }
        else
        {
            // only one distinct value
          
           int frequency[] = new int[map.size()];
           int idx = 0;
            for(Map.Entry<Character,Integer> content : map.entrySet())
            {
                frequency[idx++] = content.getValue();
            }

            Arrays.sort(frequency);

            int first = frequency[0];
            int second = frequency[1];
            int secondlast = frequency[frequency.length - 2];
            int last = frequency[frequency.length-1];

            if(first == last)
            {
                return "YES";
            }
            else if(first == 1 && second == last)
            {
                return "YES";
            }
            else if(first == second && secondlast == (last - 1))
            {
                return "YES";
            }
            return "NO";
        }
    }

    public static void main(String args[])
    {
        String result = isValid("abccc");
        System.out.println(result);
    }    
}


