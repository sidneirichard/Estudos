preço = float(input('Preço do produto: R$'))
desc = preço - (preço * 5 / 100)
print('Preço do produto R${}, na promoção com 5% de desconto, vai custar R${:.2f}'.format(preço, desc))
