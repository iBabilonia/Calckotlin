/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Calcjava;

public class App {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println(calc.soma(10, 5));
        System.out.println(calc.sub(10, 5));
        System.out.println(calc.mult(10, 5));
        System.out.println(calc.div(10, 5));
    }
}
