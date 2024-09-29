/*to pass an argument in constructor call*/
class Teacher
{
    Student3 new_id;
    Teacher(Student3 new_id)
    {
        this.new_id = new_id;
    }
    void display()
    {
        System.out.println(new_id.my_id);
    }
}
class Student3
{
    int my_id = 1012024;
    Student3(){
        Teacher t = new Teacher(this);
        t.display();
    }

}
public class Program24 {
    public static void main(String[] args)
    {
        Student3 std = new Student3();
    }
}
