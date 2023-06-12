/* Crie uma classe "vovoh" que tenha um metodo construtor
Nathaly Ambrosio
11/06/2023
 */
class Vovoh:
    def __init__(self, nome, idade):
        self.nome = nome
        self.idade = idade

    def saudacao(self):
        """Realiza a saudação da Vovoh"""
        print(f"Olá, sou a Vovoh {self.nome} e tenho {self.idade} anos!")

