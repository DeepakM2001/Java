import java.util.Scanner;
public class Name{
    public static void main(String args [] ){
        String FirstName,LastName,FullName;
        Scanner input = new Scanner(System.in);
    System.out.println("Enter your First Name:");
    FirstName =input.next();
    System.out.println("Enter your Last Name:");
    LastName= input.next();
    FullName= FirstName + LastName;
    System.out.println("The full name is : " + FullName);
}
}