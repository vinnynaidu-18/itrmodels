package TestClasses;

import ServiceClass.Bankservice;
import objects.BankForm;
import objects.CreatedAcount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

  public class BankserviceTest {

      @Test
        public void test(){

           BankForm bankForm =new BankForm();
           bankForm.name="Vinny";
           bankForm.adharNumber="399351949976";
           bankForm.accountType="Savings";
           bankForm.phoneNumber="9154021693";
           bankForm.branchName="SBI Kodad";
           bankForm.branchAddress="Kodad";
           bankForm.balance=5000;

           Bankservice service=new Bankservice();
           service.getbalance(bankForm);
           CreatedAcount createdAcount=service.getbalance(bankForm);

          Assertions.assertEquals(5000,createdAcount.balance );
          Assertions.assertNotNull(createdAcount.balance);

          //System.out.println("Current balance: " + service.getbalance(5000));
       }
    }
