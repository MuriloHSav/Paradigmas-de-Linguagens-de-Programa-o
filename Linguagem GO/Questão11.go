//11. Classes Abstratas Crie uma classe abstrata Funcionario com um método abstrato calcularSalario. Derive classes como FuncionarioHoras e FuncionarioAssalariado que implementam calcularSalario de formas distintas.

package main
import "fmt"

type Funcionario interface {
	CalcularSalario() float64
}

type FuncionarioHoras struct {
	nome            string
	valorHora       float64
	horasTrabalhadas int
}

func (f FuncionarioHoras) CalcularSalario() float64 {
	return f.valorHora * float64(f.horasTrabalhadas)
}

type FuncionarioAssalariado struct {
	nome          string
	salarioMensal float64
}

func (f FuncionarioAssalariado) CalcularSalario() float64 {
	return f.salarioMensal
}

func main() {
	Horas := FuncionarioHoras{"Yan", 23.0, 160}
	assalariado := FuncionarioAssalariado{"Alex", 2240.0}

	fmt.Printf("%s - Salário: R$%.2f\n", Horas.nome, Horas.CalcularSalario())
	fmt.Printf("%s - Salário: R$%.2f\n", assalariado.nome, assalariado.CalcularSalario())
}
