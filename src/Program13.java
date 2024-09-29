class StaticVar
{
    int id;
    String name;
    static String company = "Google";
    StaticVar(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println("\nId : "+id+"\nName : "+name+"\nCompany : "+company);
    }
}
public class Program13 {
    public static void main(String [] args)
    {
        StaticVar v1 = new StaticVar(1,"Tushar");
        StaticVar v2 = new StaticVar(2,"Himesh");
        v1.display();
        v2.display();
    }
}
