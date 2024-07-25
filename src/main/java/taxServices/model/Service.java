package taxServices.model;

public class Service {
    // Calculate tax based on income alone
        public double calculateTax(User user) {
            if (user.getIncome() <= 500000) {
                return user.getIncome() * 0.05;
            } else if (user.getIncome() <= 1000000) {
                return 25000 + (user.getIncome() - 500000) * 0.2;
            } else {
                return 125000 + (user.getIncome() - 1000000) * 0.3;
            }
        }

        // Overloaded method to include business income
        public double calculateTax(User user, boolean includeBusinessIncome) {
            double tax = calculateTax(user);
            if (includeBusinessIncome && user.isBusinessIncome()) {
               tax += user.getIncome() * 0.15;
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


