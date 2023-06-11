dias = int(input('Quantos dias alugados?: '))
km = float(input('Km percorridos: '))
pago = (dias * 60) + (km * 0.15)
print('Total a pagar R${:.2f}'.format(pago))
