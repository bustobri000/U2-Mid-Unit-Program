/*
A car salesperson typically earns an hourly wage and a commission on any sales they completed. They typically work 30 to 40
hours a week, earning $5.25 to $7.50 an hour. Additionally, they earn 1% to 3% of all sales they've completed that week,
which a typical car sells for $10,000 to $30,000. A salesperson with a 1% commission that sells a car for $20,000 earns $200.00.

Write a program which prompts the user to enter the hourly rate, hours worked, the sales commission percent and the total
sales of a salesperson and calculates their total earnings. The program should include multiple methods. (What ARE the
smaller pieces?)

Example:

Hourly Rate: 6.25
Hours Worked: 33.5
Sales Commission: 1.5%
Total Sales: $65,000.00

Total Earnings: $1184.38

 */

import javax.swing.*;
import java.text.DecimalFormat;

public class SalesCommission {

    public static void main(String[] args) {
        //steal the declaration of independence
        double hours = input("What is the hourly pay you toil away your life for in decimal form? (##.##)");
        double rate = input("What is the hours you worked for also in decimal form? (##.##)");

        double commission = input("What is the commission percent at subsequently as well in decimal form? (##.##)");
        double totalSales = input("What is the total dollar amount of sales at which is also in decimal form? (####.##)");
        //fail algebra IIx
        double wage = wage(hours, rate);
        double earnings= commissionSales(commission, totalSales);
        //declare independence from ireland
        double totalEarnings = totalEarnings(wage, earnings);
        output(totalEarnings);
    }

    public static double input(String prompt){
        return Double.parseDouble(JOptionPane.showInputDialog(prompt));
    }

    public static double commissionSales(double commission, double totalSales){
        return totalSales * (commission / 100.0);
    }

    public static double wage(double hours, double rate){
       return hours * rate;
    }

    public static double totalEarnings(double wage, double earnings){
        return wage + earnings;
    }

    public static void output(double totalEarnings){
        DecimalFormat round = new DecimalFormat("#,###.00");
        JOptionPane.showMessageDialog(null, "Total Earnings: $" + round.format(totalEarnings));
    }

}
