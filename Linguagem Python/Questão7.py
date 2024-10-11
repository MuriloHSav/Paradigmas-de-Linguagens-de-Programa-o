#7. Associação Crie uma classe Escola e uma classe Professor. A associação deve permitir que uma escola tenha vários professores, e um professor possa lecionar em várias escolas.

class Professor:
    def __init__(self, nome):
        self.nome = nome
        self.escolas = []

    def addescola(self, escola):
        if escola not in self.escolas:
            self.escolas.append(escola)
            escola.addprofessor(self)

    def listar_escolas(self):
        return [escola.nome for escola in self.escolas]


class Escola:
    def __init__(self, nome):
        self.nome = nome
        self.professores = []

    def addprofessor(self, professor):
        if professor not in self.professores:
            self.professores.append(professor)
            professor.addescola(self)

    def listarprof(self):
        return [professor.nome for professor in self.professores]


professor_1 = Professor("Dr. Ricardo")
professor_2 = Professor("Prof. Tatyana")

escola_1 = Escola("Escola Sesi")
escola_2 = Escola("Escola Senhor do Bom Fim")

escola_1.addprofessor(professor_1)
escola_1.addprofessor(professor_2)
escola_2.addprofessor(professor_2)

print(f"Professores na {escola_1.nome}: {escola_1.listarprof()}")
print(f"Professores na {escola_2.nome}: {escola_2.listarprof()}")

print(f"Escolas onde {professor_1.nome} leciona: {professor_1.listar_escolas()}")
print(f"Escolas onde {professor_2.nome} leciona: {professor_2.listar_escolas()}")
