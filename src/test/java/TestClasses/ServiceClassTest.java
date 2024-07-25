package TestClasses;

import ServiceClass.ServiceClass;
import org.junit.jupiter.api.Test;
import org.neoteric.model.Address;
import org.neoteric.model.Admission;
import org.neoteric.model.Student;

import static org.junit.jupiter.api.Assertions.*;



    public  class ServiceClassTest {
        @Test
        public void getStudentAgeGreaterThanSix() {

            Address address = new Address();
            address.area = "Kphb";
            address.city = "hyd";
            address.flatNo = 42;
            address.street = 2;
            address.pincode = 508216;

            Student vinny = new Student();
            vinny.name = "vinny";
            vinny.age = 12;
            vinny.Address = address;
            vinny.standard = "X";

            ServiceClass serviceClass = new ServiceClass();
            Admission admission = serviceClass.getAdmission(vinny);

            assertEquals(10000, admission.fee);
            assertNotNull(admission.rollNumber);

            // System.out.println(serviceClass.getAdmission(vinny));

        }
    }
