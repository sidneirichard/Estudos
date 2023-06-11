algoritmo "salarioedependentes"
var
   nome : caractere
   sal, nsal : real
   dep : inteiro
inicio
      escreva ("Nome do funcionario: ")
      leia(nome)
      escreva ("Salario do funcionario: R$")
      leia(sal)
      escreva ("Quantidade de dependentes: ")
      leia(dep)
      escolha dep
              caso 0
                   nsal <- sal +(sal*5/100)
              caso 1, 2, 3
                   nsal <- sal +(sal*10/100)
              caso 4, 5, 6
                   nsal <- sal +(sal*15/100)
              outrocaso
                   nsal <- sal+(sal*20/100)
      FimEscolha
      escreval("O novo salario é de ", nome, " será de R$: ", nsal:5:2)

fimalgoritmo