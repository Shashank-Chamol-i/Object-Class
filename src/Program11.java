class InstanceMethod
{
    void instanceMethod()
    {
        System.out.println("This Method is got accessed by using the object to InstanceMethod");
    }
}
public class Program11 {
    public static void main(String[] args)
    {
     InstanceMethod mm = new InstanceMethod();
     mm.instanceMethod();
    }
}
