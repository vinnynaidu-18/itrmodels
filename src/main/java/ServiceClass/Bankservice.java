package ServiceClass;

import objects.BankForm;
import objects.CreatedAcount;

public class Bankservice {
    public CreatedAcount getbalance(BankForm bankForm) {

        CreatedAcount createdAcount = null;

        if (bankForm.balance>=5000) {
            CreatedAcount createdAcount1 = new CreatedAcount();
            createdAcount = new CreatedAcount();
            createdAcount.balance = 5000;

            //System.out.println("my balance " + createdAcount.balance);
        }
        return createdAcount;
    }
}








