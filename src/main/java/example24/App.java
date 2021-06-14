package example24;
/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Matthew Neet
 */
import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string: ");
        String s1 = input.nextLine();
        System.out.print("Enter the second string: ");
        String s2 = input.nextLine();
        if (isAnagram(s1, s2)) {
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are anagrams.");
            //return "\""+s1+"\" and \""+s2+"\" are anagrams.";
        } else {
            System.out.println("\"" + s1 + "\" and \"" + s2 + "\" are not anagrams.");
            //return "\""+s1+"\" and \""+s2+"\" are not anagrams.";
            //System.out.println(isAnagram(s1, s2));
        }
    }
    public static Boolean isAnagram(String s1, String s2){
        s1 = s1.replace(" ","");
        s2 = s2.replace(" ", "");
        String news1 = s1.toLowerCase();
        String news2 = s2.toLowerCase();
        char[] a = news1.toCharArray();
        char[] b = news2.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
        return Arrays.equals(a, b);
    }
}
