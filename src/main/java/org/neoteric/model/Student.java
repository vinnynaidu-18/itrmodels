package org.neoteric.model;

public class Student {

   public String name;
   public int age;
   public String standard;
   public Address Address;

   @Override
   public String toString() {
      return "Student{" +
              "name='" + name + '\'' +
              ", age=" + age +
              ", standard='" + standard + '\'' +
              ", Address=" + Address +
              '}';
   }
}
