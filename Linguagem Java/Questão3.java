//3. Encapsulamento Implemente uma classe ContaBancaria com atributos saldo, titular e métodos depositar e sacar. Use encapsulamento para proteger o atributo saldo.


class ContaBancaria {
    private double saldo;
    public String titular;

    public ContaBancaria(String titular, double saldoInicial) {
        this.saldo = saldoInicial;
        this.titular = titular;
    }

    public String depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            return String.format("Depósito de R$%.2f realizado. Saldo atual: R$%.2f", valor, saldo);
        } else {
            return "Valor de depósito inválido!";
        }
    }

    public String sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return String.format("Saque de R$%.2f realizado. Saldo atual: R$%.2f", valor, saldo);
        } else {
            return "Saldo insuficiente ou valor de saque inválido!";
        }
    }

    public String exibirSaldo() {
        return String.format("Saldo atual de %s: R$%.2f", titular, saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria contatemp = new ContaBancaria("Michael", 1000);
        System.out.println(contatemp.depositar(500));
        System.out.println(contatemp.sacar(300));
        System.out.println(contatemp.exibirSaldo());
    }
}
