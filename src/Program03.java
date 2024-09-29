class Student03
{
    int  id;
    String name;

    public Student03 (int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    void displaydata()
    {
        System.out.println(this.id + " " + this.name);
    }

}
public class Program03 {
    public static void main(String[] args)
    {
        Student03 ss = new Student03(101,"Mr.Bhatia");
        ss.displaydata();


    }
}
