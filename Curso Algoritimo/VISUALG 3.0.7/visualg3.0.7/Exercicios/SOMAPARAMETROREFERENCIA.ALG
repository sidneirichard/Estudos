algoritmo "SomaParametroReferencia"
var
   x, y: inteiro
procedimento soma(var a, b: inteiro) // var transforma valores em referencias aula 12
inicio
      a <- a+1
      b <- b+2
      escreval("Valor de A é =", a)
      escreval("Valor de B é =", b)
      escreval("A soma de A + B é", a+b)
fimprocedimento
inicio
      x <- 4
      y <- 8
      soma (x,y)
      escreval("Valor de X é =", x)
      escreval("Valor de Y é =", y)
fimalgoritmo