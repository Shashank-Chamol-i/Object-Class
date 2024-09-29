/*Default Constructor*/
class Default
{
    int id;
    String name;
    String Address;
    void display()
    {
        System.out.println("\nId : "+id+"\nname : "+name+" \nAddress : "+Address);
    }
}
public class Program06 {
    public static void main(String[] args) {
        Default dd = new Default();
    }
}