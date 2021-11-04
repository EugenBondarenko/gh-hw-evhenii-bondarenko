package org.geekhub.evhenii;
import java.util.Scanner;

public class phoneInput {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please, enter your phone number, start from country code");
    long phoneNumber = sc.nextLong();
    String phoneString = String.valueOf(phoneNumber);
    if (phoneString.length() != 12){
        System.out.println("Please, provide correct phone number");
    }
    else {
        System.out.println("GJ first step complete " + phoneNumber);
    }
    }
}