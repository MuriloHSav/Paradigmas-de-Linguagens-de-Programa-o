//10. Sobrecarga de Métodos (Java) / Métodos com Nomes Diferentes (Python, Go)Implemente uma classe Calculadora com métodos somar que aceita diferentes números de parâmetros (dois ou três números). Em Golang, use funções com nomes diferentes para diferentes quantidades de parâmetros.

package main
import "fmt"

func somarDois(a int, b int) int {
	return a + b
}

func somarTres(a int, b int, c int) int {
	return a + b + c
}

func main() {
	fmt.Println("Soma de 5 e 10:", somarDois(5, 10))
	fmt.Println("Soma de 5, 10 e 15:", somarTres(5, 10, 15))
}
