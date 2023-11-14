package src.arrays.projects.averageTemperature;

public class Days {
    int noOfDays;
    int[] temperatures;
    int totalTemperature;

    /**
     * Initialize variables and assign values;
     * @param noOfDays
     */
    Days(int noOfDays) {
        this.noOfDays = noOfDays;
        temperatures = new int[noOfDays];
        for (int i = 0; i < temperatures.length; i++) {
            temperatures[i] = Integer.MIN_VALUE;
        }
        totalTemperature = 0;
    }


    public void insertTemperature(int day, int temperature) {
        if (temperatures[day] == Integer.MIN_VALUE) {
            temperatures[day] = temperature;
        }
        totalTemperature += temperature;
    }

    public int getAverage() {
        if (totalTemperature > 0) {
            return totalTemperature / noOfDays;
        }
        return 0;
    }

    public int noOfDaysExceedsAverageTemperature(int averageTemperature) {
        int daysExceedAverageTemperature = 0;
        for (int i = 0; i < temperatures.length; i++) {
            if (temperatures[i] > averageTemperature) {
                daysExceedAverageTemperature++;
            }
        }
        return daysExceedAverageTemperature;
    }
}
