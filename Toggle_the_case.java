
/* Write a program in Java to Toggle the case of every character of a string.
For instance, if the input string is “ApPLe”, the output should be “aPplE”. */

import java.util.Scanner;

public class Toggle_the_case {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("enter the string");
        String str=sc.nextLine();
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <str.length() ; i++) {
           char ch=str.charAt(i) ;
            if(Character.isUpperCase(ch)){
                result.append(Character.isLowerCase(ch));
            } else if (Character.isLowerCase(ch)) {
                result.append(Character.isUpperCase(ch));
            }
            else {
                result.append(ch);
            }
        }
        System.out.println(result);
    }
}