algoritmo "NumeroPrimo"
var
   c ,n, contdiv: inteiro
inicio
      c <- 1
      contdiv <- 0
      escreva("Digite um numero: ")
      leia(n)
      repita
         se(n % c = 0)entao
            contdiv <- contdiv+1
         FimSe
         c <- c+1
      ate(c>n)
      se(contdiv > 2)entao
         escreval(" o valor" , n, " n é primo")
      senao
      escreval(" o valor" , n, " é primo")
      FimSe
fimalgoritmo