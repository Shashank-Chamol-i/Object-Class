abstract class Message
{
    abstract void  display();
}
class Message1 extends Message
{
    @Override
    void display()
    {
        System.out.println("This Message1 is extended form Message and created refrence variable of superclass and object of subclass");
    }
}
public class Program14 {
    public static void main(String[] args)
    {
        Message m = new Message1();
        m.display();
    }
}
