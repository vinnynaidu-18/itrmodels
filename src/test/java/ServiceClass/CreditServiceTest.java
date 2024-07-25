package ServiceClass;

import bankRegistrationForm.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;



    public class CreditServiceTest {
        @Test
        public void Registation(){

            Address address=new Address();
            address.area="kukatpally";
            address.city="hyderabad";
            address.street="kphb";
            address.pincode="508214";

            RateOfInterest roi=new RateOfInterest();
            roi.accountType="savings";
            roi.endDate=new Date();
            roi.startDate=new Date();
            roi.intesrestOfCurrentAcc=3.0;
            roi.interestofBussinessAcc=4.2;
            roi.interestOfSavingsAcc=3.5;

            IfscCode ifscCode=new IfscCode();
            ifscCode.address=address;
            ifscCode.code="56764";


            Account account=new Account();
            account.accountNumber="1234567";
            account.address=address;
            account.availableBalance=500.0;
            account.currentBalance=300.00;
            account.ifscCode=ifscCode;
            account.rateOfInterest=roi;

            Customer customer=new Customer();
            customer.userName="vinny";
            customer.password="123";
            customer.mobileNumber="9154021693";
            customer.account=account;

            CreditService creditService=new CreditService();
            creditService.Registation(customer);

            OTPValidation otpValidation=creditService.Registation(customer);
            assertNotNull(customer);
            Assertions.assertEquals("23234",otpValidation.otp);

            }

        }
