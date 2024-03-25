// Write a java program to enter two integer numbers by using BufferedReader class and add, subtract, multiply, divide and mudulus between them
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.IOException;

class InputUser {
    public static void main(String[] args) throws IOException
    {
        InputStreamReader is = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(is);
        System.out.println("Enter two numbers for Operation : ");
        int num1 = Integer.parseInt(br.readLine());
        int num2 = Integer.parseInt(br.readLine());
        
        //Logic for operation
        System.out.println("Add = "+(num1+num2));
        System.out.println("Add = "+(num1-num2));
        System.out.println("Add = "+num1*num2);
        System.out.println("Add = "+num1/num2);
        System.out.println("Add = "+num1%num2);
    }
}
