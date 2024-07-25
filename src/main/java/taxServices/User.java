package taxServices;

public  class User {
    public String name;
    public double salary;

    public User(String name,double salary) {
        this.name = name;
       this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

}
