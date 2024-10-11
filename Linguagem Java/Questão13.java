//13. Métodos Estáticos Adicione um método estático à classe Matematica que calcula o fatorial de um número. Em Python, utilize @staticmethod, em Java static, e em Golang crie uma função regular na struct.


class Matematica {
    public static long fatorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("O fatorial não está definido para negativos.");
        }
        long resultado = 1;
        for (int i = 2; i <= n; i++) {
            resultado *= i;
        }
        return resultado;
    }

    public static void main(String[] args) {
        int numero = 5;
        System.out.println("O fatorial de " + numero + " é " + Matematica.fatorial(numero));
    }
}
