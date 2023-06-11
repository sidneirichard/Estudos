algoritmo "Fatorial01"
var
   c, n, f: inteiro
   r: caractere
inicio
      repita
               escreva("Escreva um numero: ")
               leia(n)
               c <- n
               f <- 1
               repita
                     f <- f*c
                     c <- c-1
               ate(c<1)
               escreval("O valor do fatorial de", n, "e igual a", f)
               escreva("Quer continuar?: [S/N]")
               leia(r)
      ate(r = "N")ou(r = "n")
      LimpaTela
fimalgoritmo