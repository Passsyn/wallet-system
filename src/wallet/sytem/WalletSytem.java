/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wallet.sytem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author brand
 */
public class WalletSytem {

    /**
     * @param args the command line arguments
     */
        public static void main(String args[]){

        Scanner newString = new Scanner(System.in);
        Scanner newString1 = new Scanner(System.in);

        
        double myBalance = 1000;

        List<Transaction> listTransaction = new ArrayList<>();



        System.out.println("\n");
        System.out.println("Welcome on  Company E-Wallet");
        System.out.println("\n");
        System.out.println("NEW USER ");
        System.out.print("User Name:     "+"\t");
        String printUserName =newString1.nextLine();

        System.out.print("User Passcode:     "+"\t");
        long printUserPass =newString.nextInt();

        System.out.print("User Phone (eg: 07834567):     "+"\t");
        String printUserPhone =newString1.nextLine();

        System.out.println("\nDear " + printUserName + ", Your account in  Company was  created...");

        System.out.println("You received 1000 RWF Bonus");

     
        String permissionChoice = "";

        while(!permissionChoice.equals("0")){
            System.out.println("\nType 1 To Check Balance \nType 2 To Send Money \nType 3 To Save Money \nor Type 0 To Quit");
            System.out.print("\n Type Here: ");
            permissionChoice = newString1.nextLine();
            switch(permissionChoice) {

                case "1":
                    System.out.println("Your balance is: "+ myBalance +"Rwf. \n");
                    break;

          
                case "2":
                    System.out.print("Receiver's Number (eg: 2501234567):     "+"\t");
                    String printReceiverName = newString1.nextLine();

                    System.out.print("Amount to send:     "+"\t");
                    double printAmount =newString.nextInt();
                    if(printAmount <= myBalance){
                        System.out.print("Confirm your Passcode:     "+"\t");
                        long printUserPasscode2 =newString.nextInt();
                        if(printUserPasscode2 == printUserPass){
                            double remainder = myBalance - printAmount;
                            myBalance = remainder;
                            System.out.println("You are remaining with " + myBalance + "Rwf, in your account");
                        } else {
                            System.out.println("Wrong passcode, try again...");
                        }

                    }else
                        System.out.println("You have insufficient Balance...");
                    break;

              
                case "3":
                    System.out.print("Enter the amount you want to deposit:     "+"\t");
                    double printAdditionalAmount =newString.nextInt();
                    myBalance += printAdditionalAmount;

                    System.out.println("Your new Balance is: " + myBalance +"Rwf");
                    break;
            }
}
        }

    private static class Transaction {

        public Transaction() {
        }
    }}
  
