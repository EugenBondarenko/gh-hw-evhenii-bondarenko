package org.geekhub.evhenii;
import java.util.Scanner;

public class phoneInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your phone number, start from country code e.g. 380");

        long phoneNumber = sc.nextLong();
        String phoneString = String.valueOf(phoneNumber);

        if (phoneString.length() != 12) {
            System.out.println("Please, provide correct phone number");
        } else {
            System.out.println("GJ first step complete " + phoneNumber);
        }

            int sum = 0;
            char[] pA = phoneString.toCharArray();
            for (int i = 0; i < pA.length; i++) {
                sum = sum + Character.getNumericValue(pA[i]);

            }

    System.out.println("StringLength " + phoneString.length() + " SUM = " + sum + " Phone = "+ phoneString);

    }

}