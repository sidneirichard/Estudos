algoritmo "fibonacciex01"
var
   f1, f2, f3, n: inteiro
inicio
      f1 <- 0
      f2 <- 1
      para n <- 3 ate 15 faca
           f3 <- f1+f2
           escreva(f3)
           f1 <- f2
           f2 <- f3
      fimpara
fimalgoritmo