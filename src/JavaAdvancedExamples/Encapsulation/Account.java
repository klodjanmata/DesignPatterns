package JavaAdvancedExamples.Encapsulation;

public class Account {
    private double balance;

    public Account() {
        this.balance = 0;
    }

    public void printBalance(){
        System.out.println("Your account balance is: " + this.balance);
    }

    public void deposit(double amount){
        if (amount < 0){
            return;
        }
        this.balance += amount;
    }

    public boolean withdraw(double amount){
        if (amount < 500){
            return false;
        }
        if (amount > balance){
            return false;
        }
        this.balance -= amount;
        return true;
    }
}
