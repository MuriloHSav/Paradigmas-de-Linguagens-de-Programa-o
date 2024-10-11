//8. Agregação Modele uma classe Empresa que agregue uma lista de objetos Empregado. Cada empregado deve ter atributos como nome, cargo, e salario
package main
import "fmt"

type Empregado struct {
	nome    string
	cargo   string
	salario float64
}

func NewEmpregado(nome, cargo string, salario float64) *Empregado {
	return &Empregado{nome: nome, cargo: cargo, salario: salario}
}

func (e *Empregado) Detalhes() string {
	return fmt.Sprintf("Nome: %s, Cargo: %s, Salário: R$%.2f", e.nome, e.cargo, e.salario)
}

type Empresa struct {
	nomeEmpresa string
	empregados  []*Empregado
}

func NewEmpresa(nomeEmpresa string) *Empresa {
	return &Empresa{nomeEmpresa: nomeEmpresa, empregados: []*Empregado{}}
}

func (e *Empresa) AdicionarEmpregado(empregado *Empregado) {
	e.empregados = append(e.empregados, empregado)
}

func (e *Empresa) ListarEmpregados() {
	fmt.Printf("Empregados na empresa %s:\n", e.nomeEmpresa)
	for _, empregado := range e.empregados {
		fmt.Println(empregado.Detalhes())
	}
}

func main() {
	empregado1 := NewEmpregado("Bruno", "Desenvolvedor", 9250)
	empregado2 := NewEmpregado("Vinicius", "Desenvolvedor", 7500)
	empregado3 := NewEmpregado("Yan", "Desenvolvedor", 3600)

	empresa := NewEmpresa("Softcom")

	empresa.AdicionarEmpregado(empregado1)
	empresa.AdicionarEmpregado(empregado2)
	empresa.AdicionarEmpregado(empregado3)

	empresa.ListarEmpregados()
}
