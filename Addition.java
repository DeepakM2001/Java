import java.util.Scanner;
public class Addition{  //class name
    public static void main(String args[] ){
        int num1,num2,sum;
        String name = "Deepak Murugesan";
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the value of the first number: ");
        num1 = myObj.nextInt();
        System.out.println("Enter the value of the second number: ");
       num2 = myObj.nextInt();
      sum = num1+num2;
      System.out.println("The Sum is " + sum);
      System.out.println("This code was compiled by " + name);
    }
}