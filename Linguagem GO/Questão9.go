//9. Interfaces/Protocolos Em Java e Golang, defina uma interface para imprimível que tenha um método imprimir. Implemente essa interface em classes como Relatório e Contrato. Em Python, use a abordagem de protocolo ou classes abstratas.

package main
import (
	"fmt"
)

type Imprimivel interface {
	Imprimir()
}

type Relatorio struct{}

func (r Relatorio) Imprimir() {
	fmt.Println("Realizando Impressão.")
}

type Contrato struct{}

func (c Contrato) Imprimir() {
	fmt.Println("Realizando Impressão.")
}

func main() {
	var relatorio Imprimivel = Relatorio{}
	var contrato Imprimivel = Contrato{}
	relatorio.Imprimir()
	contrato.Imprimir()
}
