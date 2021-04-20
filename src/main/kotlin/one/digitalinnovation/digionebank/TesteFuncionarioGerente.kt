package one.digitalinnovation.digionebank

import one.digitalinnovation.digionebank.testes.Gerente
import one.digitalinnovation.digionebank.testes.imprimeRelatorioFuncionario


fun main() {
    val maria = Gerente(nome = "Maria Rosa", cpf = "56158456", salario = 5000.0)
    imprimeRelatorioFuncionario.imprime(maria)
}

