public class HiringCompany
{
    static {
        short currentYear = 2024;
        boolean companyIsAlive = true;
    }

    static final String companyName = "Hire LLC";
    static final short establishedYear = 2024;
    static float revenue = 30400785.56f;


    static void hasDegree(String employee, boolean degree) {
        if (degree == true) {
            System.out.println("\n" + employee + " has got a degree");
        } else {
            System.out.println("\n" + employee + " does not have a degree");
        }
    }

    static void licenseCheck(String company, boolean license) {
        if (license == true) {
            System.out.println("\n" + company + " has got a license");
        } else {
            System.out.println("\n" + company + " does not have a license");
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



    void profitability(String company, float revenue, float expenses) {
        if (revenue > expenses) {
            System.out.println(company + " is profitable");
        } else if (revenue == expenses) {
            System.out.println(company + " is stable");
        } else if (revenue < expenses) {
            System.out.println(company + " is losing it's money");
        }
    }

    //Test


    public static int jobListing(String[] arr, int length) {

        if (length == 0) {
            return 0;
        }

        System.out.println(arr[length - 1]);

        return jobListing(arr, length - 1);
    }



    public static void addEmpToDB(String name, String[] arr, int freeSpace) {
        arr[freeSpace] = name;
        System.out.println("\nThe name was added");

    }


    public static void printEmpCompDB(String[][] arr, String[] arr1) {

        System.out.println("\nInformation about the companies: ");

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                continue;
            }
            for(int j = 0; j < arr[i].length; j++) {
                if(arr[i][j] == null) {
                    continue;
                }
                System.out.print(arr[i][j]);
                System.out.print(" : ");
            }
            System.out.println();
        }

        System.out.println("\nCurrent list of potential employees:");
        for(String n: arr1) {
            if (n == null) {
                continue;
            }
            System.out.println(n);
        }
    }



    public static String[][] addCompaniesToDB(String[][] arr, int freeRow, int freeColumn1, int freeColumn2,
                                              String companyName,
                                              String companyIndustry) {
        arr[freeRow][freeColumn1] = companyName;
        arr[freeRow][freeColumn2] = companyIndustry;
        return arr;
    }

