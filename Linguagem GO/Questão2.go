//2. Métodos Adicione um método acelerar e frear à classe Carro que altere um atributo velocidade. Crie um método para exibir a velocidade atual.

package main
import (
	"fmt"
)


type Carro struct {
	marca string
	modelo string
	ano int
	velocidade int
}


func (c Carro) detalhes() string {
	return fmt.Sprintf("Marca: %s, Modelo: %s, Ano: %d", c.marca, c.modelo, c.ano)
}


func (c *Carro) acelerar(aumento int) string {
	c.velocidade += aumento
	return fmt.Sprintf("%s %s acelerou. Velocidade atual: %d km/h", c.marca, c.modelo, c.velocidade)
}


func (c *Carro) frear(redução int) string {
	if redução > c.velocidade {
		c.velocidade = 0
	} else {
		c.velocidade -= redução
	}
	return fmt.Sprintf("%s %s freou. Velocidade atual: %d km/h", c.marca, c.modelo, c.velocidade)
}


func (c Carro) exibirVelocidade() string {
	return fmt.Sprintf("Velocidade atual do %s %s: %d km/h", c.marca, c.modelo, c.velocidade)
}


func main() {
	carroTeste := Carro{"Subaru", "Impreza", 1998}

	fmt.Println(carroTeste.acelerar(50))
	fmt.Println(carroTeste.frear(20))
	fmt.Println(carroTeste.exibirVelocidade())
}
