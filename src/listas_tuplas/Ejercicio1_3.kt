package listas_tuplas

/*
* Escribir un programa que almacene las asignaturas de un curso (por ejemplo Matemáticas, Física, Química,
* Historia y Lengua) en una lista, pregunte al usuario la nota que ha sacado en cada asignatura,
* y después las muestre por pantalla con el mensaje En <asignatura> has sacado <nota> donde <asignatura>
* es cada una des las asignaturas de la lista y <nota> cada una de las correspondientes notas introducidas
*  por el usuario.
*/

fun asignaturasCurso(): List<String> {
    return listOf("Matemáticas","Física","Química","Historia","Lengua")
}


fun main(args: Array<String>) {
    val asignaturas = asignaturasCurso()
    val notas = mutableListOf<Int>()
    println("Introduzca las notas de las siguientes asignaturas.")
    for (asignatura in asignaturas){
        println("$asignatura: ")
        val nota = readlnOrNull()?.toIntOrNull()?: 0
        notas.add(nota)
    }
    println("\nNotas")
    for ((indice, asignatura) in asignaturas.withIndex()) {
        println("En $asignatura has sacado ${notas[indice]}.")
    }
}