

public class Bank {

    int balance = 0;
    public void deposite(int dep)
    {
        balance += dep;
        System.out.println(balance);
    }
    public void withdraw(int with)
    {
        if(balance<with)
        {
            System.out.println("Insufficient balance");
        }
        else
        {
            balance -= with;
            System.out.println(balance);
        }
    }
    public void checkbalance()
    {
        System.out.println(balance);
    }

    public static void main(String[] args)
    {
        Bank bb = new Bank();
        bb.checkbalance();
        bb.deposite(100);
        bb.withdraw(101);
        bb.withdraw(1);
    }
}
