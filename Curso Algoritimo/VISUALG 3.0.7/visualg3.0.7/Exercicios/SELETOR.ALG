algoritmo "Seletor"
var
   cor, c, castanho, preto, loiro, ruivo, r1, r2 : caractere
   idd, n, j, k, maior18, menor25 : inteiro
inicio
      repita
            escreva("qual seu sexo?: [F/M]: ")
            leia(r1)
            se (r1 = "m") entao
               escreva("qual a sua idade?: ")
               leia(idd)
               se (idd >= 18) entao
                   maior18 <- maior18 + 1
               fimse
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
            escreva("quer continuar? [S/N]: ")
            leia(r2)
      ate (r2 = "n") ou (r2 = "N")
      escreval("o numero de homens com mais de 18 anos é: ", maior18)
fimalgoritmo