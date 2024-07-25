package taxServices;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

 public class TaxServiceTest {
        @Test
        void testCalculateTaxUsingITR1WithoutDeductions() {
            User user = new User("vinny", 500000) {};
            TaxService taxService = new TaxService();
            ITR1 itr1 = new ITR1();

            double tax = taxService.calculateTax(user, itr1);
            assertEquals(12500, tax, 0.01);
        }

        @Test
        void testCalculateTaxUsingITR1WithDeductions() {
            User user = new User("vinny", 700000) {};
            TaxService taxService = new TaxService();
            ITR1 itr1 = new ITR1();

            double tax = taxService.calculateTax(user, itr1, 200000);  // 200,000 as deductions
            assertEquals(50000, tax, 0.01);
        }

        @Test
        void testCalculateTaxUsingITR1WithOtherIncomeAndDeductions() {
            User user = new User("vinny", 500000) {};
            TaxService taxService = new TaxService();
            ITR1 itr1 = new ITR1();

            double tax = taxService.calculateTax(user, itr1, 300000, 100000);  // 300,000 other income, 100,000 deductions
            assertEquals(120000, tax, 0.01);
        }

        @Test
        void testCalculateTaxUsingITR2WithoutDeductions() {
            User user = new User("vinny", 500000) {};
            TaxService taxService = new TaxService();
            ITR2 itr2 = new ITR2();

            double tax = taxService.calculateTax(user, itr2);
            assertEquals(20000, tax, 0.01);
        }

        @Test
        void testCalculateTaxUsingITR2WithDeductions() {
            User user = new User("vinny", 700000) {};
            TaxService taxService = new TaxService();
            ITR2 itr2 = new ITR2();

            double tax = taxService.calculateTax(user, itr2, 200000);  // 200,000 as deductions
            assertEquals(50000, tax, 0.01);
        }

        @Test
        void testCalculateTaxUsingITR2WithOtherIncomeAndDeductions() {
            User user = new User("vinny", 500000) {};
            TaxService taxService = new TaxService();
            ITR2 itr2 = new ITR2();

            double tax = taxService.calculateTax(user, itr2, 300000, 100000);  // 300,000 other income, 100,000 deductions
            assertEquals(120000, tax, 0.01);
        }

        @Test
        void testCalculateTaxUsingITR2WithBusinessIncome() {
            User user = new User("vinny", 500000) {};
            TaxService taxService = new TaxService();
            ITR2 itr2 = new ITR2();

            double tax = taxService.calculateTax(user, itr2, 200000, 300000, 100000);  // 200,000 business income, 300,000 other income, 100,000 deductions
            assertEquals(285000, tax, 0.01);
        }
    }

