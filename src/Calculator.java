
public class Calculator {
    public int rectangle(int a,int b)
    {
        return a*b;
    }
    public int square(int a)
    {
        return a*a;
    }
    public float circle(int rad)
    {
        return 3.14f * rad*rad;
    }
    public static void main(String[] args)
    {
        Calculator cc = new Calculator();
        System.out.println(cc.circle(5));
        System.out.println(cc.rectangle(4,5));
        System.out.println(cc.square(4));
    }

}
