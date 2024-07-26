package taxServices.model;

public class Service {
    // Calculate tax based on income alone
        public double calculateTax(User user) {
            if (user.income <= 500000) {
                return user.income * 0.05;
            } else if (user.income <= 1000000) {
                return 25000 + (user.income - 500000) * 0.2;
            } else {
                return 125000 + (user.income - 1000000) * 0.3;
            }
        }
        // Overloaded method to include business income
        public double calculateTax(User user, boolean includeBusinessIncome) {
            double tax = calculateTax(user);
            if (includeBusinessIncome && user.businessIncome) {
               tax += user.income * 0.15;
            }
            return tax;
        }

        public double calculateTax(User user, double otherIncome) {
            double tax = calculateTax(user);
            if (otherIncome > 0) {
               tax += otherIncome * 0.1;
            }
            return tax;
        }

        // Overloaded method to include both business income and other income
        public double calculateTax(User user, boolean includeBusinessIncome, double otherIncome) {
            double tax = calculateTax(user, includeBusinessIncome);
            if (otherIncome > 0) {
                tax += otherIncome * 0.1;
            }
            return tax;
        }
    }


