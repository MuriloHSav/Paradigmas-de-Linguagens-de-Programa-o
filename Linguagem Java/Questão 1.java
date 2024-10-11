//Questão 1. Classes e Objetos Básicos Crie uma classe Carro com atributos como marca, modelo, e ano. Instancie três objetos dessa classe e exiba os detalhes de cada um.

class Carro {
    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String detalhes() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
    }
}

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Subaru", "Impreza", 1998);
        Carro carro2 = new Carro("Toyota", "Supra", 1993);
        Carro carro3 = new Carro("Chevrolet", "Impala", 1967);

        System.out.println(carro1.detalhes());
        System.out.println(carro2.detalhes());
        System.out.println(carro3.detalhes());
    }
}
