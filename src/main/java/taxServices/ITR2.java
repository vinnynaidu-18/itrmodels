package taxServices;

import taxServices.User;

public class ITR2 {

        // Method to calculate tax without any deductions
        public double calculateTax(User user) {
            return calculateTax(user.getSalary(), 0);
        }

        // Overloaded method to calculate tax with additional deductions
        public double calculateTax(User user, double deductions) {
            double taxableIncome = user.getSalary() - deductions;
            return calculateTax(taxableIncome, 0);
        }

        // Overloaded method to calculate tax with different income types
        public double calculateTax(User user, double otherIncome, double deductions) {
            double totalIncome = user.getSalary() + otherIncome - deductions;
            return calculateTax(totalIncome, 0);
        }

        // Overloaded method to calculate tax with business income
        public double calculateTax(User user, double businessIncome, double otherIncome, double deductions) {
            double totalIncome = user.getSalary() + otherIncome + businessIncome - deductions;
            return calculateTax(totalIncome, businessIncome);
        }

        // Private helper method to calculate tax based on income slabs and business income
        private double calculateTax(double income, double businessIncome) {
            double tax;
            double totalIncome = income + businessIncome;

            if (totalIncome <= 300000) {
                tax = 0;  // No tax for income up to 300,000
            } else if (totalIncome <= 600000) {
                tax = (totalIncome - 300000) * 0.10;  // 10% tax for income between 300,001 to 600,000
            } else if (totalIncome <= 1200000) {
                tax = (300000 * 0.10) + (totalIncome - 600000) * 0.25;  // 25% tax for income between 600,001 to 1,200,000
            } else {
                tax = (300000 * 0.10) + (600000 * 0.25) + (totalIncome - 1200000) * 0.35;  // 35% tax for income above 1,200,000
            }

            // Additional tax logic for business income
            if (businessIncome > 0) {
                tax += businessIncome * 0.15;  // Additional 15% tax on business income
            }

            return tax;
        }
    }


