package com.te.basic.programs.codingninjas;


public class WatchTimeCalculator {
    public static void main(String[] args) {
        int hoursPassed = 2 - 7; // Calculate the number of hours that have passed since 7 am to 2 pm
        int secondsLost = hoursPassed * 5 * 60; // Calculate the total seconds lost

        // Calculate the final time
        int totalSeconds = 2 * 3600 + secondsLost; // 2 pm in seconds
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;

        // Format the time as hh:mm:ss
        String formattedTime = String.format("%02d:%02d:%02d", hours, minutes, seconds);
        System.out.println("The watch will show " + formattedTime + " at 2 pm.");
    }
}
