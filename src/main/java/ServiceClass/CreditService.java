package ServiceClass;

import bankRegistrationForm.Customer;
import bankRegistrationForm.OTPValidation;

public class CreditService {

    public OTPValidation Registation(Customer customer){

        OTPValidation otp=new OTPValidation();
        otp.mobileNumber="91541021693";
        otp.customerId= customer;

        return otp;
    }


}
