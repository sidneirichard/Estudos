from random import shuffle
n1 = input('Primeiro Aluno: ')
n2 = input('Segundo Aluno: ')
n3 = input('Terceiro Aluno: ')
n4 = input('Quarto Aluno: ')
lista = [n1, n2, n3, n4]  # cria uma lista com o número de parametros dentro dela 
shuffle(lista)
print('A ordem de apresentação será: ')
print(lista)
