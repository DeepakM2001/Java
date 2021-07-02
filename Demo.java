import java.util.Scanner;
public class Demo{
    public static void main(String args[]){
        int num1,num2,solution;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to be added");
        num1 =input.nextInt();
        System.out.println("Enter the number to be added");
        num2 = input.nextInt();
        solution = num1+num2;
        System.out.println("The solution to the problem is "  +  solution); 
    }
}