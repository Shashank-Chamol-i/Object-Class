 class Consistent
{
    public int findConsistent(String allowed,String[] words)
    {
        int [] arr = new int[26];
        for(char  i : allowed.toCharArray())
        {
            arr[i-'a'] = 1;
        }
        int count = 0;

        for(String k : words)
        {
            count+=checkcons(arr,k);
        }
        return count;

    }
    public static int checkcons(int[]arr,String k)
    {
        int flag = 1;
        for(int i = 0;i<k.length();i++)
        {
            if(arr[k.charAt(i) - 'a']==0)
            {
                flag = 0;
                break;
            }
        }
        return flag;
    }
}
public class Solution {
    public static void main(String[] args)
    {
        Consistent cc = new Consistent();
        System.out.println (cc.findConsistent("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}));
    }
}
