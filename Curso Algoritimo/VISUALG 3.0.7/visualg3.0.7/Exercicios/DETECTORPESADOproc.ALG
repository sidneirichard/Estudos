algoritmo "DetectorPesadoProc"
var
   i : inteiro
   nome, pesado :caractere
   peso, mai : real
procedimento topo()
inicio
      limpatela
      escreval("------------------------------------")
      escreval(" D E T E C T O R  D E  P E S A D O  ")
      escreval("Maior peso até agora: ", mai, " Kg: ")
      escreval("------------------------------------")
fimprocedimento
inicio
      topo()
      para i <- 1 ate 5 faca
           escreva("Digite o nome: ")
           leia(nome)
           escreva("Digite o peso de ", nome, ": ")
           leia(peso)
           se (peso>mai) entao
              mai <- peso
              pesado <- nome
           fimse
           topo()
      fimpara
      topo()
      escreval("A pessoa mais pesada foi", pesado,", com", mai," quilos.")
fimalgoritmo