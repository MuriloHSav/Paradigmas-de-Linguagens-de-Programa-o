#4. Herança Crie uma classe base Animal com métodos como som. Derive classes como Cachorro e Gato que implementam o método som de maneiras diferentes.

class Animal:
    def __init__(self, nome):
        self.nome = nome


class Cachorro(Animal):
    def som(self):
        return f"{self.nome} faz: Au Au!"


class Gato(Animal):
    def som(self):
        return f"{self.nome} faz: Miau!"


cachorro = Cachorro("Steel")
gato = Gato("Amora")

print(cachorro.som())
print(gato.som())
