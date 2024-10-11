//6. Composição Implemente uma classe Motor e associe-a a uma classe Carro. A classe Carro deve ter um objeto do tipo Motor como um de seus atributos.

package main

import "fmt"

type Motor struct {
	cilindradas     int
	tipoCombustivel string
}

func (m Motor) DetalhesMotor() string {
	return fmt.Sprintf("%dcc, Combustível: %s", m.cilindradas, m.tipoCombustivel)
}

type Carro struct {
	marca  string
	modelo string
	ano    int
	motor  Motor
}

func (c Carro) Detalhes() string {
	return fmt.Sprintf("Marca: %s, Modelo: %s, Ano: %d, Motor: %s", c.marca, c.modelo, c.ano, c.motor.DetalhesMotor())
}

func main() {
	motorTeste := Motor{1700, "Gasolina"}
	carroTeste := Carro{"Chevrolet", "Impala", 1967, motorT}
	fmt.Println(carroTeste.Detalhes())
}
