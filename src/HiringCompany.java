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

        Companies.Info compInfoObj = new Companies.Info();
        Employees.Info empInfoObj = new Employees.Info();
        Companies.Register compRegInfo = new Companies.Register();



        byte partnersNum = 4;
        byte numOfBranches = 3;
        String branchOneName = "Nuke";
        String branchTwoName = "Inferno";
        String branchThreeName = "Mirage";
        boolean nukeIsActive = true;
        boolean infernoIsActive = false;
        boolean mirageIsActive = false;
        byte numOfWorkers = 67;

        float companyExpenses = 3462.78f;
        boolean salaryIsGiven = false;

        float givenSalary = 0f;

        byte jobsNum = 5;
        byte jobSeekersNum = 3;

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
        companiesDataBase[0][0] = compInfoObj.companyOneName;
        companiesDataBase[0][1] = compInfoObj.industry1;

        companiesDataBase[1][0] = compInfoObj.companyTwoName;
        companiesDataBase[1][1] = compInfoObj.industry2;

        companiesDataBase[2][0] = compInfoObj.companyThreeName;
        companiesDataBase[2][1] = compInfoObj.industry3;

        companiesDataBase[3][0] = compInfoObj.companyFourName;
        companiesDataBase[3][1] = compInfoObj.industry4;


        String[][] potentialCompsDB = {
                {potentialComps[0], "IT"},
                {potentialComps[1]},
                {potentialComps[2], "Petrol"},
                {potentialComps[3]}
        };


        compInfoObj.profitability(compInfoObj.companyFourName, compInfoObj.companyFourRevenue,
                compInfoObj.companyFourExpenses);

        addEmpToDB("Name", jobSeekersDataBase, 3);

        compInfoObj.licenseCheck(compInfoObj.companyFourName, compInfoObj.licenesed4);

        hasDegree(empInfoObj.empOneName, empInfoObj.hasDegree1);

        empInfoObj.empEvaluation(empInfoObj.employeeOneAge, empInfoObj.employeeOneGpa);

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


        System.out.println();

        for (monthDay = 0; monthDay <= 30; monthDay++)
        {
            if (monthDay == 30 || monthDay == 31)
            {
                givenSalary = (revenue - companyExpenses) / numOfWorkers;
                System.out.println("\nAll workers have received their salary\n");
                System.out.println("The average salary according to the company's revenue is : " + givenSalary + "\n");
                salaryIsGiven = true;
            }
            else
            {
                System.out.println("\nDay " + monthDay);
            }
        }

        System.out.println();

        System.out.println("Potential employers:");

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