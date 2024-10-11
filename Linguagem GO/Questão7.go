//7. Associação Crie uma classe Escola e uma classe Professor. A associação deve permitir que uma escola tenha vários professores, e um professor possa lecionar em várias escolas.
package main
import "fmt"


type Professor struct {
	nome    string
	escolas []Escola
}

func NewProfessor(nome string) *Professor {
	return &Professor{nome: nome, escolas: []Escola{}}
}

func (p *Professor) addescola(escola *Escola) {
	for _, e := range p.escolas {
		if e.nome == escola.nome {
			return
		}
	}
	p.escolas = append(p.escolas, *escola)
	escola.addprofessor(p)
}

func (p *Professor) ListarEscolas() []string {
	nomes := []string{}
	for _, escola := range p.escolas {
		nomes = append(nomes, escola.nome)
	}
	return nomes
}

type Escola struct {
	nome      string
	professores []Professor
}

func NewEscola(nome string) *Escola {
	return &Escola{nome: nome, professores: []Professor{}}
}

func (e *Escola) addprofessor(professor *Professor) {
	for _, p := range e.professores {
		if p.nome == professor.nome {
			return
		}
	}
	e.professores = append(e.professores, *professor)
	professor.addescola(e)
}

func (e *Escola) ListarProfessores() []string {
	nomes := []string{}
	for _, professor := range e.professores {
		nomes = append(nomes, professor.nome)
	}
	return nomes
}

func main() {
	professor1 := NewProfessor("Dr. Ricardo")
	professor2 := NewProfessor("Prof. Tatyana")

	escola1 := NewEscola("Escola Sesi")
	escola2 := NewEscola("Escola Senhor do Bom Fim")

	escola1.addprofessor(professor1)
	escola1.addprofessor(professor2)
	escola2.addprofessor(professor2)

	fmt.Printf("Professores na %s: %v\n", escola1.nome, escola1.ListarProfessores())
	fmt.Printf("Professores na %s: %v\n", escola2.nome, escola2.ListarProfessores())
	fmt.Printf("Escolas onde %s leciona: %v\n", professor1.nome, professor1.ListarEscolas())
	fmt.Printf("Escolas onde %s leciona: %v\n", professor2.nome, professor2.ListarEscolas())
}
