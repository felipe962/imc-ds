import java.time.LocalDate
import java.time.Period
import kotlin.math.pow
//classe paciente
//programador: bahia
//data: 04/02/25
class Paciente {

    var nome: String = ""
    var dataNascimento: LocalDate? = null
    var peso: Int = 0
    var altura: Double = 0.0
    var telefone: String = ""

    fun calcularImc(): Double{
        var imc = peso/altura.pow(2)
        return imc
    }

    fun mostrarDados() {

        println("  Dados Do Paciente")
        println("-------------------------            ")
        println("| NOME: $nome                        ")
        println("| IDADE: ${calcularIdade()}          ")
        println("| PESO: $peso                        ")
        println("| ALTURA: $altura                    ")
        println("| IMC: ${calcularImc()}              ")
        println("| CLASIFICACAO: ${(clasificarImc())} ")
        println("-------------------------            ")
    }

    fun clasificarImc(): String {
        val imc = calcularImc()
        var clasificacao = ""

        if (imc <= 18.5){
            clasificacao = "Abaixo do Peso"
        }else if (imc > 18.5 && imc < 25.0){
            clasificacao = "Peso ideal"
        }else {
            clasificacao = "Acima do peso"
        }
        return clasificacao
    }

    fun calcularIdade(): Int{
        val hoje = LocalDate.now()
        val idade = Period.between(dataNascimento, hoje).years
        return idade

    }


}