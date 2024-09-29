class Retype
{
    Retype ret()
    {
        return this;
    }
    void msg(){System.out.println("The return type is just class name");}

}
public class Program25 {
    public static void main(String[] args){
        new Retype().ret().msg();
    }


}
