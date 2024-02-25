import java.util.Scanner;

class Employee {
    String name;
    String number;
    String status;
    String department;
    int daysWorked;
    double dailyRate;
    double grossPay;
    double netPay;
    double tax;
    double sss;
    double ca ;

void calculatePay() {
    grossPay = daysWorked * dailyRate;
    netPay = grossPay - (tax + sss + ca);
    }

void displayInfo() {
    System.out.println("****************************** \n" +
    "Employee Information: \n" +
    "Name: " + name + "\n" +
    "Number: " + number + "\n" +
    "Status: " + status + "\n" +
    "Department: " + department + "\n" +
    "Days Worked: " + daysWorked + "\n" +
    "Daily Rate: " + dailyRate + "\n" +
    "Tax: " + tax + "\n" +
    "SSS: " + sss + "\n" +
    "CA: " + ca + "\n" +
    "****************************** \n" +
    "PLEASE WAIT....");
    }

    void displayReceipt() {
        System.out.println("\n\n" +
            "****************************** \n" +
            "******** PAY SLIP ************ \n" +
            "******************************\n" +
            "Employee Name: " + name + "\n" +
                "Employee Number: " + number + "\n" +
                "Status: " + status + "\n" +
                "Department: " + department + "\n" +
                "Days Worked: " + daysWorked + "\n" +
                "Daily Rate: " + dailyRate + "\n \n" +
            "Tax: " + tax + "\n" +
            "SSS: " + sss + "\n" +
            "CA: " + ca + "\n" +
            "Gross Pay: " + grossPay + "\n" +
            "Net Pay: " + netPay + "\n" +
            "******************************");
    }

}

public class Main {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Employee employee = new Employee();

            System.out.println("Enter Employee Name:");
            employee.name = scanner.nextLine();

            System.out.println("Enter Employee Number:");
            employee.number = scanner.nextLine();

            System.out.println("Enter Employee Status:");
            employee.status = scanner.nextLine();

            System.out.println("Enter Department:");
            employee.department = scanner.nextLine();

            System.out.println("Enter Days Worked:");
            employee.daysWorked = scanner.nextInt();

            System.out.println("Enter Daily Rate:");
            employee.dailyRate = scanner.nextDouble();

            System.out.println("Enter Less Tax:");
            employee.tax = scanner.nextDouble();

            System.out.println("Enter SSS:");
            employee.sss = scanner.nextDouble();

            System.out.println("Enter Cash Advance (Ca):");
            employee.ca = scanner.nextDouble();

            employee.displayInfo();

            // Pause for a few seconds
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            // Calculate pay and display receipt
            employee.calculatePay();
            employee.displayReceipt();
        }
    }
}
