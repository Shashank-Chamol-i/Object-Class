/*Calling default constructor using parametrized Constructor */
class ParaConsCall
{
    ParaConsCall()
    {
        this(5);
    }
    ParaConsCall(int x)
    {
        System.out.println("Calling of parametrized by using default");
    }
}
public class Program21 {
    public static void main(String[] args)
    {
        ParaConsCall pp = new ParaConsCall();
    }

}
