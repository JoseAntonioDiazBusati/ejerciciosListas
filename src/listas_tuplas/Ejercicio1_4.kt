package listas_tuplas

/*
* Escribir un programa que pregunte al usuario los números ganadores de la lotería primitiva,
* los almacene en una lista y los muestre por pantalla ordenados de menor a mayor.
*/

fun ordenarGanadores(ganadores: MutableList<Int>){
    val ganador = ganadores.size
    for (i in 0 until ganador - 1) {
        for (j in i until ganador) {
            if (ganadores[i] > ganadores[j]) {
                val temp = ganadores[j]
                ganadores[j] = ganadores[i]
                ganadores[i] = temp
            }
        }
    }
}


fun main(args: Array<String>) {
    val ganadores = mutableListOf<Int>()
    println("Introduce los numeros ganadores:")
    for (i in 0..5) {
        val num = readln().toInt()
        ganadores.add(num)
    }
    ordenarGanadores(ganadores)
    println("\nAquí estan los numeros ganadores:")
    for(i in ganadores.indices){
        println("${ganadores[i]}")
    }
}