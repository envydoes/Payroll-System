# Payroll-System
import java.util.Scanner;

public class PayrollSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String employeeName = scanner.nextLine();

        System.out.print("Enter Hours Worked: ");
        double hoursWorked = scanner.nextDouble();

        System.out.print("Enter Hourly Rate: ");
        double hourlyRate = scanner.nextDouble();

        double grossPay = hoursWorked * hourlyRate;

        double taxRate = 0.10;
        double insuranceRate = 0.025;
        double sssRate = 0.095;
        double pagIbigRate = 0.02;

        double tax = grossPay * taxRate;
        double insurance = grossPay * insuranceRate;
        double sss = grossPay * sssRate;
        double pagIbig = grossPay * pagIbigRate;

        double totalDeductions = tax + insurance + sss + pagIbig;
        double netPay = grossPay - totalDeductions;

        System.out.println("\n--- Payroll Information ---");
        System.out.println("Employee Name: " + employeeName);
        System.out.printf("Hours Worked: %.2f\n", hoursWorked);
        System.out.printf("Hourly Rate: Php %.2f\n", hourlyRate);
        System.out.printf("Gross Pay: Php %.2f\n", grossPay);
        System.out.printf("Insurance (2.5%%): Php %.2f\n", insurance);
        System.out.printf("SSS (9.5%%): Php %.2f\n", sss);
        System.out.printf("PAG-IBIG (2.0%%): Php %.2f\n", pagIbig);
        System.out.printf("Tax Deduction (10%%): Php %.2f\n", tax);
        System.out.printf("Total Deductions: Php %.2f\n", totalDeductions);
        System.out.printf("Net Pay: Php %.2f\n", netPay);

        scanner.close();
    }
}
