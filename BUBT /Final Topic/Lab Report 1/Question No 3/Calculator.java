public class NumberCheck{
    public static void main(String[] args){
        Calculator c1 =new Calculator();   
        Calculator c2 =new Calculator();     
        System.out.println("Addition of two integers: " + c1.add(4,6));
        System.out.println("Addition of three integers: " + c1.add(5,5, 5));
        System.out.println("Addition of two doubles: " + c1.add(5.0,5.5));}
}
class Calculator {
    int add(int a,int b) {
        return a+b;
    }
    int add(int a,int b,int c) {
        return a+b+c;
    }
    double add(double a, double b){
        return a+b;
    }}
