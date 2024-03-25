// Write a java application enter two numbers by using Scanner class and swap between them ?

import java.util.Scanner;

class UserInput{
    public static void main(String[] args) {
        //User Input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number : ");
        int num1 = sc.nextInt();
        System.out.print("Enter 1st number : ");
        int num2 = sc.nextInt();
        //print
        System.out.println("Given Number 1st number = "+num1+" 2nd number = "+num2);
        //logic
        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;
        System.out.println("After swap 1st number = "+num1+" 2nd number = "+num2);
    }
}