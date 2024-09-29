class ThisMethod
{
    void call(){System.out.println("Inside call and called by  this under called : ");}
    void called()
    {
        this.call();
    }
}
public class Program19 {
    public static void main(String[] args)
    {
        ThisMethod m = new ThisMethod();
        m.called();
    }
}