    public static void main(String[] args) {

        byte partnersNum = 4;
        byte numOfBranches = 3;
        String branchOneName = "Nuke";
        String branchTwoName = "Inferno";
        String branchThreeName = "Mirage";
        boolean avanguardIsActive = true;
        boolean siriusIsActive = false;
        boolean mirageIsActive = false;
        byte numOfWorkers = 67;

        float companyExpenses = 3462.78f;
        boolean salaryIsGiven = false;


        float givenSalary = 0f;


        byte jobsNum = 5;
        byte jobSeekersNum = 3;

        String empOneName = "Michael Jefferson";
        String empOneProfession = "Electrical Engineer";
        byte employeeOneId = 9;
        byte employeeOneAge = 28;
        final boolean hasDegree1 = true;
        byte experienceYears1 = 3;
        final float employeeOneGpa = 3.4f;
        byte contractDaysLeft1 = 31;



        String companyOneName = "Saneg LLC";
        final short companyOneEstYear = 2004;
        float companyOneRevenue = 3440001.45f;
        short avgSalary1 = 3000;
        final boolean licenesed1 = true;
        String industry1 = "Engineering";


        // Employer two
        String companyTwoName = "Apple Inc.";
        final short companyTwoEstYear = 1978;
        float companyTwoRevenue = 34400045561.45f;
        short avgSalary2 = 5000;
        final boolean licenesed2 = true;
        String industry2 = "IT";

        // Employer three
        String companyThreeName = "Google Inc.";
        final short companyThreeEstYear = 1998;
        float companyThreeRevenue = 3440456561.45f;
        short avgSalary3 = 4000;
        final boolean licenesed3 = true;
        String industry3 = "IT";

        // Employer four
        String companyFourName = "FaceBook Inc.";
        final short companyFourEstYear = 2005;
        float companyFourRevenue = 343234561.45f;
        float companyFourExpenses = 34234252.454f;
        short avgSalary4 = 3000;
        final boolean licenesed4 = true;
        String industry4 = "IT";

        byte monthDay = 0;

        byte counterForPotentialComps = 0;


        String[] jobSeekersDataBase = new String[8];
        jobSeekersDataBase[0] = "Antony Joshua";
        jobSeekersDataBase[1] = "Tiffany Jons";
        jobSeekersDataBase[2] = "Melonie Katelin";

        String[] potentialComps = {"Google", "FaceBook", "Eriell", "Wallmart", "Pearson"};

        String[] potentialJobSeekers = {"Andrew Tate", "Joana Richardson", "Mandy Alerton", "Name4", "Name5", "Name6"
                , "Name7"};

        String[] jobsDatabase = {"Software Developer", "Electrical Engineer", "Petrolium Engineer", "HR manager",
                "Project Manager"};

        String[][] companiesDataBase = new String[20][2];
        companiesDataBase[0][0] = companyOneName;
        companiesDataBase[0][1] = industry1;

        companiesDataBase[1][0] = companyTwoName;
        companiesDataBase[1][1] = industry2;

        companiesDataBase[2][0] = companyThreeName;
        companiesDataBase[2][1] = industry3;

        companiesDataBase[3][0] = companyFourName;
        companiesDataBase[3][1] = industry4;


        String[][] potentialCompsDB = {
                {potentialComps[0], "IT"},
                {potentialComps[1]},
                {potentialComps[2], "Petrol"},
                {potentialComps[3]}
        };



        HiringCompany ap = new HiringCompany();
        ap.profitability(companyFourName, companyFourRevenue, companyFourExpenses);

        addEmpToDB("Name", jobSeekersDataBase, 3);

        licenseCheck(companyFourName, licenesed4);

        hasDegree(empOneName, hasDegree1);

        empEvaluation(employeeOneAge, employeeOneGpa);

        addCompaniesToDB(companiesDataBase, 4, 0, 1, "Blablabla",
                "muffins");

        printEmpCompDB(companiesDataBase, jobSeekersDataBase);

        System.out.println("\nThe list of the jobs in the database: \n");
        System.out.println(jobListing(jobsDatabase, jobsDatabase.length) + "\n");

        System.out.println();
        System.out.println("Company's information: ");
        System.out.println("Name: " + companyName);
        System.out.println("Company's established year: " + establishedYear);

        System.out.println();

        System.out.println("\nThe number of potential candidates that are willing to sign contract with us :\t" + jobSeekersNum + "\t");

        System.out.println();

        System.out.println();

        if (potentialJobSeekers.length > 2) {
            System.out.println("Too many potential candidates");
        }

        if (jobSeekersNum < jobsNum) {
            System.out.println("No enough employees in the database");
        } else {
            System.out.println("The databsase has enough employees");
        }

        System.out.println();

        switch (empOneProfession) {
            case "Electrical Engineer":
                System.out.println("The employee can work in " + companyOneName);

                break;

            case "Software Engineer":
                System.out.println("The employee can work in " + companyTwoName);

                break;
            default:
                System.out.println("No available jobs for the employee");

                break;
        }

        System.out.println();

        for (monthDay = 0; monthDay <= 30; monthDay++)
        {
            if (monthDay == 30 || monthDay == 31)
            {
                givenSalary = (revenue - companyExpenses) / numOfWorkers;
                System.out.println("\nAll workers have recieved their salary\n");
                System.out.println("The average salary according to the company's revenue is : " + givenSalary + "\n");
                salaryIsGiven = true;
            }
            else
            {
                System.out.println("\nDay " + monthDay);
            }
        }

        System.out.println();

        while (contractDaysLeft1 > 0) {
            System.out.println(empOneName + " has " + contractDaysLeft1 + " days of the contract left");
            System.out.println();
            contractDaysLeft1--;
        }

        System.out.println("Pontential employers:");

        do {
            System.out.print(potentialComps[counterForPotentialComps] + " ");
            counterForPotentialComps++;
        } while (counterForPotentialComps < potentialComps.length);

        System.out.println();
        System.out.println();


        for(int i = 0; i <= potentialComps.length; i++) {
            if (potentialComps[i] != "Eriell") {
                System.out.println("No match");
                continue;
            }
            else {
                System.out.println(potentialComps[i] + ". Match");
                break;
            }
        }
    };
}