import java.util.Scanner;

class Account{
    int accountNumber;
    String name;
    int balance;
    int pin;

    void setDetails(int acc, String name, int bal, int pin){
        this.accountNumber = acc;
        this.name = name;
        this.balance = bal;
        this.pin = pin;
    }

    void deposit(int n, int pin){
        if(pin == this.pin)
        {
            this.balance = this.balance + n;
            System.out.println("  Amount deposited into the account and the current account balance is "+this.balance);
        }
        else
        {
            System.out.println("  Incorrect pin number");
        }
    }

    void withdraw(int n, int pin){
        if(pin == this.pin)
        {
            if(n<this.balance)
            {
                this.balance = this.balance - n;
                System.out.println("  Transaction successful and current account balance is "+this.balance);
            }
            else
            System.out.println("  Insufficient balance");
        }
        else
        {
            System.out.println("  Incorrect pin number");
        }
    }
}

public class Banking {
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);

        Account customer1 = new Account();

        customer1.setDetails(100, "karthi", 1000, 1234);
        while(true)
        {
            System.out.println("\n1.Know account details \n2.Check Balance \n3.Withdraw Amount \n4.Deposit Amount \n5.exit");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("\n  The account details of the customer 1:\n  Account number is "+
                    customer1.accountNumber+"\n  The Account holder name is "+customer1.name+
                    "\n  Balance is "+customer1.balance+"\n"
                    );
                    break;

                case 2:
                    System.out.println("Enter the pin");
                    int pinb = sc.nextInt();
                    if(pinb==customer1.pin)
                    System.out.println("\n  Your current account Balance is "+customer1.balance+"\n");
                    break;
                
                case 3:
                    System.out.println("Enter the amount to be withdrawn");
                    int amount = sc.nextInt();
                    System.out.println("Enter the pin");
                    int pin = sc.nextInt();
                    customer1.withdraw(amount, pin);
                    break;

                case 4:
                    System.out.println("Enter the amount to be deposited");
                    int amnt = sc.nextInt();
                    System.out.println("Enter the pin");
                    int pn = sc.nextInt();
                    customer1.deposit(amnt, pn);
                default:
                    break;
            }
        }
    }
}
