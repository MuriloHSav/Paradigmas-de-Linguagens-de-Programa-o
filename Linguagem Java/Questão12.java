//12. Sobrecarga de Operadores (Python) / Métodos de Conveniência (Java, Go) Em Python, sobrecarregue o operador + para somar dois objetos Produto baseados no preço. Em Java e Golang, crie métodos que permitam essa funcionalidade.


class Produto {
    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public Produto somar(Produto outro) {
        return new Produto("Soma de " + this.nome + " e " + outro.nome, this.preco + outro.preco);
    }

    @Override
    public String toString() {
        return String.format("%s: R$%.2f", nome, preco);
    }

    public static void main(String[] args) {
        Produto produto1 = new Produto("Nescau", 50.0);
        Produto produto2 = new Produto("Nesquick", 30.0);

        Produto produtoSoma = produto1.somar(produto2);
        System.out.println(produtoSoma);
    }
}
