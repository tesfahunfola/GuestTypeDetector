package com.pluralsight;

public class GuestTypeDetector {
    public static void main(String[] args) {
        String[] names = {"Luna", "Tom", "Meera"};
        String[] types = {"VIP", "Regular", "Staff"};
        int[] codes = {11, 16, 22}; // hour of arrival
        boolean[] wantsMusic = {true, false, true};

        // Guest 0
        System.out.println("Guest: " + names[0]);

        switch (types[0]) {
            case "VIP":
                System.out.println("Welcome, respected guest!");
                break;
            case "Regular":
                System.out.println("Welcome!");
                break;
            case "Staff":
                System.out.println("Hello team member!");
                break;
            default:
                System.out.println("Unknown guest type.");
        }

        if (codes[0] >= 5 && codes[0] <= 11) {
            System.out.println("You are arriving in the morning.");
        } else if (codes[0] >= 12 && codes[0] <= 17) {
            System.out.println("You are arriving in the afternoon.");
        } else {
            System.out.println("You are arriving in the evening/night.");
        }

        if (wantsMusic[0]) {
            System.out.println("Playing your welcome music now...");
        } else {
            System.out.println("Skipping music per your preference.");
        }
    }
}
