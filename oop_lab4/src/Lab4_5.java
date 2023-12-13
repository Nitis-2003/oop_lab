import java.util.Scanner;
import java.text.DecimalFormat;
public class Lab4_5 {
    public static void main(String[] args) {
        double amount;
        double interest;
        double principal;
        double rate;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter principal :");
        principal = scan.nextDouble();
        System.out.println("Enter interest rate :");
        rate = scan.nextInt();
        rate = rate/100;
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        DecimalFormat threeDigits = new DecimalFormat("0.000");

        System.out.println("Year\tAmount on deposit\n");
        
        amount = principal;
        for(int year = 1 ; year <= 10 ; year++){
            interest = amount * rate;
            amount = amount + interest;
            System.out.println(year+"\t"+threeDigits.format(interest)+"\t\t"+twoDigits.format(amount));
        }
    }
}
