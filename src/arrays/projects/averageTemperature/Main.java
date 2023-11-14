package src.arrays.projects.averageTemperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //step 1: get the number of days
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many days' temperature? ");
        int numberOfDays = scanner.nextInt();
        Days days = new Days(numberOfDays);

        //step 2: get the temperature of each days
        for (int i = 0; i < numberOfDays; i++) {
            System.out.print("Day " + (i+1) + "\'s high temperature? ");
            days.insertTemperature(i, scanner.nextInt());
        }

        //step 3: calculate the average temperature
        int averageTemperature = days.getAverage();

        //step 4: calculate the number of days that exceeds average temperature
        int daysExceedsAverageTemperature = days.noOfDaysExceedsAverageTemperature(averageTemperature);
        System.out.println("Average = " + averageTemperature + "\n" + daysExceedsAverageTemperature + (daysExceedsAverageTemperature > 1 ? " days" : " day") + " exceeds above average");
    }
}
