package listas_tuplas

/*
* Escribir un programa que almacene las asignaturas de un curso
* (por ejemplo Matemáticas, Física, Química, Historia y Lengua) en una lista y
* la muestre por pantalla el mensaje Yo estudio <asignatura>, donde <asignatura>
* sobre cada una de las asignaturas de la lista.
*/


fun mostrarAsignaturas(asignaturas: List<String>): String {
    var mostrar = ""
    for (asignatura in asignaturas) {
        mostrar += "Yo estudio $asignatura\n"
    }
    return mostrar
}

fun main(args: Array<String>) {
    val asignaturas = listOf("Matemáticas", "Física", "Química", "Lengua", "Historia")
    println(mostrarAsignaturas(asignaturas))
}