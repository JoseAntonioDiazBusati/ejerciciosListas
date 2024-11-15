package listas_tuplas

/*
* Escribir un programa que almacene en una lista los números del 1 al 10 y
* los muestre por pantalla en orden inverso separados por comas.
*/

fun mostrarnum(listaNum: List<Int>): String {
    var serie = ""
    for (num in listaNum) {
        serie += "${num},"
    }
    return serie.removeSuffix(",")
}

fun main(args: Array<String>) {
    val listaNum = listOf(1,2,3,4,5,6,7,8,9,10)
    println(mostrarnum(listaNum.asReversed()))
}