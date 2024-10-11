//10. Sobrecarga de Métodos (Java) / Métodos com Nomes Diferentes (Python, Go)Implemente uma classe Calculadora com métodos somar que aceita diferentes números de parâmetros (dois ou três números). Em Golang, use funções com nomes diferentes para diferentes quantidades de parâmetros.


class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    public int somar(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Soma de 5 e 10: " + calc.somar(5, 10));
        System.out.println("Soma de 5, 10 e 15: " + calc.somar(5, 10, 15));
    }
}
