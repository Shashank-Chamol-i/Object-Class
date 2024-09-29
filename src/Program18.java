/*Static Block*/
public class Program18 {
    static{System.out.println("This is static block execute before the Main method at the time of class loading");}
    public static void main(String[] args)
    {
        System.out.println("Part of main method execute after the static block");
    }
}
