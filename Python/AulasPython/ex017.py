import math # para importar toda a biblioteca 'math' import from para importar otimizadamente
co = float(input('Comprimento do cateto oposto: '))
ca = float(input('Comprimento do cateto adjacente: '))
hip = math.hypot(co, ca)
print('A hipotenusa vai medir {:.2f}'.format(hip))
