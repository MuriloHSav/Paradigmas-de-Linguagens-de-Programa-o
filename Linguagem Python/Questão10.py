#10. Sobrecarga de Métodos (Java) / Métodos com Nomes Diferentes (Python, Go)Implemente uma classe Calculadora com métodos somar que aceita diferentes números de parâmetros (dois ou três números). Em Golang, use funções com nomes diferentes para diferentes quantidades de parâmetros.


class Calculadora:
    def somar_dois(self, a, b):
        return a + b
    def somar_tres(self, a, b, c):
        return a + b + c


def main():
    calc = Calculadora()

    print("Soma de 5 e 10:", calc.somar_dois(5, 10))
    print("Soma de 5, 10 e 15:", calc.somar_tres(5, 10, 15))


if __name__ == "__main__":
    main()
