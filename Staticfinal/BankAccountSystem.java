package Staticfinal;

public class BankAccountSystem {
    public static void main(String[] args) {
    BankAccount b=new BankAccount("rubez",123);
        BankAccount x=new BankAccount("sharma",1234);

        BankAccount.getTotalAccounts();
    }
}

class BankAccount{
    static String bankName="ICICI";
    static int totalAccount=0;
     String  accountHolderName;
     final int  accountNumber;

    BankAccount( String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        totalAccount++;
    }

    static void getTotalAccounts(){
        System.out.println(totalAccount);
    }

}
