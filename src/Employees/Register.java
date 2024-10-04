package Employees;
import java.util.Scanner;

public class Register {

    Scanner sc = new Scanner(System.in);

    public void nameRegister() {

        System.out.println("Enter your full name please --> ");
        String name = sc.nextLine();
        System.out.println("Is your full name correct? Type y if yes, type n if it is not --> ");
        String confirm = sc.nextLine();

        if (confirm.compareTo("y") == 0) {
            System.out.println("The name \"" + name + "\" has been added the database");
        } else {
            // To be developed...
        }

    }

    public void professionRegister() {

        System.out.println("Enter the name of your profession --> ");
        String profession = sc.nextLine();
        System.out.println("Is the name of your profession correct? Type y if yes, type n if it is not --> ");
        String confirm = sc.nextLine();

        if (confirm.compareTo("y") == 0) {
            System.out.println("Your profession \"" + profession + "\" has been added the database");
        }

    }

}
