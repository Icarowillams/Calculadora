package METODOS;

public class Calculadora {

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        int resultado1 = calc.somar(2, 3);
        System.out.println("2 + 3 = " + resultado1);

        int resultado2 = calc.somar(2, 3, 4, 8 );
        System.out.println("2 + 3 + 4 + 8 = " + resultado2);
    }
    
    int somar(int a, int b) {
        return a + b;
    }

    int somar(int a, int b, int c, int d) {
        return a + b + c + d;
    }
}