class CopyConstructor2
{
    int id;
    String name;
    CopyConstructor2(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    CopyConstructor2(){};
    void display()
    {
        System.out.println("id  :"+id+"name : "+name);
    }
}
public class Program10 {
    public static void main(String[] args)
    {
        CopyConstructor2 cc = new CopyConstructor2(101,"shashank");
        CopyConstructor2 cc2 = new CopyConstructor2();
        cc2.id = cc.id;
        cc2.name = cc.name;
        cc.display();
        cc2.display();

    }
}
