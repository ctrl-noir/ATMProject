import java.util.Scanner;



 class ATM{

    float balance = 50000;
    double depositAmount;
    double Withdraw;
    int transaction;

    public void deposit(){
        Scanner dep = new Scanner(System.in);
        double amount = dep.nextDouble();
        transaction++;
        balance += amount;
        System.out.println("Deposit Successful");
    }

    public void Withdraw(){
        Scanner input = new Scanner(System.in);
        float amount = input.nextFloat();
        if(balance>=amount){
            transaction++;
            balance = balance - amount;
            System.out.println("Successful Withdrawl");
        }else{
            System.out.println("Insufficient Balance");
        }
        
    }

    public void transfer(){
        Scanner trans = new Scanner(System.in);
        System.out.println("Enter Recipients Account Number: ");
        int AccNum = trans.nextInt();
        System.out.println("Enter Transfer Amount: ");
        int amount = trans.nextInt();
        if(amount <= balance){
            System.out.println("Transfer Successful.");
            transaction++;
            balance -= amount;
        } else {
            System.out.println("Transfer Unsuccessful, Insuffiecient Funds.");
        }
    }

    public void balance(){
        System.out.printf("Balance: %-15.4f", balance);
        }

    public void TransHistory(){
        if(transaction != 0){
            System.out.println("Transactions: " + transaction);
        } else {
            System.out.println("No transactions have been made.");
        }
    }
    }




class App {
    public static void main(String[] args){
        

        System.out.println("---------------Welcome----------------");
        System.out.println("---Follow The Oncomming Intructions---");
        System.out.println(" ");

        Scanner access = new Scanner(System.in);
        
        System.out.println("--------REGISTRATION-------");
        System.out.println("Enter eight digit desired userID: ");
        int registerId = access.nextInt();
        System.out.println("Enter four digit desired user pin: ");
        int registerPin = access.nextInt();

        System.out.println("--------------");
        System.out.println("-----LOGIN----");
        System.out.println("Enter UserID: ");
        int UserID = access.nextInt();
        System.out.println("Enter User Pin: ");
        int UserPin = access.nextInt();


        if((UserID == registerId) && (UserPin == registerPin)){
            System.out.println("Access Granted");
            boolean finished = false;
            do{
                int transaction = 0;
                System.out.println("-----MENU-----");

                System.out.println("...1. Transactions History\n...2. Withdraw\n...3. Deposit\n...4. Transfer\n...5. Quit");

                System.out.println("Enter choice from Menu: ");
                int num = access.nextInt();
                transaction++;
                    switch(num){
                        case 1:
                            System.out.println("Transaction: " + transaction);
                        break;
                        case 2:
                            System.out.println("Enter amount to withdraw");
                            ATM With = new ATM();
                            With.Withdraw();
                        break;
                        case 3:
                            System.out.println("Enter Amount to Deposit");
                            ATM Dep = new ATM();
                            Dep.deposit();
                        break;
                        case 4:
                            ATM myAtm = new ATM();
                            myAtm.transfer();
                        break;
                        case 5:
                            System.out.println("Thank you. For using our ATM!");
                            finished = true;
                        break;
                        default:
                            System.out.println("");
                    }
            } 
            while(!finished);    
        }else{
            System.out.println("Incorrect User ID or Pin!");
        }
    }
}