package _poo._contadobanco.contadobanco;

import java.util.Locale;
import java.util.Scanner;
import entities.Account;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Account account;
        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String name = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)?: ");
        char resp = sc.next().charAt(0);
        if( resp == 'y' || resp == 'Y') {
            System.out.print("Enter inital deposit value: ");
            double depositValue = sc.nextDouble();
            account = new Account(number, name, depositValue);
        }else{
            account = new Account(number,name);
        }
        System.out.println("Account data: "+ account);
        System.out.println("Enter the deposit value: ");
        double deposit = sc.nextDouble();
        account.depositValue(deposit);
        System.out.println("Updated account data " + account);
        System.out.println("Enter the withdraw value : ");
        double withdraw = sc.nextDouble();
        account.withdrawValue(withdraw);
        System.out.println("Updated account data: " + account);

        sc.close();

    }
}