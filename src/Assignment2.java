// CS 111B SPR 2023 - Anar Gasimov
// Assignmet 1 - Muni ridership calculator
// This program calculates average daily ridership of a surveyed Muni line

import java.util.Scanner;

class Assignment2 {

    public static void main(String[] args) {
        String muniLine;
        int nDays;
        int nRiders;
        double dailyAverage;
        Scanner userResponse = new Scanner(System.in);
        System.out.println("Welcome to the Mfffffuni Ridership Calculator");
        System.out.println();
        System.out.print("Which Muni line did you survey? ");
        muniLine = userResponse.nextLine();
        System.out.print("How many days did you survey ridership? ");
        nDays = userResponse.nextInt();
        System.out.print("How many riders did you count? ");
        nRiders = userResponse.nextInt();
        dailyAverage = (double) nRiders / nDays;
        System.out.printf("According to your survey, an average of: %,.2f", dailyAverage);
        System.out.printf(" rode the " + muniLine + " per day");
    }
}

/*
****************
SAMPLE OUTPUT #1
****************

Which Muni line did you survey? F-Market
How many days did you survey ridership? 654
How many riders did you count? 85436
According to your survey, an average of: 130.64 rode the F-Market per day


****************
SAMPLE OUTPUT #2
****************

Which Muni line did you survey? 37 - Masonic
How many days did you survey ridership? 365
How many riders did you count? 76554873
According to your survey, an average of: 209,739.38 rode the 37 - Masonic per day


 */