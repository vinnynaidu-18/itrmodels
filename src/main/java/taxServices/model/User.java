package taxServices.model;

public  class User {
    public String name;
    public double salary;
    public int age;
    public  double income;
    public boolean businessIncome;
    public  double otherIncome;

    public User(String name, double salary, int age, double income, boolean businessIncome, double otherIncome) {
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.income = income;
        this.businessIncome = businessIncome;
        this.otherIncome = otherIncome;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public int getAge() {
        return age;
    }

    public double getIncome() {
        return income;
    }

    public boolean isBusinessIncome() {
        return businessIncome;
    }

    public double getOtherIncome() {
        return otherIncome;
    }
}


