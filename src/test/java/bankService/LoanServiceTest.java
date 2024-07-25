package bankService;

import ServiceClass.LoanService;
import bankModel.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class LoanServiceTest {
    @Test
    public void loanTest(){

                Address address=new Address();
                address.flatNo="g1";
                address.street="mana street";
                address.area="sardar patel nagar";
                address.pincode="5000031";
                address.city="hyd";

                IncomeDetails incomeDetails=new IncomeDetails();
                incomeDetails.incomeAmount=50000;// Monthly Amount
                incomeDetails.monthlyExpenditure=20000;
                incomeDetails.incomeSource="by company";

                EmployeeDetails employementDetails=new EmployeeDetails();
                employementDetails.nameOfTheCompany="xxxxxxxx";
                employementDetails.companyEmail="xxxxxxxxxxxx@gmail.com";
                employementDetails.companyAddress=address;


                PersonalDetails personalDetails=new PersonalDetails();
                personalDetails.firstName="Manideep";
                personalDetails.lastName="Utla";
                personalDetails.age=22;
                personalDetails.mobileNo="9985533134";
                personalDetails.email="manideep@gmail.com";
                personalDetails.address=address;
                personalDetails.identification="pan";
                personalDetails.profession="software";


                ApplicationDetails applicationDetails=new ApplicationDetails();
                applicationDetails.incomeDetails=incomeDetails;
                applicationDetails.employeeDetails=employementDetails;
                applicationDetails.personalDetails=personalDetails;
                applicationDetails.address=address;


                LoanDetails loanDetails=new LoanDetails();
                loanDetails.loanTerm=24;
                loanDetails.purposeOfLoan="business";
                loanDetails.creditScore=800;
                loanDetails.interestRate=0.2;
                loanDetails.applicationDetails=applicationDetails;


                LoanService service=new LoanService();

                service.getApplication(applicationDetails);
                service.getLoan(loanDetails);
                double savings=service.isEligibleToLoan(incomeDetails);
                double loanamount = service.isEligibleToLoan(incomeDetails);
                double finalLoanAmount=service.getLoan(loanDetails);
                double emisavings=service.getLoan(loanDetails);
                double emiAmount=service.getLoan(loanDetails);

            }
            @Test
            public void getapplication_isforeligible(){
                Address address=new Address();
                address.flatNo="g1";
                address.street="mana street";
                address.area="sardar patel nagar";
                address.pincode="5000031";
                address.city="hyd";


                IncomeDetails incomeDetails=new IncomeDetails();
                incomeDetails.incomeAmount=50000;// Monthly Amount
                incomeDetails.monthlyExpenditure=20000;
                incomeDetails.incomeSource="by company";

                EmployeeDetails employementDetails=new EmployeeDetails();
                employementDetails.nameOfTheCompany="xxxxxxxx";
                employementDetails.companyEmail="xxxxxxxxxxxx@gmail.com";
                employementDetails.companyAddress=address;


                PersonalDetails personalDetails=new PersonalDetails();
                personalDetails.firstName="Manideep";
                personalDetails.lastName="Utla";
                personalDetails.age=22;
                personalDetails.mobileNo="9985533134";
                personalDetails.email="manideep@gmail.com";
                personalDetails.address=address;
                personalDetails.identification="pan";
                personalDetails.profession="software";



                ApplicationDetails applicationDetails=new ApplicationDetails();
                applicationDetails.incomeDetails=incomeDetails;
                applicationDetails.employeeDetails=employementDetails;
                applicationDetails.personalDetails=personalDetails;
                applicationDetails.address=address;


                LoanDetails loanDetails=new LoanDetails();
                loanDetails.loanTerm=24;
                loanDetails.purposeOfLoan="business";
                loanDetails.creditScore=800;
                loanDetails.interestRate=0.2;
                loanDetails.applicationDetails=applicationDetails;


                LoanService service=new LoanService();

                service.getApplication(applicationDetails);
                service.getLoan(loanDetails);
                double savings=service.isEligibleToLoan(incomeDetails);
                double loanamount = service.isEligibleToLoan(incomeDetails);
                double finalLoanAmount=service.getLoan(loanDetails);
                double emisavings=service.getLoan(loanDetails);
                double emiAmount=service.getLoan(loanDetails);




                Assertions.assertTrue(applicationDetails.incomeDetails.incomeAmount>applicationDetails.incomeDetails.monthlyExpenditure);
                Assertions.assertNotNull(applicationDetails);

            }



            @Test
            public void iseligibleforloan(){
                Address address=new Address();
                address.flatNo="g1";
                address.street="mana street";
                address.area="sardar patel nagar";
                address.pincode="5000031";
                address.city="hyd";


                IncomeDetails incomeDetails=new IncomeDetails();
                incomeDetails.incomeAmount=50000;// Monthly Amount
                incomeDetails.monthlyExpenditure=20000;
                incomeDetails.incomeSource="by company";

                EmployeeDetails employementDetails=new EmployeeDetails();
                employementDetails.nameOfTheCompany="xxxxxxxx";
                employementDetails.companyEmail="xxxxxxxxxxxx@gmail.com";
                employementDetails.companyAddress=address;


                PersonalDetails personalDetails=new PersonalDetails();
                personalDetails.firstName="Manideep";
                personalDetails.lastName="Utla";
                personalDetails.age=22;
                personalDetails.mobileNo="9985533134";
                personalDetails.email="manideep@gmail.com";
                personalDetails.address=address;
                personalDetails.identification="pan";
                personalDetails.profession="software";


                ApplicationDetails applicationDetails=new ApplicationDetails();
                applicationDetails.incomeDetails=incomeDetails;
                applicationDetails.employeeDetails=employementDetails;
                applicationDetails.personalDetails=personalDetails;
                applicationDetails.address=address;


                LoanDetails loanDetails=new LoanDetails();
                loanDetails.loanTerm=24;
                loanDetails.purposeOfLoan="business";
                loanDetails.creditScore=800;
                loanDetails.interestRate=0.2;
                loanDetails.applicationDetails=applicationDetails;


                LoanService service=new LoanService();

                service.getApplication(applicationDetails);
                service.getLoan(loanDetails);
                double savings=service.isEligibleToLoan(incomeDetails);
                double loanamount = service.isEligibleToLoan(incomeDetails);
                double finalLoanAmount=service.getLoan(loanDetails);
                double emisavings=service.getLoan(loanDetails);
                double emiAmount=service.getLoan(loanDetails);


                Assertions.assertEquals(savings,incomeDetails.incomeAmount-incomeDetails.monthlyExpenditure);
                Assertions.assertNotNull(incomeDetails);

            }

            @Test
            public void getloan_approved(){

                Address address=new Address();
                address.flatNo="g1";
                address.street="mana street";
                address.area="sardar patel nagar";
                address.pincode="5000031";
                address.city="hyd";


                IncomeDetails incomeDetails=new IncomeDetails();
                incomeDetails.incomeAmount=50000;// Monthly Amount
                incomeDetails.monthlyExpenditure=20000;
                incomeDetails.incomeSource="by company";

                EmployeeDetails employementDetails=new EmployeeDetails();
                employementDetails.nameOfTheCompany="xxxxxxxx";
                employementDetails.companyEmail="xxxxxxxxxxxx@gmail.com";
                employementDetails.companyAddress=address;


                PersonalDetails personalDetails=new PersonalDetails();
                personalDetails.firstName="Manideep";
                personalDetails.lastName="Utla";
                personalDetails.age=22;
                personalDetails.mobileNo="9985533134";
                personalDetails.email="manideep@gmail.com";
                personalDetails.address=address;
                personalDetails.identification="pan";
                personalDetails.profession="software";



                ApplicationDetails applicationDetails=new ApplicationDetails();
                applicationDetails.incomeDetails=incomeDetails;
                applicationDetails.employeeDetails=employementDetails;
                applicationDetails.personalDetails=personalDetails;
                applicationDetails.address=address;


                LoanDetails loanDetails=new LoanDetails();
                loanDetails.loanTerm=24;
                loanDetails.purposeOfLoan="business";
                loanDetails.creditScore=800;
                loanDetails.interestRate=0.2;
                loanDetails.applicationDetails=applicationDetails;


                LoanService service=new LoanService();
                service.getApplication(applicationDetails);
                service.getLoan(loanDetails);
                double savings=service.isEligibleToLoan(incomeDetails);
                double loanamount = service.isEligibleToLoan(incomeDetails);
                double finalLoanAmount=service.getLoan(loanDetails);
                double emisavings=service.getLoan(loanDetails);
                double emiAmount=service.getLoan(loanDetails);


                Assertions.assertTrue(emisavings>emiAmount);
                Assertions.assertNotNull(loanDetails);

            }
}









