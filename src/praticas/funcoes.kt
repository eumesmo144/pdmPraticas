package praticas

/*
//////////////////////////
Leia o escopo do main para entender o que deverá ser feito na atividade;
//////////////////////////
*/

val materiasENotas = mutableMapOf<String, MutableList<Double>>()

/**
 * Adiciona uma disciplina no dicionário mutável,
 * Recebe um array de notas (opcional)
 * Retorna true se conseguiu, false se não.
 */
fun adicionarDisciplina(materia: String, notas: MutableList<Double>): Boolean {
    return materiasENotas.put(materia, notas) != null
}

/**
 * Adiciona uma nota à lista de notas de uma determinada matéria;
 * Retorna true se conseguiu adicionar, false se não conseguiu.
 */
fun adicionarNota(materia: String, nota: Double): Boolean {
    val notasDaMateria = materiasENotas[materia]

    return if (notasDaMateria != null) {
        notasDaMateria.add(nota)
        true
    } else {
        false
    }
}


/**
 *Mostra na tela todas as notas presentes em uma matéria, no seguinte formato:
 * Materia: {nome da materia}
 * Nota 1: 5.4 \n
 * Nota 2: 7.8 \n
 * ...
 * Nota n: 10.0 \n
 * \n
 * Média:  {5.4 + 7.8 + ... + 10.0 / n} \n [TO DO <////////]
 * \n
 *
 * Caso não encontre a materia no map, mostre:
 * Materia {nome da materia} não encontrada \n
 *
 * Caso não seja possível mostar as notas, mostre:
 * Não foi possível mostrar as notas da matéria {nome da materia} \n
 */
fun mostrarNotas(materia:String){

    if(!materiasENotas.containsKey(materia)){
        println("Materia $materia não encontrada")
    }
    else{
        val listaNotas = materiasENotas[materia]

        if (listaNotas != null) {
            var cont = 1
            for(nota:Double in listaNotas){
                println("Nota ${cont++}: $nota")
            }
        }
        else{
            println("Não foi possível mostrar as notas da matéria ${materia}")
        }

        println()
    }


}

/*Retorna a média obtida apartir de uma lista de notas */
fun calcularMedia(){ }


/**
 *Adiciona várias notas de uma só vez em uma matéria
 * retorne true se conseguiu adicionar, false se não consegiu.
 * */
fun adicionarVariasNotas(materia:String, vararg nota:Double){}


fun main(){
    fun main(){
    // 1. adicionarDisciplinas -> adicione 1 disciplina ao map materiasENotas, através de atribuição posicional
        adicionarDisciplina("Matemática", mutableListOf())

    // 2. adicionarDisciplinas -> adicione 1 disciplina ao map materiasENotas, através de atribuição nomeada
        val notasFisica = mutableListOf(7.5, 8.0, 6.5)
        adicionarDisciplina(materia = "Física", notas = notasFisica)

    // 3. adicionarDisciplinas -> altere a função adicionarDisciplinas para que o parâmetro notas possua um valor padrão.
        fun adicionarDisciplina(materia: String, notas: MutableList<Double> = mutableListOf()): Boolean {
            return materiasENotas.put(materia, notas) != null
        }

    // 4. adicionarDisciplinas -> adicione 1 disciplina ao map materiasENotas, sem atribuir valores a notas
        adicionarDisciplina("Química")

    // 5. adicionarNota -> adicione 3 notas para as 3 disciplinas
        adicionarNota("Matemática", 9.0)
        adicionarNota("Física", 7.0)
        adicionarNota("Química", 8.0)

    // 6. mostrarNotas -> Mostre as notas das 3 disciplinas
        mostrarNotas("Matemática")
        mostrarNotas("Física")
        mostrarNotas("Química")

    // 7. adicionarDisciplina -> adicione mais 1 disciplina
        adicionarDisciplina("História")

    // 8. adicionarVariasNotas -> implemente o método adicionarVariasNotas();
        fun adicionarVariasNotas(materia: String, vararg nota: Double): Boolean {
            val notasDaMateria = materiasENotas[materia]
            return if (notasDaMateria != null) {
                notasDaMateria.addAll(nota.toList())
                true
            } else {
                false
            }
        }

    // 9. adicionarVariasNotas -> adicione 3 notas para a disciplina que você acabou de criar
        adicionarVariasNotas("História", 6.5, 7.0, 8.5)
    // 10. mostrarNotas -> mostre as notas da disciplina que você acabou de criar;
        mostrarNotas("História")
    }
    // 11: calcularMedia -> Implemente a função calcularMedia()
    fun calcularMedia(notas: List<Double>): Double {
        if (notas.isEmpty()) return 0.0
        return notas.sum() / notas.size
    }

    // 12: calcularMedia -> calcule a media de 2 disciplinas
    fun calcularMediaDisciplinas(disciplina1: String, disciplina2: String) {
        val notasDisciplina1 = materiasENotas[disciplina1]
        val notasDisciplina2 = materiasENotas[disciplina2]

        if (notasDisciplina1 != null && notasDisciplina2 != null) {
            val mediaDisciplina1 = calcularMedia(notasDisciplina1)
            val mediaDisciplina2 = calcularMedia(notasDisciplina2)

            println("Média de $disciplina1: $mediaDisciplina1")
            println("Média de $disciplina2: $mediaDisciplina2")
        } else {
            println("Não foi possível calcular a média das disciplinas.")
        }
    }

    // 13: mostrarNotas -> altere o mostrarNotas() para que ele mostre também a média das disciplinas
    fun mostrarNotasComMedia(materia: String) {
        if (!materiasENotas.containsKey(materia)) {
            println("Matéria $materia não encontrada")
        } else {
            val notasDaMateria = materiasENotas[materia]
            if (notasDaMateria != null) {
                var cont = 1
                println("Notas de $materia:")
                for (nota in notasDaMateria) {
                    println("Nota ${cont++}: $nota")
                }
                val media = calcularMedia(notasDaMateria)
                println("Média: $media\n")
            } else {
                println("Não foi possível mostrar as notas da matéria $materia")
            }
        }
    }

    // 14: mostrarNotas -> mostre as notas de 1 disciplina
    mostrarNotasComMedia("Matemática")


}