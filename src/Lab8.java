import java.util.Scanner;

/**
 * Created by fhani on 7/5/2017.
 */
public class Lab8 { //HAVENT BEEN ABLE TO VALIDATE POSITIVE NUMBERS FOR NUMBER OF AT BATS
    //COULDN'T VALIDATE SO USER ONLY INPUTS 0-4 FOR BATTING RESULTS
    public static void main(String[] args) {

        String keepGoing = "";
        System.out.println("Welcome to the Batting Average Calculator!");

        //1. ask user for number of at bats (number of times to bat)

        do {
            Scanner scnr = new Scanner(System.in);
            System.out.println("Enter number of times at bat: ");




            while ((!scnr.hasNextInt())) { //|| (scnr.nextInt() < 0) -- why does this not work????
                System.out.println("Invalid entry. Please enter a positive integer value.");
                scnr.next();
            }

            int numAtBat = scnr.nextInt();

            if (numAtBat > 0) {

            System.out.println();


                //1.1 ask for number of bases earned by the batter for every at bat (from user)
                System.out.println("0 = out, 1 = single, 2 = double, 3 = triple, 4 = home run");
                System.out.println();

                int[] atBatResults = new int[numAtBat];

                for (int i = 0; i < atBatResults.length; i++) {
                    System.out.println("Enter the number of bases earned at " + (i + 1) +
                            " (can only enter numbers 0 - 4): ");
                    int userInput = scnr.nextInt();
                    atBatResults[i] = userInput;
                }


                //2. calculate batting average
                double battingAvg = 0;
                double atBatSum = 0;
                double totalBattingSum = 0;
                double slugPercent = 0;

                for (int i = 0; i < numAtBat; i++) {
                    if (atBatResults[i] > 0) {
                        atBatSum += 1;
                    }
                }
                battingAvg = (atBatSum / numAtBat);
                System.out.print("Batting average: ");
                System.out.printf("%.3f", battingAvg, '\n');
                System.out.println();

                //3. calculate slugging percentage
                for (int i : atBatResults) {
                    if (i > 0) {
                        //System.out.println(i);
                        totalBattingSum += i;
                    }
                }
                slugPercent = (totalBattingSum / numAtBat);
                //System.out.println("Slugging Percentage: " + slugPercent);
                System.out.print("Slugging Percentage: ");
                System.out.printf("%.3f", slugPercent, '\n');

                System.out.println();
                System.out.println("Would you like to continue? (Y/N)");
                System.out.println();
                scnr.nextLine();
                keepGoing = scnr.nextLine();
            }
            else {
                System.out.println("Invalid entry. Please enter a positive integer value.");
                scnr.nextInt();
            }
        } while (keepGoing.equalsIgnoreCase("y") && (!keepGoing.equalsIgnoreCase("N")));
    }
}


//    public static int findBatResults(int numAtBat) {
//        Scanner scnr = new Scanner(System.in);
//        int[] atBatResults = new int[numAtBat];
//
//        for (int i = 0; i < atBatResults.length; i++) {
//            System.out.println("Enter the number of bases earned at " + (i + 1) +
//                    " (can only enter numbers 0 - 4): ");
//            int userInput = scnr.nextInt();
//            atBatResults[i] = userInput;
//        }
//        return 0;



//    public static double findBatAvg(int[] atBatResults) {
//        double battingAvg = 0;
//        double atBatSum = 0;
////        double totalBattingSum = 0;
////        double slugPercent = 0;
//
//        for (int i = 0; i < numAtBat; i++) {
//            if (atBatResults[i] > 0) {
//                atBatSum += 1;
//            }
//        }
//        battingAvg = (atBatSum / numAtBat);
//        System.out.print("Batting average: ");
//        System.out.printf("%.3f", battingAvg, '\n');
//        System.out.println();
//
//        return battingAvg;
//    }
//}

