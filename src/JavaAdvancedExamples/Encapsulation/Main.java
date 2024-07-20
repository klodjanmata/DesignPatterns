package JavaAdvancedExamples.Encapsulation;

public class Main {

    public static void main(String[] args) {
        Account myAccount = new Account();
        myAccount.deposit(5000);
        myAccount.printBalance();
        myAccount.deposit(800);
        myAccount.printBalance();
        myAccount.withdraw(1650);
        myAccount.printBalance();
    }
}

