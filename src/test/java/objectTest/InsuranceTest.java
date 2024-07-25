package objectTest;

import objects.InsuranceForm;
import org.junit.jupiter.api.Test;

public class InsuranceTest {
 @Test
public void Test(){
        InsuranceForm insuranceForm=new InsuranceForm();

        insuranceForm.name="Vinny";
        insuranceForm.dob="01/07/2002";
        insuranceForm.email="vineelathota0@gmail.com";
        insuranceForm.phoneNumber="9154021693";
        insuranceForm.address="Mellacheruvu";
        insuranceForm.insturanceType="health";

        System.out.println("name="+insuranceForm.name);
        System.out.println("dob="+insuranceForm.dob);
        System.out.println("email="+insuranceForm.email);
        System.out.println("phoneNumber="+insuranceForm.phoneNumber);
        System.out.println("address="+insuranceForm.address);
    }
}
