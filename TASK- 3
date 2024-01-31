
import java.util.Scanner;
class ATM{
    double balance=0;
    int PIN= 4987;
    public void checkPin() {
        System.out.println("enter the 4 digit PIN ");
        Scanner Sc = new Scanner(System.in);
        int pin = Sc.nextInt();
        if (pin==PIN){
            menu();
        }
        else{
            System.out.println("invalid PIN");
            return ;
        }
    }
    public void menu(){
        System.out.println("enter your choice");
        System.out.println("1. Check balance");
        System.out.println("2. Withdraw");
        System.out.println("3. Deposit");
        System.out.println("4. Exit");
        Scanner sc1=new Scanner(System.in);
        int choice= sc1.nextInt();
        if(choice==1){
            checkBalance();
        }
        else if(choice==2){
            withdraw();
        }
        else if(choice==3){
            deposit();
        }
        else if(choice==4){
            return;
        }
        else{
            System.out.println("please enter valid choice");
            menu();
        }
    }
    public void checkBalance(){
        System.out.println("Balance: " +balance);
        System.out.println("press yes to go to menu/ no to exit");
        Scanner sc1=new Scanner(System.in);
        String press= sc1.nextLine();
        if (press.equalsIgnoreCase("yes")){
            menu();
        }
        else if(press.equalsIgnoreCase("no")){
            exit();
        }
    }
    public void withdraw(){
        System.out.println("enter the amount: ");
        Scanner sc2=new Scanner(System.in);
        double amt= sc2.nextDouble();
        if(amt<=balance){
            balance-=amt;
            System.out.println("money withdraw successful");
            System.out.println("press yes to go to menu/ no to exit");
            Scanner sc1=new Scanner(System.in);
            String press= sc1.nextLine();
            if (press.equalsIgnoreCase("yes")){
                menu();
            }
            else if(press.equalsIgnoreCase("no")){
                exit();
            }
        }
        else {
            System.out.println("insufficient balance");
            System.out.println("press yes to go to menu/ no to exit");
            Scanner sc1=new Scanner(System.in);
            String press= sc1.nextLine();
            if (press.equalsIgnoreCase("yes")){
                menu();
            }
            else if(press.equalsIgnoreCase("no")){
                exit();
            }
        }
}
    public void deposit(){
        System.out.println("enter the amount: ");
        Scanner amt=new Scanner(System.in);
        double Amt= amt.nextDouble();
        balance+=Amt;
        System.out.println("press yes to go to menu/ no to exit");
        Scanner sc1=new Scanner(System.in);
        String press= sc1.nextLine();
        if (press.equalsIgnoreCase("yes")){
            menu();
        }
        else if(press.equalsIgnoreCase("no")){
            exit();
        }
    }
    public void exit(){
        return;
    }
}
public class AtmInterface {
    public static void main (String args []){
        ATM obj=new ATM();
        obj.checkPin();
    }
}
