package sk.itsovy.pckg1;

import sk.itsovy.other.FreeClass;
import sk.itsovy.other.Test;
import sk.itsovy.other.Rectangles;

public class Main {
    public static void main(String[] args) {

        Person person1;
        person1 = new Person();
        Person person2 = new Person();

        person1.setName("Denis");
        person2.setName("Lucia");

        person1.setAge(19);
        person1.setHeight(1.70);
        person1.setWeight(70);
        person1.setGender(true);
        person1.setStatus('s');

        person2.setAge(17);
        person2.setHeight(1.65);
        person2.setWeight(65);

        Person student1 = new Person("Oliver", 21, true, 1.88, 80, 's');

        Mobile mobile1 = new Mobile();
        mobile1.setBrand("Huawei");
        mobile1.setModel("P30 lite");
        mobile1.setPhoneNumber("+421 904 254 228");

        Mobile mobile2 = new Mobile("Samsung", "S9", "0904239436");

        person1.setMobile(mobile1);
        person2.setMobile(mobile2);

        Car car1 = new Car("Volkswagen", "Passat", "KS102DC");

        Calculator calculator1 = new Calculator("Casio FX552");
        person1.setCalculator(calculator1);

        FreeClass fc = new FreeClass();
        Test t = new Test();
        Rectangles r = new Rectangles();

        /*person1.about();
        System.out.println(person1.getName()+"'s BMI is "+person1.calculateBmi()+", which "+person1.getBmiTextStatus()+".");
        System.out.println(person1.getName()+" was born in the year "+person1.getBYear()+" and is now "+person1.getAge()+" years old.");*/

        /*if (person1.hasMobilePhone()){
            System.out.println(person1.getName()+"'s phone number is "+person1.getMobile().getPhoneNumber()+".");
        } else {
            System.out.println(person1.getName()+" has no mobile phone.");
        }*/

        /*person1.print();
        if (person1.hasCalculator()) {
            person1.getCalculator().toggle();
            System.out.println(person1.getCalculator().convertDecToHex(4000));
            person1.getCalculator().toggle();
        }*/

        /*person1.getCalculator().toggle();
        System.out.println(person1.getCalculator().calcCircleArea(5));
        System.out.println(fc.changeToEvenNum(5));
        System.out.println(person1.getCalculator().aritmeticAverage(2,3,3));
        System.out.println(person1.getCalculator().calcBallVolume(4));
        System.out.println(person1.getCalculator().calcBlockArea(2, 3, 4));
        System.out.println(fc.loanYears(239,5.5, 12500));*/

        //fc.sayNHi(5);

        /*System.out.println();
        t.task_1();
        System.out.println();
        System.out.println();
        t.task_2();
        System.out.println();
        System.out.println();
        t.task_3();
        System.out.println();
        t.task_4();
        System.out.println();
        t.task_5();
        System.out.println();
        t.task_6();
        System.out.println();
        System.out.println();
        t.task_7();
        System.out.println();
        System.out.println();
        t.task_8();
        System.out.println();
        System.out.println();
        t.task_9();
        System.out.println();
        System.out.println();
        t.task_10();
        System.out.println();*/

        //t.digitSum(123456789);

        r.rectangle3();
    }
}
