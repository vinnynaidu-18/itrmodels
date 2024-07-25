package swiggy.model;

public class User {
    public String userName;
    public String otp;

    public Address address;

    public User(String userName, String otp, Address address) {
        this.userName = userName;
        this.otp = otp;
        this.address = address;
    }
}
