class Bank{
    private int balance;
    public int getBalance(){
        System.out.println(balance);
        return balance;
    }
    public void setBalance(int bal) {
        balance=bal;
    }
}


public class Encap {

    public static void main(String[] args) {
        
        Bank b1 = new Bank();
        b1.setBalance(100);
        Bank b2 = new Bank();
        b2.setBalance(1000);
        b2.getBalance();
        b1.getBalance();
        
    }
    
}
