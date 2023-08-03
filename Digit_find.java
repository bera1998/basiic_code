// find the total number of D in the number?

import java.util.Scanner;
public class Digit_find {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value ");
        int n= sc.nextInt();
        int count=0;
        int D=4;
        while (n>0){
            int digit=n%10;
                if(digit==D){
                count++;
                }
            n=n/10;
        }
        System.out.println("Total countable value is "+ count);
    }
}