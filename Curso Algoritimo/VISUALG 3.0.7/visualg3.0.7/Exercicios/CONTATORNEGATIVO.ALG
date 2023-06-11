algoritmo "ContatorNegativo"
var
   n, c, neg :inteiro
inicio
      c <- 1
      neg <- 0
      repita
             escreva("Digite um numero: ")
             leia(n)
             se(n<0)entao
                neg <- neg+1
             FimSe
             c <- (c+1)
      ate(c>5)
      escreval("foram digitados um total de", neg," numeros negativos")
fimalgoritmo