package sk.itsovy.pckg1;

public class Calculator {
    private boolean power;
    private String name;

    public Calculator() {
    }

    public Calculator(String name) {
        this.name = name;
        power = false;
    }

    public int add(int a, int b) {
        if (isPower() == true) {
            return a + b;
        } else {
            return 0;
        }
    }

    public int subtract(int a, int b) {
        if (isPower() == true) {
            return a - b;
        } else {
            return 0;
        }
    }

    public int multiply(int a, int b) {
        if (isPower() == true) {
            return a * b;
        } else {
            return 0;
        }
    }

    public int divide(int a, int b) {
        if (isPower() == true) {
            return a / b;
        } else {
            return 0;
        }
    }

    public boolean isPower() {
        return power;
    }

    public String getName() {
        return name;
    }

    public void turnOn() {
        power = true;
    }

    public void turnOff() {
        power = false;
    }

    public int calcSquareArea(int a) {
        if (isPower() == true) {
            return a * a;
        } else {
            return 0;
        }
    }

    public double calcDiagonal(int a, int b) {
        if (isPower() == true) {
            return Math.sqrt(a*a+b*b);
        } else {
            return 0;
        }
    }
    public double calcCircleArea(double r) {
        if (isPower() == true) {
            return (r*r*Math.PI);
        } else {
            return 0;
        }
    }

    public double convertCmToIn(double a) {
        if (isPower() == true) {
            return a * 0.393;
        } else {
            return 0;
        }
    }

    public double convertInToCm(double a) {
        if (isPower() == true) {
            return a / 0.393;
        } else {
            return 0;
        }
    }
    public void toggle() {
        if (isPower() == false) {
            power = true;
        } else {
            power = false;
        }
    }
    public String convertDecToHex(int value) {
        if (isPower() == true) {
            return Integer.toHexString(value);
        } else {
            return null;
        }
    }
    public double aritmeticAverage(int a, int b, int c) {
        if (isPower() == true) {
            return (double) (a+b+c)/3;
        } else {
            return 0;
        }
    }
    public double calcBallVolume(double r) {
        if (isPower() == true) {
            return (4.0/3.0)*Math.PI*(r*r*r);
        } else {
            return 0;
        }
    }
    public int calcBlockArea(int a, int b, int c) {
        if (isPower() == true) {
            return 2*((a*b)+(a*c)+(b*c));
        } else {
            return 0;
        }
    }
}
