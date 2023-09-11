package Basics;

import java.util.Scanner;

public class AtmMachine {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String name = "";
        int pin = 0;
        int amount = 0;
        int lastWithdrawalAmount = 0;

        System.out.println("------------------------------------------------------");
        System.out.println("-----------------------WELCOME------------------------");
        System.out.println("------------------------------------------------------");
        System.out.println();

        boolean isCompleted = true;

        do {
            System.out.println("Press 1 to withdraw amount");
            System.out.println("Press 2 to check your balance");
            System.out.println("Press 3 to change your pin");
            System.out.println("Press 4 to Deposit amount");
            System.out.println("Press 5 to Open your Account");
            System.out.println("Press 6 to Exit");
            System.out.println();
            System.out.println();
            System.out.print("Enter Option : ");
            int option = sc.nextInt();
            switch(option){
                case 1:
                    System.out.print("Enter Amount : ");
                    int a = sc.nextInt();
                    if (a<=amount){
                        amount = amount - a;
                        System.out.println("Please collect your cash");
                        System.out.println("Remaining Balance : " + amount);
                        break;
                    } else {
                        System.out.println("Insufficient Balance");
                        break;
                    }

                case 2:
                    System.out.println("Account Balance : " + amount);
                    break;

                case 3:
                    System.out.print("Enter your old Pin : ");
                    int oldPin = sc.nextInt();
                    if (pin==oldPin){
                        System.out.println("Enter your new Pin : ");
                        int newPin = sc.nextInt();
                        pin = newPin;
                        System.out.println("Your Pin is changed");
                        break;
                    } else {
                        System.out.println("Old Pin not matched");
                        break;
                    }

                case 4:
                    System.out.print("Enter amount : ");
                    int deposit = sc.nextInt();
                    amount = amount + deposit;
                    System.out.println("Account Balance : " + amount);
                    break;

                case 5:
                    System.out.println("Welcome");
                    System.out.println("Enter Name : ");
                    String n = sc.next();
                    System.out.println("Enter Pin : ");
                    int p = sc.nextInt();
                    name = n;
                    pin = p;
                    System.out.println("Your Account has been created");
                    System.out.println("Name : " + name);
                    System.out.println("Pin : " + pin);
                    break;

                case 6:
                    System.out.println("Thankyou");
                    isCompleted = false;
                    break;

                default:
                    System.out.println("Thankyou");
                    break;
            }
        } while (isCompleted);
    }
}
