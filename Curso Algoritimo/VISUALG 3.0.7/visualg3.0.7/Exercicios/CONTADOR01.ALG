algoritmo "contador01"
var
   cont, n, s, maior, menor: inteiro
inicio
      cont <- 1
      s <- 0
      enquanto (cont <= 5)faca
          escreva("digite o: ", cont, "o. valor: ")
          leia(n)
          se (n > maior) entao
             maior <- n
          senao
               se (n < menor) entao
               senao
                    menor <- n
               FimSe
          FimSe
          s <- s+n
          cont <- cont+1
      fimenquanto
      escreval("A soma de todos os valores foi: ", s)
      escreval("O maior valor digitado foi", maior)
      escreval("O menor valor digitado foi", menor)
fimalgoritmo