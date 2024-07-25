package swiggy.model;

public class UserDetails {
    public String name;
    public String email;
    public String password;

    public Address address;

    public UserDetails(String name, String email, String password, Address address) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.address = address;
    }
}
