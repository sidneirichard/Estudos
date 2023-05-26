algoritmo "semnome"
var
   cont, a:inteiro
inicio
      escreval("de 1 a 10 [1]: ")
      escreval("de 10 a 1 [2]: ")
      escreval("cancelar  [3]: ")
      leia(a)
      escolha a
              caso 1
                   para cont de 1 ate 10 faca
                        escreva(cont,"..")
                   fimpara
              caso 2
                   para cont de 10 ate 1 passo -1 faca
                        escreva(cont,"..")
                   fimpara
              outrocaso
      fimescolha
fimalgoritmo