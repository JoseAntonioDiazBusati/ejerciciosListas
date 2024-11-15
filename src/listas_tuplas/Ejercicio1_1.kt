package listas_tuplas
/*
* Escribir un programa que almacene las asignaturas de un curso
* (por ejemplo Matemáticas, Física, Química, Historia y Lengua) en una lista y la muestre por pantalla.
*/

fun asignaturas(): List<String> {
    val asignatura = listOf("Matemáticas", "Física", "Química", "Lengua castellana", "Inglés", "Historia")
    return asignatura
}

fun mostrarAsignaturas(asignaturas: List<String>): String {
    var mostrar = ""
    for (asignatura in asignaturas) {
        mostrar += asignatura + "\n"
    }
    return mostrar
}

fun main(args: Array<String>) {
    val asignaturas = asignaturas()
    println(mostrarAsignaturas(asignaturas))
}