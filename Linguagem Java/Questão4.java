//4. Herança Crie uma classe base Animal com métodos como som. Derive classes como Cachorro e Gato que implementam o método som de maneiras diferentes.


abstract class AnimalUm {
    protected String nome;

    public AnimalUm(String nome) {
        this.nome = nome;
    }

    public abstract String som();
}

class Cachorro extends AnimalUm {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String som() {
        return nome + " faz: Au Au!";
    }
}

class Gato extends AnimalUm {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String som() {
        return nome + " faz: Miau!";
    }
}

public class Main {
    public static void main(String[] args) {
        AnimalUm cachorro = new Cachorro("Steel");
        AnimalUm gato = new Gato("Amora");

        System.out.println(cachorro.som());
        System.out.println(gato.som());
    }
}
