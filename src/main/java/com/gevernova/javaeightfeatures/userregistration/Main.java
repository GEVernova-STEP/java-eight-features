package com.gevernova.javaeightfeatures.userregistration;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("User Registration Problem");

        //Lambda function
        Validation<String, Boolean> firstNameValidator = (firstName)->firstName.matches("^[A-Z][A-Za-z]{2,}$");
        Validation<String, Boolean> lastNameValidator = (lastName)->lastName.matches("^[A-Z][A-Za-z]{2,}$");
        Validation<String, Boolean> emailValidator = (email)->email.matches("^[a-zA-Z0-9]+([.+_-][a-zA-Z0-9]+)*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]{2,}){1,2}$");
        Validation<String, Boolean> mobileValidator = (mobile)->mobile.matches("^[0-9]{2}\\s[0-9]{10}$");
        Validation<String, Boolean> passwordValidator = (password)->password.matches("^(?=.*[A-Z])(?=.*\\d)(?=.*[@#$%^&+=]).{8,}$");


        String firstName;
        do{
            System.out.print("Enter Valid First Name: ");
            firstName = sc.next();
        }while(!firstNameValidator.validate(firstName));
        System.out.println("First Name: " + firstName);

        String lastName;
        do{
            System.out.print("Enter Valid Last Name: ");
            lastName = sc.next();
        }while(!lastNameValidator.validate(lastName));
        System.out.println("Last Name: " + lastName);

        String email;
        do{
            System.out.print("Enter Valid Eamil: ");
            email = sc.next();
        }while(!emailValidator.validate(email));
        System.out.println("Email: " + email);

        sc.nextLine();
        String mobile;
        do{
            System.out.print("Enter Valid Mobile Number: ");
            mobile = sc.nextLine();
        }while(!mobileValidator.validate(mobile));
        System.out.println("Mobile Number: " + mobile);

        String pasword;
        do{
            System.out.print("Enter Valid Password: ");
            pasword = sc.next();
        }while(!passwordValidator.validate(pasword));
        System.out.println("Password: " + pasword);
    }
}
