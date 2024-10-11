//8. Agregação Modele uma classe Empresa que agregue uma lista de objetos Empregado. Cada empregado deve ter atributos como nome, cargo, e salario


import java.util.ArrayList;
import java.util.List;

class Empregado {
    private String nome;
    private String cargo;
    private double salario;

    public Empregado(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public String detalhes() {
        return String.format("Nome: %s, Cargo: %s, Salário: R$%.2f", nome, cargo, salario);
    }
}

class Empresa {
    private String nomeEmpresa;
    private List<Empregado> empregados;

    public Empresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
        this.empregados = new ArrayList<>();
    }

    public void adicionarEmpregado(Empregado empregado) {
        empregados.add(empregado);
    }

    public void listarEmpregados() {
        System.out.println("Empregados na empresa " + nomeEmpresa + ":");
        for (Empregado empregado : empregados) {
            System.out.println(empregado.detalhes());
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("Bruno", "Desenvolvedor", 9250);
        Empregado empregado2 = new Empregado("Felipe", "Desenvolvedor", 6000);
        Empregado empregado3 = new Empregado("Alex", "Desenvolvedor", 2000);

        Empresa empresa = new Empresa("Softcom");

        empresa.adicionarEmpregado(empregado1);
        empresa.adicionarEmpregado(empregado2);
        empresa.adicionarEmpregado(empregado3);

        empresa.listarEmpregados();
    }
}
