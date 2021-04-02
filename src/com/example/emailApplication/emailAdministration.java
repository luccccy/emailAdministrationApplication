package com.example.emailApplication;

import java.util.*;


public class emailAdministration {
    String firstName;
    String lastName;
    String password;
    String department;
    String email;
    String companySuffix = "lucycompany.com";
    int mailboxCapacity;

    public emailAdministration (String firstN, String secondN) {
       this.firstName = firstN;
       this.lastName = secondN;
       System.out.println("Email created: " + this.firstName +  this.lastName);

       this.department = getDepartment();
       System.out.println("Department: " + this.department);

       this.password = generateRandomPassword(20);
       System.out.println("Password: " + this.password.toString());

       this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
       System.out.println("Email: " + this.email);


    }

    public String getDepartment() {
        Scanner in = new Scanner(System.in);
        System.out.println("0) none;");
        System.out.println("1) Sales;");
        System.out.println("2) Development;");
        System.out.println("3) Accounting;");
        System.out.println("Choose your department: ");
        int option = in.nextInt();
        while(true) {
            switch (option) {
                case 0:
                    return " ";
                case 1:
                    return "sales";
                case 2:
                    return "development";
                case 3:
                    return "accounting";
            }
        }
    }

    public void getMailboxCapacity(int capacity){
        this.mailboxCapacity = capacity;
    }

    public String generateRandomPassword(int length) {
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String symbol = "~!@#$%&*_=";
        String finalString = upperCase + lowerCase + numbers + symbol;
        Random rand = new Random();
        char[] password = new char[length];
        for(int i = 0; i < length; i++) {
            password[i] = finalString.charAt(rand.nextInt(finalString.length()));
        }
        return new String(password);
    }

    public void resetPassword(String password) {
        this.password = password;
        System.out.println("reset password is: " + this.password);
    }


    public String displayMenu () {
        return "Display full name: " + firstName + lastName + "\n" +
                "Company Email: " + email + "\n" +
                "Mailbox Capacity: " + mailboxCapacity + "mb" + "\n" +
                "current password: " + this.password;
    }

}
