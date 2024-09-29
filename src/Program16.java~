class StaticMethod
{
    private int id;
    private String name;
    static String company = "ITC";
    static void change()
    {
        company = "BTC";
    }
     void setId(int id)
     {
         this.id = id;
     }
     void setName(String name)
     {
         this.name = name;
     }
     int getId()
     {
         return id;
     }
     String getName()
     {
         return name;
     }
     void display()
     {
         System.out.println("Id : "+getId()+"Name : "+getName()+"Company : "+company);
     }

}
public class Program16 {
    public static void main(String[] args)
    {

        StaticMethod m = new StaticMethod();
        m.setId(1);
        m.setName("Nilesh");
        m.display();
        /*  */
        StaticMethod.change();
        StaticMethod m1 = new StaticMethod();
        m1.setId(2);
        m1.setName("Chraiot");
        m1.display();

    }
}
