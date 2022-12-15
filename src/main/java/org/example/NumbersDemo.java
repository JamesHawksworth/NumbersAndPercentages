package org.example;

import javax.swing.*;
import java.util.Scanner;

public class NumbersDemo {

    public static void main(String[] args) {
        int plus, squared, dub;
        int percent1, percent2;
        String option, number;
        int result, decision;

        option = JOptionPane.showInputDialog(null, "Choose and option: 1 to add 5; 2 to double; 3 to square; 4 for percentage 1; 5 for percentage 2 ", JOptionPane.INFORMATION_MESSAGE);
        result = Integer.parseInt(option);

        if (result == 1) {
            number = JOptionPane.showInputDialog(null, "Enter a number to add 5 to it: ", JOptionPane.INFORMATION_MESSAGE);
            plus = Integer.parseInt(number);
            JOptionPane.showMessageDialog(null, displayNumbers.displayNumberPlusFive(plus));
        }
        if (result == 2) {
            number = JOptionPane.showInputDialog(null, "Enter a number to double it: ", JOptionPane.INFORMATION_MESSAGE);
            dub = Integer.parseInt(number);
            JOptionPane.showMessageDialog(null, displayNumbers.displayNumberDoubled(dub));
        }
        if (result == 3) {
            number = JOptionPane.showInputDialog(null, "Enter a number to square it: ", JOptionPane.INFORMATION_MESSAGE);
            squared = Integer.parseInt(number);
            JOptionPane.showMessageDialog(null, displayNumbers.displayNumberSquared(squared));

        }
        if (result == 4) {
            number = JOptionPane.showInputDialog(null, "Enter a first number to find the percentage: ", JOptionPane.INFORMATION_MESSAGE);
            percent1 = Integer.parseInt(number);
            number = JOptionPane.showInputDialog(null, "Enter a second number to find the percentage: ", JOptionPane.INFORMATION_MESSAGE);
            percent2 = Integer.parseInt(number);
            JOptionPane.showInputDialog(null,"%", Percentage.computePercentage1(percent1, percent2, result));
        }
        if (result == 5) {
            number = JOptionPane.showInputDialog(null, "Enter a first number to find the percentage: ", JOptionPane.INFORMATION_MESSAGE);
            percent1 = Integer.parseInt(number);
            number = JOptionPane.showInputDialog(null, "Enter a second number to find the percentage: ", JOptionPane.INFORMATION_MESSAGE);
            percent2 = Integer.parseInt(number);
            JOptionPane.showInputDialog(null,"%", Percentage.computePercentage1(percent1, percent2, result));
        }
    }
}