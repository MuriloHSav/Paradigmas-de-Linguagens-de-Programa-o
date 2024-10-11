//9. Interfaces/Protocolos Em Java e Golang, defina uma interface para imprimível que tenha um método imprimir. Implemente essa interface em classes como Relatório e Contrato. Em Python, use a abordagem de protocolo ou classes abstratas.

interface Imprimivel {
    void imprimir();
}

class Relatorio implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("Realizando a Impressão.");
    }
}

class Contrato implements Imprimivel {
    @Override
    public void imprimir() {
        System.out.println("Realizando a Impressão.");
    }
}

public class Main {
    public static void main(String[] args) {
        Imprimivel relatorio = new Relatorio();
        Imprimivel contrato = new Contrato();

        relatorio.imprimir();
        contrato.imprimir();
    }
}
