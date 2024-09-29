class Stat
{
    static int age = 100;
    static void display()
    {
        age++;
        System.out.println("After 1 year the age of my grandMother is  : "+age);
    }
}
public class Staticeg {
    public static void main(String[] args)
    {
        Stat ss = new Stat();
        ss.display();
    }
}
