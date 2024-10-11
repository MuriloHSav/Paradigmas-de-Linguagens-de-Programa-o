//2. Métodos Adicione um método acelerar e frear à classe Carro que altere um atributo velocidade. Crie um método para exibir a velocidade atual.


class CarroDois {
    private String marca;
    private String modelo;
    private int ano;
    private int velocidade;

    public CarroDois(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.velocidade = 0;
    }

    public String detalhes() {
        return "Marca: " + marca + ", Modelo: " + modelo + ", Ano: " + ano;
    }

    public String acelerar(int aumento) {
        velocidade += aumento;
        return marca + " " + modelo + " acelerou. Velocidade atual: " + velocidade + " km/h";
    }

    public String frear(int redução) {
        velocidade = Math.max(0, velocidade - redução);
        return marca + " " + modelo + " freou. Velocidade atual: " + velocidade + " km/h";
    }

    public String exibirVelocidade() {
        return "Velocidade atual " + marca + " " + modelo + ": " + velocidade + " km/h";
    }
}

public class Main {
    public static void main(String[] args) {
        CarroDois Carro = new CarroDois("Subaru", "Impreza", 1998);

        System.out.println(Carro.acelerar(50));
        System.out.println(Carro.frear(20));
        System.out.println(Carro.exibirVelocidade());
    }
}
