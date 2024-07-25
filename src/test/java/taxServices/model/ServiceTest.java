package taxServices.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ServiceTest {
    @Test
    public void testCalculateTaxWithoutAdditionalIncome() {
        User user = new User("Vinny", 400000, 30, 400000, false, 0);
        Service taxService = new Service();
        double tax = taxService.calculateTax(user);
        assertEquals(20000, tax, "Tax should be 20000 for income of 400000");
    }

    @Test
    public void testCalculateTaxWithBusinessIncome() {
        User user = new User("Vinny", 600000, 28, 800000, true, 0);
        Service taxService = new Service();
        double tax = taxService.calculateTax(user, true);
        double expectedTax = 25000 + (800000 - 500000) * 0.2 + 800000 * 0.15;
        assertEquals(expectedTax, tax, "Tax should include business income tax");
    }

    @Test
    public void testCalculateTaxWithOtherIncome() {
        User user = new User("Vinny", 800000, 45, 1200000, false, 50000);
        Service taxService = new Service();
        double tax = taxService.calculateTax(user, 50000);
        double expectedTax = 125000 + (1200000 - 1000000) * 0.3 + 50000 * 0.1;
        assertEquals(expectedTax, tax, "Tax should include other income tax");
    }

    @Test
    public void testCalculateTaxWithBusinessAndOtherIncome() {
        User user = new User("Vinny", 700000, 40, 1000000, true, 30000);
        Service taxService = new Service();
        double tax = taxService.calculateTax(user, true, 30000);
        double expectedTax = 25000 + (1000000 - 500000) * 0.2 + 1000000 * 0.15 + 30000 * 0.1;
        assertEquals(expectedTax, tax, "Tax should include both business and other income taxes");
    }
}
