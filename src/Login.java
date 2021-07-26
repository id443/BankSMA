import java.util.Scanner;
class Login{
    int ac_number = 1234;
    int ac_pass = 9999;
    int ac;
    int pw;

    public void acceptInput(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the account number:");
        ac = scanner.nextInt();

        System.out.println("Enter the Password:");
        pw = scanner.nextInt();

    }

    public void verify() throws Exception{

        if(ac == ac_number && pw == ac_pass)
        {
            System.out.println("Login Successfull!");

            Banking banking = new Banking();
            System.out.println(" ");
            System.out.println("Your Balance is: "+banking.getBalance()+"  Rupees");
            System.out.println(" ");
            Menu menu = new Menu();
            menu.showMenu();
        }else{
            InvalidBankTransaction loginfailed = new InvalidBankTransaction("Incorrect login credentials");
            System.out.println(loginfailed.getMessage());
            throw loginfailed;
        }
    }


}