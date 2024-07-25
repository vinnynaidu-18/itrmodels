package taxServices;

public class ITR1 {


     public double calculateTax(User user) {
            return calculateTax(user.getSalary());
        }
        public double calculateTax(User user,double deductions) {
            double taxableIncome = user.getSalary()- deductions;
            return calculateTax(taxableIncome);
        }

        public double calculateTax(User user, double otherIncome, double deductions) {
            double totalIncome = user.getSalary() + otherIncome - deductions;
            return calculateTax(totalIncome);
        }

        private double calculateTax(double income) {
            double tax;

            if (income <= 250000) {
                tax = 0;  // No tax for income up to 250,000
            } else if (income <= 500000) {
                tax = (income - 250000) * 0.05;  // 5% tax for income between 250,001 to 500,000
            } else if (income <= 1000000) {
                tax = (250000 * 0.05) + (income - 500000) * 0.20;  // 20% tax for income between 500,001 to 1,000,000
            } else {
                tax = (250000 * 0.05) + (500000 * 0.20) + (income - 1000000) * 0.30;  // 30% tax for income above 1,000,000
            }

            return tax;
        }
    }


