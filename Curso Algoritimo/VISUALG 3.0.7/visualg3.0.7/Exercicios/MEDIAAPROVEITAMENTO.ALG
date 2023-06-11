Algoritmo "MediaAproveitamento"
Var
   n1, n2, m: real
Inicio
           escrevaL("==========================")
           escreval("     ESCOLA DO SIDAOO     ")
           escreval("==========================")
           escreva(" Primeira Nota: ")
           leia(n1)
           escreva(" Segunda Nota: ")
           leia(n2)
           m <- (n1+n2)/2
           se(m>=8)e(m<10)entao
              escreval("==========================")
              escreval(" Media: ", m:3:2)
              escreval(" Aproveitamento: A")
              escreval("==========================")
           senao
                se(m>=5)e(m<7)entao
                   escreval("==========================")
                   escreval(" Media: ", m:3:2)
                   escreval(" Aproveitamento: B")
                   escreval("==========================")
                FimSe
                     se(m>=3.5)e(m<5)entao
                        escreval("==========================")
                        escreval(" Media: ", m:3:2)
                        escreval(" Aproveitamento: C")
                        escreval("==========================")
                     senao
                     FimSe
                          se(m>=2.5)e(m<4)entao
                             escreval("==========================")
                             escreval(" Media: ", m:3:2)
                             escreval(" Aproveitamento: D")
                             escreval("==========================")
                          FimSe
                               se(m>=2)e(m<3)entao
                                  escreval("==========================")
                                  escreval(" Media: ", m:3:2)
                                  escreval(" Aproveitamento: E")
                                  escreval("==========================")
                               senao
                               FimSe
                                    se(m>=1)e(m<2)entao
                                       escreval("==========================")
                                       escreval(" Media: ", m:3:2)
                                       escreval(" Aproveitamento: F")
                                       escreval("==========================")
                                    FimSe
                             
         FimSe
Fimalgoritmo