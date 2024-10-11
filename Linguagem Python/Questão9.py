#9. Interfaces/Protocolos Em Java e Golang, defina uma interface para imprimível que tenha um método imprimir. Implemente essa interface em classes como Relatório e Contrato. Em Python, use a abordagem de protocolo ou classes abstratas.

from abc import ABC, abstractmethod

class Imprimivel(ABC):
    @abstractmethod
    def imprimir(self):
        pass

class Relatorio(Imprimivel):
    def imprimir(self):
        print("Realizando Impressão.")

class Contrato(Imprimivel):
    def imprimir(self):
        print("Realizando Impressão.")

def main():
    relatorio = Relatorio()
    contrato = Contrato()
    relatorio.imprimir()
    contrato.imprimir()

if __name__ == "__main__":
    main()
