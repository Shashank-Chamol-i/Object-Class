import java.util.Scanner;

class Overloading
{
    int id;
    String name;
    String address;
    Overloading(int id,String name,String address)
    {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    Overloading(int id,String name)
    {
        this.id = id;
        this.name = name;
    }
    void display()
    {
        System.out.println("\n Id : "+id+"\n Name : "+name+"\n address : "+address);
    }
}
public class Program08 {
    public static void main(String[] args)
    {

        int flag = 0;
        System.out.println("Enter the Nationality of User : ");
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        if((input.equalsIgnoreCase("india")))
        {
            flag++;
            if(flag==1)
            {
                System.out.println("Enter the id and name : ");
                int id = sc.nextInt();
                String name = sc.next();
                Overloading o = new Overloading(id,name);
                o.display();

            }
        }
        else{
                System.out.println("Enter the id name and Address : ");
                int id = sc.nextInt();
                String name = sc.next();
                String address = sc.next();
                Overloading o = new Overloading(id,name,address);
                o.display();
        }
    sc.close();

    }
}
