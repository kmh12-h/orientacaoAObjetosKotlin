package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario

class Gerente(
    nome: String, cpf: String, salario: Double
) : Funcionario(
    nome = nome,
    cpf = cpf,
    salario = salario
){
    override fun calculoAuxilio(): Double  = salario*(0.4)
}