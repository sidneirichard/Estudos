n = input('Digite algo: ')
print('O tipo primitivo desse valor é', type(n))
print('Contém apenas espaços?', n.isspace())
print('É um número?', n.isnumeric())
print('É alfabético?', n.isalpha())
print('É minúsculo?', n.islower())
print('É maiúscula?', n.isupper())
print('Está capitalizada?', n.istitle())
