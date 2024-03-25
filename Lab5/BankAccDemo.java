import java.util.Scanner;

class AccountDetails{
    String name;
    long accNum;
    static double amount;
    void accountDetails()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your name : ");
        this.name = sc.nextLine();        
        System.out.print("Enter Your Account Number : ");
        this.accNum = sc.nextLong();
    }
    void showAccountDetails(){
        System.out.println("Your Name = "+this.name);
        System.out.println("Your Account Number = "+this.accNum);
    }

}
class Deposit{
    Scanner sc = new Scanner(System.in);
    void depositAmount(){
        System.out.print("Enter amount to Deposite : ");
        double amt = sc.nextInt();
        AccountDetails.amount = amt + AccountDetails.amount;
        System.out.println("Your amount is : "+AccountDetails.amount);
    }
}
class Withdraw{
    Scanner sc = new Scanner(System.in);
    void withdrawAmmount(){
        System.out.print("Enter Ammount to Withdraw : ");
        double amt = sc.nextDouble();
        AccountDetails.amount = AccountDetails.amount - amt;
        System.out.println("Your Current Balance is : "+AccountDetails.amount);
    }
}
class MyAccount{
    public static void main(String[] args) {
        AccountDetails ad = new AccountDetails();
        Deposit de = new Deposit();
        Withdraw wd = new Withdraw();
        ad.accountDetails();
        ad.showAccountDetails();
        de.depositAmount();
        wd.withdrawAmmount();
    }
}