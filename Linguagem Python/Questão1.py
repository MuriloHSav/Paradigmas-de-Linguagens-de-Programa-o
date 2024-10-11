#Questão 1. Classes e Objetos Básicos Crie uma classe Carro com atributos como marca, modelo, e ano. Instancie três objetos dessa classe e exiba os detalhes de cada um.


class Carro:
    def __init__(self, marca, modelo, ano):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano

    def detalhes(self):
        return f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}"

carro1 = Carro("Subaru", "Impreza", 1998)
carro2 = Carro("Toyota", "Supra", 1993)
carro3 = Carro("Chevrolet", "Impala", 1967)

print(carro1.detalhes())
print(carro2.detalhes())
print(carro3.detalhes())
