/*Usage of this()Constructor method */
class Car
{
    String name;
    String model;
    String year;
    Car(String name,String model)
    {
        this.name = name;
        this.model = model;
    }
    Car(String name,String model,String year)
    {
        this(name,model);
        this.year = year;
    }
    void display()
    {
        System.out.println();
        System.out.println("Name : "+name+"\n Model : "+model+"\nYear :"+year);
    }

}
public class Program22 {
    public static void main(String[] args)
    {
        Car c = new Car("Audi","Q3","2021");
        Car c1 = new Car("BMW","Base");
        c.display();
        c1.display();
    }
}
