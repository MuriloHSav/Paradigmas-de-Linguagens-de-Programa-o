#11. Classes Abstratas Crie uma classe abstrata Funcionario com um método abstrato calcularSalario. Derive classes como FuncionarioHoras e FuncionarioAssalariado que implementam calcularSalario de formas distintas.


from abc import ABC, abstractmethod

class Funcionario(ABC):
    def __init__(self, nome):
        self.nome = nome

    @abstractmethod
    def calcular_salario(self):
        pass

class FuncHoras(Funcionario):
    def __init__(self, nome, valor_hora, horas_trabalhadas):
        super().__init__(nome)
        self.valor_hora = valor_hora
        self.horas_trabalhadas = horas_trabalhadas

    def calcular_salario(self):
        return self.valor_hora * self.horas_trabalhadas

class FuncionarioAssalariado(Funcionario):
    def __init__(self, nome, salario_mensal):
        super().__init__(nome)
        self.salario_mensal = salario_mensal

    def calcular_salario(self):
        return self.salario_mensal

def main():
    horista = FuncHoras("Sarah", 23.0, 160)
    assalariado = FuncionarioAssalariado("Rodrigo", 2240.0)

    print(f"{horista.nome} - Salário: R${horista.calcular_salario():.2f}")
    print(f"{assalariado.nome} - Salário: R${assalariado.calcular_salario():.2f}")

if __name__ == "__main__":
    main()
