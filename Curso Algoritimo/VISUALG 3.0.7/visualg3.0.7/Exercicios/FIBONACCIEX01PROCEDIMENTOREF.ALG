algoritmo "fibonacciex01Procedimentoref"
var
   i, t1, t2, t3: inteiro
funcao proxfibonacci(var n1, n2:inteiro): inteiro // passagem de parametro por referencia(var)
var
   n3: inteiro
inicio
      n3 <- n1 + n2
      n1 <- n2
      n2 <- n3
      retorne n3
fimfuncao
inicio
      t1 <- 0
      t2 <- 1
      para i <- 3 ate 10 faca
           t3 <- proxfibonacci(t1, t2)
           escreva(t3)
      fimpara
fimalgoritmo