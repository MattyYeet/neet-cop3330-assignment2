package example25;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordChecker {
    public int passwordValidator(String word){
        int i=0;
        char ch;
        boolean numberFlag = false;
        boolean specialFlag = false;
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        Pattern special = Pattern.compile("[!@#$%&*()_+=|<>?{}~-]");
        Matcher hasSpecial = special.matcher(word);
        boolean isMatched = hasSpecial.matches();
        for(int m=0;m < word.length();m++) {
            ch = word.charAt(m);
            if (Character.isDigit(ch)) {
                numberFlag = true;
            }
            if(specialCharactersString.contains(Character.toString(ch))){
                specialFlag = true;
            }
        }
        if(word.length() < 8){
            if(numberFlag){
                i=1;
            }
            if(word.contains("[a-zA-Z]+")){
                i=2;
            }
        }
        else if(word.length() >= 8){
            if(numberFlag && word.matches("[a-zA-Z]+")){
                i=3;
                if(specialFlag){
                    i=4;
                }
            }
        }
        return i;
    }
}
