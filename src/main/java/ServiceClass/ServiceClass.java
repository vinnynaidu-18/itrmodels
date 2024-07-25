package ServiceClass;

import org.neoteric.model.Admission;
import org.neoteric.model.Student;

import java.util.UUID;

public class ServiceClass {
    public Admission getAdmission(Student vinny) {

        Admission admission = null;

        if (vinny.age > 6) {

            admission = new Admission();
            admission.rollNumber = "TG" + UUID.randomUUID().toString();
            admission.fee = 10000;
            admission.standard = vinny.standard;
        }
        return admission;
    }
}
