#6. Composição Implemente uma classe Motor e associe-a a uma classe Carro. A classe Carro deve ter um objeto do tipo Motor como um de seus atributos.


class Motor:
    def __init__(self, cilindradas, tipo_combustivel):
        self.cilindradas = cilindradas
        self.tipo_combustivel = tipo_combustivel

    def detalhes_motor(self):
        return f"Motor: {self.cilindradas}cc, Combustível: {self.tipo_combustivel}"


class Carro:
    def __init__(self, marca, modelo, ano, motor):
        self.marca = marca
        self.modelo = modelo
        self.ano = ano
        self.motor = motor

    def detalhes(self):
        return f"Marca: {self.marca}, Modelo: {self.modelo}, Ano: {self.ano}, {self.motor.detalhes_motor()}"


motorT = Motor(1700, "Gasolina")

carro_teste = Carro("Chevrolet", "Impala", 1967, motorT)

print(carro_teste.detalhes())
