class StaticCalculation
{
    static int circle(int n)
    {
        return n*n*n;
    }
}
public class Program17 {
    public static void main(String[] args)
    {
        System.out.println(StaticCalculation.circle(5));
    }
}
