algoritmo "Seletor"
var
   cor, c, castanho, preto, loiro, ruivo, r1, r2 : caractere
   idd, n: inteiro
inicio
      repita
            escreva("qual seu sexo?: [F/M] ")
            leia(r1)
            se (r1 = "f") ou (r1 = "m") ou (r1 = "F") ou (r1 = "M") entao
               escreva("qual a sua idade? ")
               leia(idd)
               idd <- n
            fimse
            escreval("qual a cor do seu cabelo?: ")
            escreval("[1] Castanho")
            escreval("[2] Preto   ")
            escreval("[3] Loiro   ")
            escreval("[4] Ruivo   ")
            leia(cor)
            escolha cor
                    caso cor
                    c <- castanho
                    caso cor
                    c <- preto
                    caso cor
                    c <- loiro
                    caso cor
                    c <- ruivo
                    outrocaso
            fimescolha
            escreva("quer continuar? [S/N]")
            leia(r2)
      ate (r2 = "n") ou (r2 = "N")
fimalgoritmo