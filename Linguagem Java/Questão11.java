//11. Classes Abstratas Crie uma classe abstrata Funcionario com um método abstrato calcularSalario. Derive classes como FuncionarioHoras e FuncionarioAssalariado que implementam calcularSalario de formas distintas.


abstract class Funcionario {
    protected String nome;
    public Funcionario(String nome) {
        this.nome = nome;
    }

    public abstract double calcularSalario();
}

class FuncHORA extends Funcionario {
    private double valorHora;
    private int horasTrabalhadas;

    public FuncHORA(String nome, double valorHora, int horasTrabalhadas) {
        super(nome);
        this.valorHora = valorHora;
        this.horasTrabalhadas = horasTrabalhadas;
    }

    @Override
    public double calcularSalario() {
        return valorHora * horasTrabalhadas;
    }
}

class FuncionarioAssalariado extends Funcionario {
    private double salarioMensal;

    public FuncionarioAssalariado(String nome, double salarioMensal) {
        super(nome);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }
}

public class Main {
    public static void main(String[] args) {
        Funcionario horista = new FuncHORA("Pedro", 23.0, 160);
        Funcionario assalariado = new FuncionarioAssalariado("Samuel", 1324.0);

        System.out.println(horista.nome + " - Salário: R$" + horista.calcularSalario());
        System.out.println(assalariado.nome + " - Salário: R$" + assalariado.calcularSalario());
    }
}
