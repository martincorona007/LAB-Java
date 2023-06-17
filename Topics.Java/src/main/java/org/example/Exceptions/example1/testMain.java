package org.example.Exceptions.example1;

class MyCalculatorCore{
    class NoToBeZero extends Exception{
        @Override
        public String toString() {

            return "java.lang.Exception: n and p should not be zero.";
        }
    }
    class NoToBeNegative extends Exception{
        @Override
        public String toString() {
            return "java.lang.Exception: n or p should not be negative.";
        }
    }
    public long power(int n , int p ) throws Exception{
        if( n == 0 && p == 0){
            throw new NoToBeZero();
        }else if(n < 0 || p < 0){
            throw new NoToBeNegative();
        }else{
            return (long) Math.pow(n,p);
        }
    }
}
class MyCalculator{
    long power(int a,int b) throws Exception{
        if( a == 0 && b == 0){
            throw new Exception("n and p should not be zero.");
        }else if(a < 0 || b < 0){
            throw new Exception("n or p should not be negative");
        }else{
            return (long) Math.pow(a,b);
        }
    }
}
public class testMain {
    public static void main(String[] args) throws Exception {
        MyCalculator obj1 = new MyCalculator();
        System.out.println(obj1.power(1,-34));
        MyCalculatorCore obj2 = new MyCalculatorCore();
        System.out.println(obj2.power(1,-0));
    }
}
