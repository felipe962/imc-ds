import java.time.LocalDate
import java.util.Scanner

fun main() {

    val leitor = Scanner(System.`in`)

    var paciente1= Paciente()
    var paciente2= Paciente()
    var paciente3= Paciente()

    paciente1.nome = "Julia Silva"
    paciente1.peso = 64
    paciente1.altura = 1.65
    paciente1.telefone = "11 94660-0000"
    paciente1.dataNascimento = LocalDate.of(2006, 12, 13)
    paciente1.mostrarDados()


    paciente2.nome = "Kaike Bueno"
    paciente2.peso =  84
    paciente2.altura = 1.80
    paciente2.telefone = "11 99530-0000"
    paciente2.dataNascimento = LocalDate.of(2007, 7, 20)
    paciente2.mostrarDados()


    println("Qual o nome do paciente: ")
    paciente3.nome = leitor.nextLine()

    println("Qual o peso do paciente")
    paciente3.peso =  leitor.nextInt()

    println("Qual a altura do paciente?")
    paciente3.altura = leitor.nextDouble()

    println("Qual o telefone do cliente")
    paciente3.telefone = leitor.nextLine()

    paciente3.dataNascimento = LocalDate.of(2007, 7, 20)
    paciente3.mostrarDados()
}