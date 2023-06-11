algoritmo "imcnest01"
var
   a, m, imc :real
inicio
      escreva("Massa em (Kg): ")
      leia(m)
      escreva("Altura em (M): ")
      leia(a)
      imc <- m / (a^2)
      escreval("IMC: ",imc:5:2)
      se (imc < 17)entao
         escreval("mto abaixo do peso.")
      senao
           se (imc >= 17) e (imc < 18.5)entao
              escreval("abaixo do peso")
           senao
                se (imc >= 18.5) e (imc < 25)entao
                   escreval("peso ideal.")
                senao
                     se (imc >= 25) e (imc < 30)entao
                        escreval("sobrepeso.")
                     senao
                          se (imc >= 30) e (imc < 35)entao
                             escreval("Obesidade.")
                             senao
                                  se (imc >= 35) e (imc < 40)entao
                                     escreval("Obesidade Severa.")
                                  senao
                                       escreval("Obesidade morbida")
                                  FimSe
                             FimSe
                          FimSe
                     FimSe
                FimSe
            FimSe
fimalgoritmo