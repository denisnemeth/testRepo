package sk.itsovy.pckg1;

public class Person {
    private String name;
    private int age;
    private boolean gender; // true = male, false = female
    private double height;
    private int weight;
    private char status; // s = single, m = married, d = divorced, w = widow
    private Mobile mobile; // default null
    private Car car;
    private Calculator calculator;

    public Person() {
    }

    public Person(String name, int age, boolean gender, double height, int weight, char status) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
        this.weight = weight;
        this.status = status;
    }

    public void print() {
        System.out.println("----------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height/Weight: " + height + "/" + weight);
        System.out.println("BMI: " + calculateBmi() + " " + getBmiTextStatus());
        System.out.println("Gender: " + gender);
        System.out.println("Status: " + status);
        System.out.println("----------------------------------");
    }

    public void about() {
        System.out.println("Hello. I am class Person. Have a nice day!");
    }

    public double calculateBmi() {
        double bmi;
        bmi = weight / (height * height);
        return bmi;
    }

    public String getBmiTextStatus() {
        if (calculateBmi() < 20)
            return "makes them underweight";
        if (calculateBmi() < 25)
            return "is optimal";
        if (calculateBmi() < 30)
            return "makes them overweight";
        return "makes them obese";
    }

    public int getBYear() {
        int bYear;
        int year = 2019;
        bYear = year - age;
        return bYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setStatus(char status) {
        this.status = status;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }

    public Mobile getMobile() {
        return mobile;
    }

    public void setMobile(Mobile mobile) {
        this.mobile = mobile;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void setCalculator(Calculator calculator) {
        this.calculator = calculator;
    }

    public Calculator getCalculator() {
        return calculator;
    }

    public boolean hasCalculator() {
        return calculator != null;
    }
    public boolean hasMobilePhone() {
        if (mobile == null) {
            return false;
        } else {
            return true;
        }
    }
}
