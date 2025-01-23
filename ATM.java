

import java.util.Scanner;


class Machine{
    float Balance=200000;
     int pin;
     int Pin2;
     int NewPin;
     int checknew;
     String E;
  
    
    public void Pincode(){
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a pin :"); 
         pin=sc.nextInt();
       System.out.println("Your pin has ctreated...");
       {
        Checkpin();
       }
       
    
    }
    public void Checkpin(){
            System.out.println("Enter your pin:");
            Scanner sc=new Scanner(System.in);
             Pin2=sc.nextInt();
            if(Pin2==pin){
                 Menu();
            }
            else{
                System.out.println("Enter a valid pin!");
                Checkpin();
            }
    }
    public void Menu(){
        System.out.println("Choose opt:");
        System.out.println("1.Check Bank Balance");
        System.out.println("2.Cash Withdrawl");
        System.out.println("3.Pin change");
        System.out.println("4.Cancel transaction");
        Scanner sc = new Scanner(System.in);
        int opt= sc.nextInt();


            if(opt==1){
                checkBankBalance();

            }
            else if(opt==2){
                cashWithdrawl();
            }
            else if(opt==3){
                pinChange();
            }else if(opt==4){
                CancelTransaction();
            }
            else{
                System.out.println("Enter a valid Choice!");
            }
        // switch(opt){
        //     case '1': checkBankBalance();
        //     break;
        //     case'2':cashWithdrawl();
        //     break;
        //     // case'3':pinChange();
        //     default:System.out.println("Enter a valid choice");
        // }
        {

            Menu();
        }
            
        }
        public void checkBankBalance(){
            System.out.println("Bank Balance"+Balance);
            Menu();


        }
        public void cashWithdrawl(){
            System.out.println("Enter amount to Withdrawl:");
            Scanner sc= new Scanner(System.in);
            float amount=sc.nextInt();
            if(amount>Balance){
                        System.out.println("Insufficient balance!");
            }else{
                Balance=Balance-amount;
                System.out.println("Money withdrawl successfully..");
            }
            Menu();
        }
        public void pinChange(){
            System.out.println("Change your pin:");
            Scanner sc = new Scanner(System.in);
             NewPin= sc.nextInt();
             System.out.println("Pin has Changed Successfully...");
            System.out.println("Enter your new pin:");
            checknew=sc.nextInt();
            if(checknew==NewPin){
                Menu();
            }else{
                System.out.println("Wrong Pin!");
            }
        }
        public void CancelTransaction(){
            System.out.println("Press ''E'' to cancel...");
            Scanner sc = new Scanner(System.in);
            E="E";
            E=sc.next();
            if(E=="E"){
                Menu();
            }else{
                System.out.println("Error! Start whole  process from menu again...");

            }
            Menu();
        }

    }
    
       
    

public class ATM {
    public static void main(String[] args) {
        
        Machine obj1=new Machine();
        obj1.Pincode();
        obj1.Checkpin();
        obj1.Menu();
        obj1.checkBankBalance();
        obj1.cashWithdrawl();
        obj1.CancelTransaction();
        obj1.pinChange();
    }
}

