//5. Polimorfismo Utilize polimorfismo para criar uma função que receba uma lista de objetos Animal e chame o método som de cada um, demonstrando comportamento diferente para cada subclasse.

import java.util.ArrayList;
import java.util.List;

abstract class AnimalDois {
    protected String nome;

    public AnimalDois(String nome) {
        this.nome = nome;
    }

    public abstract String som();
}

class Cachorro extends AnimalDois {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String som() {
        return nome + " faz: Au Au!";
    }
}

class Gato extends AnimalDois {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String som() {
        return nome + " faz: Miau!";
    }
}

public class Main {
    public static void emitirSons(List<AnimalDois> animais) {
        for (AnimalDois animal : animais) {
            System.out.println(animal.som());
        }
    }

    public static void main(String[] args) {
        List<AnimalDois> animais = new ArrayList<>();
        animais.add(new Cachorro("Bolt"));
        animais.add(new Gato("Pantera"));
        animais.add(new Cachorro("Marley"));
        animais.add(new Gato("Simba"));

        emitirSons(animais);
    }
}
