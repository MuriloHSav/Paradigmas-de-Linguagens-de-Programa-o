//Questão 1. Classes e Objetos Básicos Crie uma classe Carro com atributos como marca, modelo, e ano. Instancie três objetos dessa classe e exiba os detalhes de cada um.

package main

import (
	"fmt"
)

type Carro struct {
	marca  string
	modelo string
	ano    int
}

func (c Carro) detalhes() string {
	return fmt.Sprintf("Marca: %s, Modelo: %s, Ano: %d", c.marca, c.modelo, c.ano)
}

func main() {
	carro1 := Carro{"Subaru", "Impreza", 1998}
	carro2 := Carro{"Toyota", "Supra", 1993}
	carro3 := Carro{"Chevrolet", "Impala", 1967}

	fmt.Println(carro1.detalhes())
	fmt.Println(carro2.detalhes())
	fmt.Println(carro3.detalhes())
}
