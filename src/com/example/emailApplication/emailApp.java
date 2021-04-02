package com.example.emailApplication;
import java.util.*;
public class emailApp {
    public static void main(String[] args) {
        emailAdministration myEmail = new emailAdministration("Lucy", "Wu");
        myEmail.getMailboxCapacity(1000);
        System.out.println("======================");
        myEmail.resetPassword( "RTYJN778eeejN");
        System.out.println("**************************");
        System.out.println(myEmail.displayMenu());
    }
}
