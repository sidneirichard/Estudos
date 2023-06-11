algoritmo "criancaesperanca"
var
   d : inteiro
   valor : real
inicio
      escreval("=========================")
      escreval("    CRIANÇA ESPERANÇA    ")
      escreval("=========================")
      escreval("Muito Obrigado por ajudar!")
      escreval(" [1]Para doar R$ 10 ")
      escreval(" [2]Para doar R$ 20 ")
      escreval(" [3]Para doar R$ 30 ")
      escreval(" [4]Para doar outro valor ")
      escreval(" [5]Para cancelar")
      leia(d)
      escolha d
              caso 1
                   valor <- 10
                   escreval("=========================")
                   escreval("SUA DOAÇÃO FOI DE R$: ", valor:5:2)
                   escreval("**** MUITO OBRIGADO! ****")
                   escreval("=========================")
              caso 2
                   valor <- 20
                   escreval("=========================")
                   escreval("SUA DOAÇÃO FOI DE R$: ", valor:5:2)
                   escreval("**** MUITO OBRIGADO! ****")
                   escreval("=========================")
              caso 3
                   valor <- 30
                   escreval("=========================")
                   escreval("SUA DOAÇÃO FOI DE R$: ", valor:5:2)
                   escreval("**** MUITO OBRIGADO! ****")
                   escreval("=========================")
              caso 4
                   escreva("Qual o valor da doação?: R$ ")
                   leia (valor)
                   escreval("=========================")
                   escreval("SUA DOAÇÃO FOI DE R$: ", valor:5:2)
                   escreval("**** MUITO OBRIGADO! ****")
                   escreval("=========================")
              caso 5
                   escreval("SUA DOAÇÃO FOI CANCELADA.")
                   valor <- 0
      FimEscolha
fimalgoritmo