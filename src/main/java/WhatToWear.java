import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] args) {

        String setWeather = "Sunny";
        System.out.println("What is the weather like now?");

        Scanner reader1 = new Scanner(System.in);
        String weather = reader1.nextLine();

        int setDegree = 20;
        System.out.println("How many degrees is it now?");

        Scanner reader2 = new Scanner(System.in);
        int degrees = reader2.nextInt();

        if ((weather.equals("sunny") || weather.equals("cloudy"))&& (degrees > setDegree)){
            System.out.println("Wear lighter clothes!");
        } else if (weather.equals("rainy") || weather.equals("cloudy") && (degrees < setDegree)){
            System.out.println("Wear a waterproof winter coat");
        } else {
            System.out.println("Do not go out, it is too cold!");
        }

    }
}
