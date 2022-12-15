package org.example;

import java.util.Scanner;

public class Percentage {

    public static double computePercentage1(int percent1, int percent2, int result)
    {
        double percentage1;
        double percentage2;

        percentage1 = (percent1 * 100) / (percent1 + percent2);

        percentage2 = (percent2 * 100) / (percent1 + percent2);


        if (result == 5){
            return percentage2;

        } else
        return percentage1;

    }
}
