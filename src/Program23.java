/*To pass this as an argument*/
class Student2
{
    int age;
    String name;
    Student2(int age,String name)
    {
        this.age = age;
        this.name = name;
    }
    void display(Student2 other)
    {
        System.out.println("Name: "+this.name+"\nAge: "+this.age);
    }
    void pseudodisplay()
    {
        display(this);
    }
}
public class Program23 {
    public static void main(String[] args)
    {
        Student2 ss = new Student2(15," BOB ");
        ss.pseudodisplay();
    }
}
