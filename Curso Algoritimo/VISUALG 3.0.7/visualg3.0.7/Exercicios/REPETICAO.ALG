algoritmo "Repeticao"
var
   n, s : inteiro
   resp: caractere
inicio
      s <- 0
      repita
            escreva("Digite o valor: ")
            leia(n)
            s <- s+n
            escreva("Vc quer continuar?: [S/N]: ")
            leia(resp)
      ate (resp = "N") ou (resp = "n")
      escreval("A soma de todos os valores foi:", s)
fimalgoritmo