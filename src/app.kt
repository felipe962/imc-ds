import java.time.LocalDate
import java.time.Period
import kotlin.math.pow

class Paciente {

    var nome: String = ""
    var dataNascimento: LocalDate? = null
    var peso: Int = 0
    var altura: Double = 0.0
    var telefone: String = ""

    fun calcularImc(): Double {
        // IMC = peso / altura^2
        return peso / altura.pow(2)
    }

    fun mostrarDados() {
        println("Dados do Paciente")
        println("-------------------------")
        println("| NOME: $nome")
        println("| IDADE: ${calcularIdade()}")
        println("| PESO: $peso")
        println("| ALTURA: $altura")
        println("| IMC: ${calcularImc()}")
        println("| CLASSIFICAÇÃO: ${classificarImc()}")
        println("-------------------------")
    }

    fun classificarImc(): String {
        val imc = calcularImc()
        var classificacao = ""
        if (imc <= 18.5) {
            classificacao = "Abaixo do Peso"
        } else if (imc > 18.5 && imc < 25.0) {
            classificacao = "Peso Ideal"
        } else {
            classificacao = "Acima do Peso"
        }
        return classificacao
    }

    fun calcularIdade(): Int {
        val hoje = LocalDate.now()
        val idade = Period.between(dataNascimento, hoje).years
        return idade
    }
}
