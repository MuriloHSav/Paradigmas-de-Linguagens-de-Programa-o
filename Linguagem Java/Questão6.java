//6. Composição Implemente uma classe Motor e associe-a a uma classe Carro. A classe Carro deve ter um objeto do tipo Motor como um de seus atributos.

class Motor {
    private int cilindradas;
    private String tipoCombustivel;

    public Motor(int cilindradas, String tipoCombustivel) {
        this.cilindradas = cilindradas;
        this.tipoCombustivel = tipoCombustivel;
    }

    public String detalhesMotor() {
        return cilindradas + "cc, Combustível: " + tipoCombustivel;
    }
}

class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private Motor motor;

    public Carro(String marca, String modelo, int ano, Motor motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.motor = motor;
    }

    public String detalhes() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano + ", Motor: " + motor.detalhesMotor();
    }
}

public class Main {
    public static void main(String[] args) {
        Motor motorT = new Motor(2000, "Gasolina");
        Carro carroT = new Carro("Chevrolet", "Impala", 1967, motorT);
        System.out.println(carroT.detalhes());
    }
}
