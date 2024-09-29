class StaticCounter
{
    static int count = 0;
    StaticCounter()
    {
        count++;
    }
    void display()
    {
        System.out.println("Count : "+count);
    }

}
public class Program15 {
    public static void main(String[] args)
    {
        StaticCounter c = new StaticCounter();
        StaticCounter c1 = new StaticCounter();
        StaticCounter c2  = new StaticCounter();
        c1.display();

    }
}
