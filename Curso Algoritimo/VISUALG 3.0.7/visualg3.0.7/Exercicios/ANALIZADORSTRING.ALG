algoritmo "AnalizadorString"
var
   n: caractere
   c: inteiro
inicio
      escreva("Digite seu nome: ")
      leia(n)
      escreval("Total de letras no seu nome: ",compr(n))
      escreval("seu nome em maiusculo é: ",maiusc(n))
      escreval("seu nome em minusculo é:",minusc(n))
      escreval("a primeira letra do seu nome é:",copia(maiusc(n),1,1))
      escreval("a ultima letra do seu nome é: ",copia(maiusc(n), compr(n),1))
      escreval("seu nome tem a letra A na posição", pos("A", maiusc(n)))
      escreval("o codigo da letra A e", asc("A"))
      escreval("a letra de codigo 65 é ",carac (65))
      para c <- compr(n) ate 1 passo -1 faca
           escreva(copia(maiusc(n), c,1))
      fimpara
fimalgoritmo