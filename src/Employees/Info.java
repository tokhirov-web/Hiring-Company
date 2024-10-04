package Employees;

public class Info {

    static Companies.Info compInfoObj = new Companies.Info();

    public static void clientContractCheck(String name, int days) {
        while (days > 0) {
            System.out.println(name + " has " + days + " days of the contract left");
            System.out.println();
            days--;
        }
    }

    public static void clientWorkCompany(String name, String position) {
        switch (position) {
            case "Electrical Engineer":
                System.out.println("The employee can work in " + compInfoObj.companyOneName);

                break;

            case "Software Engineer":
                System.out.println("The employee can work in " + compInfoObj.companyTwoName);

                break;
            default:
                System.out.println("No available jobs for the employee");

                break;
        }
    }

    public static void empEvaluation(int age, float gpa) {
        if (gpa >= 3f) {
            if (age >= 23) {
                System.out.println("\nThe employee is eligible for consideration");
            } else {
                System.out.println("\nThe employee is not eligible for consideration. Too young");
            }
        } else {
            System.out.println("\nThe employee is not eligible for consideration. Low GPA");
        }
    }

    public String empOneName = "Michael Jefferson";
    public String empOneProfession = "Electrical Engineer";
    public byte employeeOneId = 9;
    public byte employeeOneAge = 28;
    public final boolean hasDegree1 = true;
    public byte experienceYears1 = 3;
    public final float employeeOneGpa = 3.4f;
    public byte contractDaysLeft1 = 31;



}
