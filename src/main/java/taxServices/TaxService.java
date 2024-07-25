package taxServices;

public class TaxService {
    // Method overloading for different ITR forms

    public double calculateTax(User user, ITR1 itr1) {
        return itr1.calculateTax(user);
    }

    public double calculateTax(User user, ITR1 itr1, double deductions) {
        return itr1.calculateTax(user, deductions);
    }

    public double calculateTax(User user, ITR1 itr1, double otherIncome, double deductions) {
        return itr1.calculateTax(user, otherIncome, deductions);
    }

    public double calculateTax(User user, ITR2 itr2) {
        return itr2.calculateTax(user);
    }

    public double calculateTax(User user, ITR2 itr2, double deductions) {
        return itr2.calculateTax(user, deductions);
    }

    public double calculateTax(User user, ITR2 itr2, double otherIncome, double deductions) {
        return itr2.calculateTax(user, otherIncome, deductions);
    }

    public double calculateTax(User user, ITR2 itr2, double businessIncome, double otherIncome, double deductions) {
        return itr2.calculateTax(user, businessIncome, otherIncome, deductions);
    }
}
