algoritmo "procedimentopareimpar"
var
   n: inteiro
procedimento ParOuImpar(v: inteiro)
inicio
      escreval("O valor de V é", v)
      escreval("O valor de N é", n)
      se (v%2=0) entao // % resto divisao = 0 par  % resto divisao = 1 impar
         escreval("O numero", v," é PAR.")
      senao
           escreval("O numero", v," é IMPAR.")
      fimse
fimprocedimento
inicio
      escreva("Digite um numero: ")
      leia(n)
      ParOuImpar(n)
fimalgoritmo