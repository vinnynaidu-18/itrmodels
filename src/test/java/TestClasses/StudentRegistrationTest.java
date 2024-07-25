package TestClasses;

import StudentForm.Address;
import StudentForm.EducationForm;
import StudentForm.ParentForm;
import StudentForm.StudentRegistation;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

public class StudentRegistrationTest {

    @Test
    public void StudentForm(){

        StudentRegistation registation=new StudentRegistation();

        ParentForm parentForm1=new ParentForm();
        parentForm1.name="ramakrishna";
        parentForm1.phoneNumber="9553604524";
        parentForm1.email="ramakrishna123@gmail.com";
        parentForm1.relation="father";

        EducationForm educationForm1=new EducationForm();
        educationForm1.standard="X";
        educationForm1.graduationDate=23/04/2018;
        educationForm1.schoolName="Sri Chaitanya";
        registation.name="vinny";
        registation.age=22;
        registation.dob="01/07/2002";
        registation.email="vinnynaidu128@gmail.com";

        registation.educationForm=educationForm1;
        Address address1=new Address();
        address1.area="kphb";
        address1.city="hyd";
        address1.street="road No4";
        address1.pincode=508218;


        //ParentForm parentForm= registation.parentForm;
      //  EducationForm educationForm= registation.educationForm;
      //  Address address= registation.address;







        assertNotNull(registation.educationForm);
        assertNotNull(registation.parentForm);
        assertNotNull(registation.address);



    }

}
