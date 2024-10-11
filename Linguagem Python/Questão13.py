#13. Métodos Estáticos Adicione um método estático à classe Matematica que calcula o fatorial de um número. Em Python, utilize @staticmethod, em Java static, e em Golang crie uma função regular na struct.


class Matematica:
    @staticmethod
    def fatorial(n):
        if n < 0:
            raise ValueError("O fatorial não está definido para negativos.")
        elif n == 0 or n == 1:
            return 1
        else:
            resultado = 1
            for i in range(2, n + 1):
                resultado *= i
            return resultado


def main():
    numero = 5
    print(f"O fatorial de {numero} é {Matematica.fatorial(numero)}")

if __name__ == "__main__":
    main()
