/*Calling default Constructor using Parametrized Constructor */
class DefaulConsCall
{
    DefaulConsCall(){System.out.println("I am constructor shouting from shoulder of Constructor with parameter using this :");}
    DefaulConsCall(int x)
    {
       this();
       System.out.println(x);
    }
}
public class Program20 {
    public static void main(String[] args){
        DefaulConsCall d = new DefaulConsCall();
    }
}
