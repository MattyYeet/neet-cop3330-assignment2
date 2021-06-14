package example25;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Neet
 */
import java.util.Scanner;

public class App {
    public static Scanner input = new Scanner(System.in);
    public static String word;
    public static void main(String[] args) {
        PasswordChecker password = new PasswordChecker();
        System.out.println("Make a password!");
        word = input.nextLine();
        int score = password.passwordValidator(word);
        System.out.println(Result(score));
    }
    public static String Result(int score){
        if(score == 1){
            return "The password \'"+word+"\' is a very weak password.";
        }
        else if(score == 2){
            return "The password \'"+word+"\' is a weak password.";
        }
        else if(score == 3){
            return "The password \'"+word+"\' is a strong password.";
        }
        else if(score == 4){
            return "The password \'"+word+"\' is a very strong password.";
        }
        return "";
    }
}
