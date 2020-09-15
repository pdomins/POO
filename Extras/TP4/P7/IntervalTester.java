package ar.itba.edu.TP4.P7;

public class IntervalTester {
    public static void main(String[] args){
        Interval interval = new Interval(1,10);
        System.out.println(interval.size());
        System.out.println(interval.indexOf(6.0));
        System.out.println(interval.at(5));
        System.out.println(interval);

    }
}
