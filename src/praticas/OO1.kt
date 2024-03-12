package praticas


// Questão 1
class Produto {
    var nome: String
    var preco: Double

    constructor(nome: String, preco: Double) {
        this.nome = nome
        this.preco = preco
    }

    constructor(nome: String) : this(nome, 0.0)
}

fun main() {
    val produto1 = Produto("Notebook", 2500.0)
    println("Produto: ${produto1.nome}, Preço: ${produto1.preco}")

    val produto2 = Produto("Smartphone")
    println("Produto: ${produto2.nome}, Preço: ${produto2.preco}")
}

// Questão 2
class Cliente {
    var nome: String = ""
    private var idade: Int = 0

    fun mostrarIdade() {
        println("Idade do cliente: $idade")
    }
}

fun main() {
    val cliente = Cliente()
    cliente.nome = "João"
    cliente.mostrarIdade()
}

// Questão 3
abstract class Personagem {
    abstract fun atacar()
}

class Guerreiro : Personagem() {
    override fun atacar() {
        println("Guerreiro atacando com espada!")
    }
}

class Mago : Personagem() {
    override fun atacar() {
        println("Mago lançando feitiço!")
    }
}

fun main() {
    val guerreiro = Guerreiro()
    val mago = Mago()

    guerreiro.atacar()
    mago.atacar()
}

// Questão 4
interface FormaGeometrica {
    fun calcularArea(): Double
}

class Retangulo(val altura: Double, val largura: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return altura * largura
    }
}

class Circulo(val raio: Double) : FormaGeometrica {
    override fun calcularArea(): Double {
        return Math.PI * raio * raio
    }
}

fun main() {
    val retangulo = Retangulo(5.0, 3.0)
    println("Área do retângulo: ${retangulo.calcularArea()}")

    val circulo = Circulo(2.5)
    println("Área do círculo: ${circulo.calcularArea()}")
}

// Questão 5
class ContaBancaria {
    var numeroConta: String = ""
    var nomeTitular: String = ""
    private var saldo: Double = 0.0

    var saldoConta: Double
        get() = saldo
        set(value) {
            if (value >= 0) {
                saldo = value
            } else {
                println("Saldo não pode ser negativo!")
            }
        }
}

fun main() {
    val conta = ContaBancaria()
    conta.nomeTitular = "maria"
    conta.saldoConta = -1000.0
    println("Nome do Titular: ${conta.nomeTitular}, Saldo da Conta: ${conta.saldoConta}")
}
