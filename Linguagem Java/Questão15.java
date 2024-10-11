class SaldoInsuficiente extends Exception {
    public SaldoInsuficiente(String mensagem) {
        super(mensagem);
    }
}

class ContaBancaria {
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) throws IllegalArgumentException {
        if (valor <= 0) {
            throw new IllegalArgumentException("O valor do depósito deve ser positivo.");
        }
        saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficiente {
        if (valor > saldo) {
            throw new SaldoInsuficiente("Saldo insuficiente.");
        }
        saldo -= valor;
    }

    public double obterSaldo() {
        return saldo;
    }
}

public class Main {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria("Tommy", 100);

        try {
            conta.sacar(150);
        } catch (SaldoInsuficiente e) {
            System.out.println(e.getMessage());
        }
    }
}
