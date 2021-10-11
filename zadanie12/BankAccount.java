
public class BankAccount
{
    int number;
    double balance;
    String bankName;
    String accountOwner;
    boolean isDebt;
    
    void displayInfo(){
        System.out.println(accountOwner + " " + number + " " + bankName);
    };
    void displayBalance(){
        System.out.println(balance);
    };
    void displayDebt(){
        System.out.println(isDebt);
    };
}
