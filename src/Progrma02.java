/* This program show how to create object using new keyword and access the data using mehtods*/
class Student01{
    int id;
    String name;
    void getdata(int n ,String nn)
    {
        id = n;
        name = nn;
    }
    void displaydata()
    {
        System.out.println(id + " "+ name);
    }
}
public class Progrma02 {
    public static void main(String[] args)
    {
        Student01 ss = new Student01();
        ss.getdata(101,"Mukul");

        ss.displaydata();
    }
}
