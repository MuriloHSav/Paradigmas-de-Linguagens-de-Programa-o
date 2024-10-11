#5. Polimorfismo Utilize polimorfismo para criar uma função que receba uma lista de objetos Animal e chame o método som de cada um, demonstrando comportamento diferente para cada subclasse.

class Animal:
    def __init__(self, nome):
        self.nome = nome


class Cachorro(Animal):
    def som(self):
        return f"{self.nome} faz: Au Au!"


class Gato(Animal):
    def som(self):
        return f"{self.nome} faz: Miau!"


def emitir_sons(animais):
    for animal in animais:
        print(animal.som())


animais = [Cachorro("Bolt"), Gato("Pantera"), Cachorro("Marley"), Gato("Simba")]

emitir_sons(animais)
