/*KristenLee*/
//import scanner and decimal formatter
import java.util.Scanner;
import java.text.DecimalFormat;

public class TipCalculator {
        public static void main(String[] args){
            Scanner scan = new Scanner(System.in);
            DecimalFormat formatter = new DecimalFormat("#.##");

            System.out.println("Welcome to the tip calculator!");

            //Records people in the group and their tip percentage
            System.out.print("How many people are in your group? ");
            int people = scan.nextInt();
            System.out.print("What's the tip percentage? (0-100): ");
            int percentage = scan.nextInt();

            //Records the cost of all item(s)
            double price = 0;
            double cost = 0;
            System.out.print("Enter a cost in dollars and cents: ");
            price = scan.nextDouble();
            cost += price;
            while (price != 0) {
                System.out.print("Enter a cost in dollars and cents: ");
                price = scan.nextDouble();
                cost += price;
            }

            //Prints the cost without tip and tip percentage
            System.out.println("---------------------");
            System.out.println("Total Bill Before Tip: " + cost);
            System.out.println("Tip Percentage: " + percentage);

            //Evaluates the tip cost
            double tip = cost * (percentage * 0.01);
            String Tip = formatter.format(tip);
            System.out.println("Total Tip: " + Tip);


            //Prints cost with tip
            double costWithTip = cost+tip;
            String costWithTipRound = formatter.format(costWithTip);
            System.out.println("Total Bill WIth Tip: " + costWithTipRound);

            //Prints the cost per people
            double perBeforeTip = cost/people;
            String perBeforeTipRound = formatter.format(perBeforeTip);
            System.out.println("Per Person Cost Before Tip: " + perBeforeTipRound);
            double perTip = tip/people;
            String perTipRound = formatter.format(perTip);
            System.out.println("Tip Per Person: " + perTipRound);
            double perCost = costWithTip/people;
            String perCostRound = formatter.format(perCost);
            System.out.println("Total Cost Per Person: " + perCostRound);
        }
    }
