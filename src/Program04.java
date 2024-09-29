class Factorial
{
    public int fact(int n)
    {
        int sol;
        if(n==1)
        {
            return 1;
        }
        else
        {

             sol = n * fact(n-1);
        }

        return sol;
    }
}
public class Program04 {
    public static void main(String[] args)
    {
        int result = new Factorial().fact(5);
        System.out.println(result);
    }
}
