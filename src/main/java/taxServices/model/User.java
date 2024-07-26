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
}


