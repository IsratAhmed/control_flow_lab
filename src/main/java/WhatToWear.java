import java.util.Scanner;

public class WhatToWear {
    public static void main(String[] args) {

        Scanner reader1 = new Scanner(System.in);
        String weather = reader1.nextLine();

        Scanner reader2 = new Scanner(System.in);
        int degrees = reader2.nextInt();

        if ((weather.equals("sunny") || weather.equals("cloudy"))&& (degrees > 20)){
            System.out.println("Wear lighter clothes!");
        } else if (weather.equals("rainy") || weather.equals("cloudy") && (degrees < 20)){
            System.out.println("Wear a waterproof winter coat");
        } else {
            System.out.println("Do not go out, it is too cold!");
        }

    }
}
