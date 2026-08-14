
package casino;

import java.util.Scanner;
import java.util.Random;

public class Casino {
    
    static Scanner s = new Scanner(System.in);
    static Random r = new Random();
    static String ComputerChoice[] = {"Banana", "Pear", "Apple"};
    static double AccountBalance = 500;
    
    
    static void menu() throws InterruptedException{
        boolean running = true;
        
            System.out.println("-----------------------------------");
            System.out.println(" WELCOME TO LAS-VEGAS CASINO ");
            System.out.println("-----------------------------------");
        
        while(running){
            System.out.println("");
            System.out.println("Choose one of the following");
            System.out.println("1. Play");
            System.out.println("2. Account");
            System.out.println("3. Exit Program");
            System.out.print("Enter Choice: ");
            int option = s.nextInt();
            switch(option){
                case 1:
                    play();
                    break;
                case 2:
                    account();
                    break;
                case 3:
                    System.out.println("THANKS FOR PLAYING WITH LAS-VEGAS");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid Input, Try Again(1-3).");
                    break;
            }
        }
        
    
    }
    static void play(){
        boolean running = true;
            System.out.println("-----------------------------------");
            System.out.println("--> NOW PLAYING CASINO SLOT-MACHINE ");
            System.out.println("-----------------------------------");
        while(running){
            if(AccountBalance > 0){
                System.out.print("Enter Bet Amount: ");
                double amount = s.nextDouble();
                if(amount > 0 && amount <= AccountBalance){
                    String Computer1 = ComputerChoice[r.nextInt(3)];
                    String Computer2 = ComputerChoice[r.nextInt(3)];
                    String Computer3 = ComputerChoice[r.nextInt(3)];
                    
                    System.out.println(" ________________________ ");
                    System.out.println("|                         |");
                    System.out.println("| "+ Computer1 + " | " + Computer2 + " | " +Computer3 + "  |");
                    System.out.println("|                         |");
                    System.out.println(" ------------------------ ");
                    
                    
                    if(Computer1.equals("Banana") && Computer2.equals("Banana") && Computer3.equals("Banana") ||
                       Computer1.equals("Pear") && Computer2.equals("Pear") && Computer3.equals("Pear") ||
                       Computer1.equals("Apple") && Computer2.equals("Apple") && Computer3.equals("Apple") ){
                       
                        System.out.println("CONGRATULATIONS! JACKPOT, MASSIVE WIN");
                        System.out.println("R" + amount + " x300");
                        amount*=300;
                        System.out.println("You Won: R" + amount);
                        AccountBalance+=amount;
                        System.out.println("UPDATED ACCOUNT BALANCE: R" + AccountBalance);
                        System.out.println("-----------------------------------");
                        System.out.println("1. CONTINUE PLAYING");
                        System.out.println("2. STOP PLAYING");
                        System.out.print("Enter Choice: ");
                        int option = s.nextInt();
                        switch(option){
                            case 1:
                                running = true;
                                break;
                            case 2:
                                running = false;
                                break;
                            default:
                                System.out.println("Invalid input");
                                break;
                        }
                        System.out.println("-----------------------------------");
                    
                    }
                    else if(Computer1.equals("Banana") && Computer2.equals("Banana") && Computer3.equals("Pear") ||
                            Computer1.equals("Banana") && Computer2.equals("Banana") && Computer3.equals("Apple") ||
                            Computer1.equals("Banana") && Computer2.equals("Apple") && Computer3.equals("Banana") ||
                            Computer1.equals("Banana") && Computer2.equals("Pear") && Computer3.equals("Banana") ||
                            Computer1.equals("Pear") && Computer2.equals("Banana") && Computer3.equals("Banana") ||
                            Computer1.equals("Apple") && Computer2.equals("Banana") && Computer3.equals("Banana") ){
                    
                            System.out.println("CONGRATULATIONS, GOOD WIN");
                            System.out.println("R" + amount + " x2");
                            amount*=2;
                            System.out.println("You Won: R" + amount);
                            AccountBalance+=amount;
                            System.out.println("UPDATED ACCOUNT BALANCE: R" + AccountBalance);
                            System.out.println("-----------------------------------");
                        System.out.println("1. CONTINUE PLAYING");
                        System.out.println("2. STOP PLAYING");
                        System.out.print("Enter Choice: ");
                        int option = s.nextInt();
                        switch(option){
                            case 1:
                                running = true;
                                break;
                            case 2:
                                running = false;
                                break;
                            default:
                                System.out.println("Invalid input");
                                break;
                        }
                        System.out.println("-----------------------------------");
                    }
                    else if(Computer1.equals("Pear") && Computer2.equals("Pear") && Computer3.equals("Banana") ||
                            Computer1.equals("Pear") && Computer2.equals("Pear") && Computer3.equals("Apple") ||
                            Computer1.equals("Pear") && Computer2.equals("Apple") && Computer3.equals("Pear") ||
                            Computer1.equals("Pear") && Computer2.equals("Banana") && Computer3.equals("Pear") ||
                            Computer1.equals("Banana") && Computer2.equals("Pear") && Computer3.equals("Pear") ||
                            Computer1.equals("Apple") && Computer2.equals("Pear") && Computer3.equals("Pear") ){
                    
                            System.out.println("CONGRATULATIONS!, GOOD WIN");
                            System.out.println("R" + amount + " x2");
                            amount*=2;
                            System.out.println("You Won: R" + amount);
                            AccountBalance+=amount;
                            System.out.println("UPDATED ACCOUNT BALANCE: R" + AccountBalance);
                            System.out.println("-----------------------------------");
                            System.out.println("1. CONTINUE PLAYING");
                            System.out.println("2. STOP PLAYING");
                            System.out.print("Enter Choice: ");
                            int option = s.nextInt();
                            switch(option){
                                case 1:
                                    running = true;
                                    break;
                                case 2:
                                    running = false;
                                    break;
                                default:
                                    System.out.println("Invalid input");
                                    break;
                            }
                            System.out.println("-----------------------------------");
                    }
                    else if(Computer1.equals("Apple") && Computer2.equals("Apple") && Computer3.equals("Pear") ||
                            Computer1.equals("Apple") && Computer2.equals("Apple") && Computer3.equals("Banana") ||
                            Computer1.equals("Apple") && Computer2.equals("Banana") && Computer3.equals("Apple") ||
                            Computer1.equals("Apple") && Computer2.equals("Pear") && Computer3.equals("Apple") ||
                            Computer1.equals("Pear") && Computer2.equals("Apple") && Computer3.equals("Apple") ||
                            Computer1.equals("Banana") && Computer2.equals("Apple") && Computer3.equals("Apple") ){
                    
                            System.out.println("CONGRATULATIONS!, GOOD WIN");
                            System.out.println("R" + amount + " x2");
                            amount*=2;
                            System.out.println("You Won: R" + amount);
                            AccountBalance+=amount;
                            System.out.println("UPDATED ACCOUNT BALANCE: R" + AccountBalance);
                            System.out.println("-----------------------------------");
                            System.out.println("1. CONTINUE PLAYING");
                            System.out.println("2. STOP PLAYING");
                            System.out.print("Enter Choice: ");
                            int option = s.nextInt();
                            switch(option){
                                case 1:
                                    running = true;
                                    break;
                                case 2:
                                    running = false;
                                    break;
                                default:
                                    System.out.println("Invalid input");
                                    break;
                            }
                            System.out.println("-----------------------------------");
                    }else{
                            System.out.println("OOPS!, BETTER LUCK NEXT TIME");
                            System.out.println("R" + amount + " x0");
                            AccountBalance-=amount;
                            System.out.println("UPDATED ACCOUNT BALANCE: R" + AccountBalance);
                            System.out.println("-----------------------------------");
                            System.out.println("1. CONTINUE PLAYING");
                            System.out.println("2. STOP PLAYING");
                            System.out.print("Enter Choice: ");
                            int option = s.nextInt();
                            switch(option){
                                case 1:
                                    running = true;
                                    break;
                                case 2:
                                    running = false;
                                    break;
                                default:
                                    System.out.println("Invalid input");
                                    break;
                            }
                            System.out.println("-----------------------------------");
                    
                    }
                    
                    
                }else{
                    System.out.println("Insufficient Funds!, Deposit Funds into your account and try again");
                    running = false;
                }
            }else{
                System.out.println("Insufficient Funds!, Deposit Funds into your account and try again");
                running = false;
            
            }
        
        }
    }
    static void account() throws InterruptedException{
        
        boolean running = true;
            System.out.println("-----------------------------------");
            System.out.println("--> ACCOUNT SETTING ");
            System.out.println("-----------------------------------");
            
            while(running){
                System.out.println("-----------------------------------");
                System.out.println("Choose one of the following");
                System.out.println("1. Check Account Balance");
                System.out.println("2. Deposit");
                System.out.println("3. Withdraw");
                System.out.println("4. Go Back");
                System.out.print("Enter choice: ");
                int option = s.nextInt();
                switch(option){
                    case 1:
                        check();
                        break;
                    case 2:
                        deposit();
                        break;
                    case 3:
                        withdraw();
                        break;
                    case 4:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid Input, Try Again.");
                        break;
                }
            
            }
           
    }
    static void check(){
            System.out.println("-----------------------------------");
            System.out.printf("--> CURRENT ACCOUNT BALANCE:  R%.2f \n",  AccountBalance);
            System.out.println("-----------------------------------");
            System.out.println("");
    }
    static void deposit() throws InterruptedException{
        boolean running = true;
            System.out.println("-----------------------------------");
            System.out.println("--> DEPOSIT FUNDS ");
            System.out.println("-----------------------------------");
            
            while(running){
                System.out.println("Choose a Payment Method");
                System.out.println("1. Bank Account");
                System.out.println("2. Voucher");
                System.out.println("3. Back");
                System.out.print("Enter Choice: ");
                int option = s.nextInt();
                switch(option){
                    case 1:
                        bank1();
                        break;
                    case 2:
                        voucher();
                        break;
                    case 3:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid Input, Try Again.");
                        break;
                }
            }
            
    }
    static void withdraw() throws InterruptedException{
        boolean running = true;
            System.out.println("-----------------------------------");
            System.out.println("--> WITHDRAW FUNDS ");
            System.out.println("-----------------------------------");
            while(running){
                System.out.println("Choose a Payment Method");
                System.out.println("1. Bank Account");
                System.out.println("2. E-Wallet");
                System.out.println("3. Back");
                System.out.print("Enter Choice: ");
                int option = s.nextInt();
                switch(option){
                    case 1:
                        bank2();
                        break;
                    case 2:
                        wallet();
                        break;
                    case 3:
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid Input, Try Again.");
                        break;
                }
            }
    }
    static void bank1() throws InterruptedException{
        boolean running = true;
            System.out.println("-----------------------------------");
            System.out.println("--> BANK TRANSFER (VISA | MASTERCARD) ");
            System.out.println("-----------------------------------");
        
        while(running){
            s.nextLine();
            System.out.print("Enter Account Number(12 digits long): ");
            String AccN = s.nextLine();
            System.out.print("Enter Account Holder Name: ");
            String name = s.nextLine();
            System.out.print("Enter Amount(Must be > R100): ");
            double amount = s.nextDouble();
            
            if(AccN.length() == 12 && amount >= 100 && !name.isEmpty()){
                System.out.println("Please Confirm Payment");
                System.out.println("-----------------------------------");
                System.out.println("Name: " + name);
                System.out.println("Account Number: " + AccN);
                System.out.printf("Amount: R%.2f \n", amount);
                System.out.println("-----------------------------------");
                System.out.println("1. CONFIRM");
                System.out.println("2. CANCEL");
                System.out.print("Enter Choice: ");
                int option = s.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("PROCESSING PAYMENT... Please Wait");
                        Thread.sleep(1000);
                        System.out.println("TRANSACTION COMPLETED!");
                        System.out.println("R" + amount + " Has Been Added To Your Account");
                        System.out.println("-----------------------------------");
                        AccountBalance+=amount;
                        running = false;
                        break;
                    case 2:
                        System.out.println("PROCESSING PAYMENT... Please Wait");
                        Thread.sleep(1000);
                        System.out.println("TRANSACTION CANCELLED!");
                        System.out.println("-----------------------------------");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid input, Try Again later");
                        break;
                }
            }else{
                System.out.println("Invalid input or Insufficient funds, Try Again later");
                running = false;
            }
            
        }
    
    }
    static void bank2() throws InterruptedException{
        boolean running = true;
            System.out.println("-----------------------------------");
            System.out.println("--> BANK TRANSFER (VISA | MASTERCARD) ");
            System.out.println("-----------------------------------");
        
        while(running){
            s.nextLine();
            System.out.print("Enter Account Number(12 digits long): ");
            String AccN = s.nextLine();
            System.out.print("Enter Account Holder Name: ");
            String name = s.nextLine();
            System.out.print("Enter Amount(Must be > R500): ");
            double amount = s.nextDouble();
            
            if(AccN.length() == 12 && amount >= 500 && !name.isEmpty() && amount <= AccountBalance){
                System.out.println("Please Confirm Payment");
                System.out.println("-----------------------------------");
                System.out.println("Name: " + name);
                System.out.println("Account Number: " + AccN);
                System.out.printf("Amount: R%.2f \n", amount);
                System.out.println("-----------------------------------");
                System.out.println("1. CONFIRM");
                System.out.println("2. CANCEL");
                System.out.print("Enter Choice: ");
                int option = s.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("PROCESSING PAYMENT... Please Wait");
                        Thread.sleep(1000);
                        System.out.println("TRANSACTION COMPLETED!");
                        System.out.println("R" + amount + " Has Been Sent To Your Account");
                        System.out.println("It Will take a Maximum of 24 hours to Reflect");
                        System.out.println("-----------------------------------");
                        AccountBalance-=amount;
                        running = false;
                        break;
                    case 2:
                        System.out.println("PROCESSING PAYMENT... Please Wait");
                        Thread.sleep(1000);
                        System.out.println("TRANSACTION CANCELLED!");
                        System.out.println("-----------------------------------");
                        running = false;
                        break;
                    default:
                        System.out.println("Invalid input, Try Again later");
                        break;
                }
            }else{
                System.out.println("Invalid input or Insufficient funds, Try Again later");
                running = false;
            }
            
        }
    
    }
    static void voucher() throws InterruptedException{
        boolean running = true;
        int amount = r.nextInt(10, 300) + 1;
            System.out.println("-----------------------------------");
            System.out.println("--> VOUCHER ");
            System.out.println("-----------------------------------");
            
            while(running){
                s.nextLine();
                System.out.print("Enter VOUCHER Number(10 digits): ");
                String voucher = s.nextLine();
                if(voucher.length() == 10){
                    System.out.println("PROCESSING PAYMENT... Please Wait");
                    Thread.sleep(1000);
                    System.out.println("TRANSACTION COMPLETED!");
                    System.out.println("R" + amount + " Has Been Added To Your Account");
                    System.out.println("-----------------------------------");
                    AccountBalance+=amount;
                    running = false;
                }else{
                    System.out.println("PROCESSING PAYMENT... Please Wait");
                    Thread.sleep(1000);
                    System.out.println("Invalid VOUCHER. Try Again");
                }
            
            }
    }
    static void wallet() throws InterruptedException{
        boolean running = true;
            System.out.println("-----------------------------------");
            System.out.println("--> E-WALLET ");
            System.out.println("-----------------------------------");
            
            while(running){
                s.nextLine();
                System.out.print("Enter Phone Number(10 digits and starts with 0): ");
                String number = s.nextLine();
                System.out.print("Enter Amount(Must be > R200): ");
                double amount = s.nextDouble();
                if(number.length() == 10 && amount >= 200 && number.startsWith("0") && amount <= AccountBalance){
                    System.out.println("PROCESSING PAYMENT... Please Wait");
                    Thread.sleep(1000);
                    System.out.println("TRANSACTION COMPLETED!");
                    System.out.println("R" + amount + " Has Been Deducted From Your Account");
                    System.out.println("You Will Recieve An SMS Shortly");
                    System.out.println("-----------------------------------");
                    AccountBalance-=amount;
                    running = false;
                }else{
                    System.out.println("PROCESSING PAYMENT... Please Wait");
                    Thread.sleep(1000);
                    System.out.println("Invalid VOUCHER. Try Again");
                }
            
            }
    
    }
    
    public static void main(String[] args) throws InterruptedException {
        menu();
    }
    
}
