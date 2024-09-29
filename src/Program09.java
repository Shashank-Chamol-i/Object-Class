class CopyConstructor
{
    int id;
    String name;
    CopyConstructor(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    CopyConstructor(CopyConstructor copy)
    {
        this.id = copy.id;
        this.name = copy.name;
    }
    void display()
    {
        System.out.println("Id : "+id+"Name :"+name);
    }
}
public class Program09 {
    public static void main(String[] args)
    {
        CopyConstructor cc = new CopyConstructor(101,"Shashank");
        CopyConstructor cc1 = new CopyConstructor(cc);
        cc.display();
        cc1.display();
    }
}
