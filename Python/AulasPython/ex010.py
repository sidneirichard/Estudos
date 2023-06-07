real = float(input('Quanto dinheiro você tem na carteira? R$: '))
dolar = real / 4.93
euro = real / 5.27
print('Com R${:.2f} consigo comprar US${:.2f}'.format(real, dolar))
print('Com R${:.2f} consigo comprar €{:.2f}'.format(real, euro))
