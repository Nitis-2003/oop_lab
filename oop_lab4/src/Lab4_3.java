import java.util.Scanner;
import java.text.DecimalFormat;;
public class Lab4_3 {
    public static void main(String[] args) {
        int total;
        int counter;
        int score;
        double average;
        Scanner scan = new Scanner(System.in);

        total = 0;
        counter = 0;

        System.out.println("Enter Integer Score or -1 to Quit:");
        score = scan.nextInt();

        while (score != -1) {
            total = total+score;
            counter = counter+1;
            System.out.println("Enter Integer Score or -1 to Quit:");
            score = scan.nextInt();
        }
        
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        if(counter!=0){
            average = (double) total / counter;
            System.out.println("Class average is "+twoDigits.format(average));
        }else{
            System.out.println("No scores were entered");
        }
    }
}
