package org.geekhub.evhenii;
import java.util.Scanner;

public class phoneInput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your phone number, start from country code e.g. 380");

        long phoneNumber = sc.nextLong();
        String question = "";
        String phoneString = String.valueOf(phoneNumber);

        if (phoneString.length() != 12 & phoneString.substring(3).equals("380")) {
            while (phoneString.length() != 12) {
                System.out.println("Please, provide correct phone number");
                phoneString = sc.nextLine();
            }
        }

        else if (phoneString.length() == 12 | phoneString.substring(3).equals("380")) {
            System.out.println("GJ! Thanks a lot " + phoneNumber);
        }

        int sum = 0;
        char[] pA = phoneString.toCharArray();
        for (int i = 0; i < pA.length; i++) {
            sum += Character.getNumericValue(pA[i]);

        }
        int hwSum = 0;
        char[] sum2 = String.valueOf(sum).toCharArray();
        for (int i = 0; i < sum2.length; i++) {
            hwSum += Character.getNumericValue(sum2[i]);
        }

        switch (hwSum) {
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            case 4:
                System.out.println("Four");
                break;
            default:
                System.out.println(hwSum);
        }


        System.out.println(" Phone = "+ phoneString +"; StringLength " + phoneString.length() + "; SUM after 1 step = " + sum + "; Sum after last step " + hwSum);

    }

}