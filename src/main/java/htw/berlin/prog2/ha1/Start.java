package htw.berlin.prog2.ha1;

public class Start {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.pressEqualsKey();
        System.out.println(calc.readScreen());
    }
}
