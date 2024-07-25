package org.neoteric.model;

public class Address {

    public int flatNo;
    public int street;
    public int pincode;
    public String city;
    public String area;

    @Override
    public String toString() {
        return "Address{" +
                "flatNo=" + flatNo +
                ", street=" + street +
                ", pincode=" + pincode +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                '}';
    }
}
