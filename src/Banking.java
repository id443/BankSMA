import java.util.Scanner;

class Banking{
    int amount = 1000;
    public void initiate()
    {
        Login login = new Login();
        try{
            login.acceptInput();
            login.verify();

        }catch(Exception e)
        {
            try{
                login.acceptInput();
                login.verify();

            }catch(Exception f)
            {

            }
        }
    }

    public int getBalance(){
        return amount;
    }

    public void add(int amt){
        amount = amount + amt;
        System.out.println("Amount deposited Successfully");
        System.out.println(" ");
        System.out.println("Total Balance: " +amount);
        System.out.println(" ");
    }

    public void withdrw(int amt){
        System.out.println(" ");

        if(amount < amt)
        {
            InvalidBankTransaction invalidWithDraw = new InvalidBankTransaction("InValid Withdrawal Amount");
            System.out.println(invalidWithDraw.getMessage());
        }else{
            amount = (amount - amt);
            System.out.println("Please Collect your " + amt +" Rupees");
            System.out.println(" ");
            System.out.println("Total Balance: " +amount);
            System.out.println(" ");
        }
    }
}