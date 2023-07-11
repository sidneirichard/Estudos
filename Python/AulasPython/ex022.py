nome = str(input('Digite seu nome completo: ')).strip()  # strip elimina os espaços antes e dpois da string #
print('Analisando...')
print('Seu nome em maiúscula é {}'.format(nome.upper()))
print('Seu nome em minuscula é {}'.format(nome.lower()))
print('Seu nome tem ao todo {} letras'.format(len(nome)-nome.count(' ')))  # conta quantos espaços " (' ') " tem #
print('Seu primeiro nome tem {}'.format(nome.find(' ')))
