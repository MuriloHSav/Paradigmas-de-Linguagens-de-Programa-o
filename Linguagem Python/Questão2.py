#2. Métodos Adicione um método acelerar e frear à classe Carro que altere um atributo velocidade. Crie um método para exibir a velocidade atual.


class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.velocidade = 0

    def detalhes(self):
        return f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}"

    def acelerar(self, aumento):
        self.velocidade += aumento
        return f"{self.marca} {self.modelo} acelerou. Velocidade atual: {self.velocidade} km/h"

    def frear(self, redução):
        self.velocidade = max(0, self.velocidade - redução)
        return f"{self.marca} {self.modelo} freou. Velocidade atual: {self.velocidade} km/h"

    def exibir_velocidade(self):
        return f"Velocidade atual do {self.marca} {self.modelo}: {self.velocidade} km/h"


carro_teste = Carro("Subaru", "Impreza", 1998)

print(carro_teste.acelerar(50))
print(carro_teste.frear(20))
print(carro_teste.exibir_velocidade())