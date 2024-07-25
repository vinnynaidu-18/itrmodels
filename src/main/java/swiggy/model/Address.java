package swiggy.model;

public class Address {
    public String city;
    public String area;
    public String street;
    public String pincode;

    public Address(String city, String area, String street, String pincode) {
        this.city = city;
        this.area = area;
        this.street = street;
        this.pincode = pincode;
    }
}
