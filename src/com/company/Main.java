package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

    double hour = 10;
    double minute = 30;
    double second = 30;
    double day = 86400;

    double hour2 = 11;
    double minute2 = 36;
    double second2 = 30;

    System.out.print("Number of seconds since midnight ");
    System.out.println((hour * 60 + minute) * 60 + second);

    System.out.print("Number of seconds remaining in the day ");
    System.out.println(day - ((hour * 60 + minute) * 60 + second));

    System.out.print("% of the day that has passed ");
    System.out.println(((hour * 60 +minute) * 60 + second) / day * 100);

    System.out.print("Elapsed time since i started ");
    System.out.println((hour2 - hour) + ":" + (minute2 - minute) + ":" + (second2 - second));
    }
}
