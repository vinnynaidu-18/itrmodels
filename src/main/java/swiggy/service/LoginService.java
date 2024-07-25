package swiggy.service;

import swiggy.model.Swiggy;
import swiggy.model.User;

public class LoginService {
    public String otp;

    public Swiggy validateLogin(User user) {
        Swiggy swiggy = new Swiggy();
        if (otp == user.otp) {
            System.out.println("otp is valid");
        }
       return swiggy;
    }

}








