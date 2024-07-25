package org.neoteric.model;

public class Admission {


    public double fee;
    public String rollNumber;
    public String standard;

    @Override
    public String toString() {
        return "Admission{" +
                "fee=" + fee +
                ", rollNumber='" + rollNumber + '\'' +
                ", standard='" + standard + '\'' +
                '}';
    }
}
