algoritmo "cont1a10e10a1"
var
   cont, a:inteiro
inicio
      escreval("de 1 a 10 [1]: ")
      escreval("de 10 a 1 [2]: ")
      escreval("cancelar  [3]: ")
      leia(a)
      se a = 1 entao
         cont <- 1
         enquanto cont<=10 faca
                  escreva(cont,"..")
                  cont<-cont+1
         fimenquanto
      fimse
      se a = 2 entao
         cont<-10
         enquanto cont>=1 faca
                  escreva(cont,"..")
                  cont<-cont-1
         fimenquanto
      fimse
fimalgoritmo