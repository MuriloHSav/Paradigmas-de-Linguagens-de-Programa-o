//5. Polimorfismo Utilize polimorfismo para criar uma função que receba uma lista de objetos Animal e chame o método som de cada um, demonstrando comportamento diferente para cada subclasse.

package main
import "fmt"

type Animal interface {
	Som() string
}

type Cachorro struct {
	nome string
}

func (c Cachorro) Som() string {
	return fmt.Sprintf("%s faz: Au Au!", c.nome)
}

type Gato struct {
	nome string
}

func (g Gato) Som() string {
	return fmt.Sprintf("%s faz: Miau!", g.nome)
}

func Som(animais []Animal) {
	for _, animal := range animais {
		fmt.Println(animal.Som())
	}
}

func main() {
	animais := []Animal{
		Cachorro{"Bolt"},
		Gato{"Pantera"},
		Cachorro{"Marley"},
		Gato{"Simba"},
	}
	Som(animais)
}
