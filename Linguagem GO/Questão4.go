//4. Herança Crie uma classe base Animal com métodos como som. Derive classes como Cachorro e Gato que implementam o método som de maneiras diferentes.
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

func main() {
	var cachorro Animal = Cachorro{"Steel"}
	var gato Animal = Gato{"Amora"}

	fmt.Println(cachorro.Som())
	fmt.Println(gato.Som())
}