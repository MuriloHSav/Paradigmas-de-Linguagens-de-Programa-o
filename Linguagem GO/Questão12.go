//12. Sobrecarga de Operadores (Python) / Métodos de Conveniência (Java, Go) Em Python, sobrecarregue o operador + para somar dois objetos Produto baseados no preço. Em Java e Golang, crie métodos que permitam essa funcionalidade.

package main
import "fmt"

type Produto struct {
	nome  string
	preco float64
}

func (p Produto) Somar(outro Produto) Produto {
	return Produto{
		nome:  "Soma de " + p.nome + " e " + outro.nome,
		preco: p.preco + outro.preco,
	}
}

func main() {
	produto1 := Produto{"Nescau", 25.0}
	produto2 := Produto{"Nesquik", 60.0}

	produtoSoma := produto1.Somar(produto2)
	fmt.Printf("%s: R$%.2f\n", produtoSoma.nome, produtoSoma.preco)
}
