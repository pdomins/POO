package ar.itba.edu.TP3;

public class Tester {
    static public void main(String[] args){
        ComplexNumber number1 = new ComplexNumber(1);
        ComplexNumber number2 = new ComplexNumber(1,2);

        ArithmeticExp plus =  ArithmeticExp.valueOf("ADD");
        ArithmeticExp minus = ArithmeticExp.valueOf("SUBSTRACT");
        System.out.println(plus.apply(number1.getReal(),number2.getReal()));
        System.out.println(minus.apply(number1.getReal(),number2.getReal()));
    }
}
