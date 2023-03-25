package codility

import kotlin.math.*
private fun solution(X: Int, Y: Int, D: Int): Int {
    return floor(((Y-X).toDouble())/D).toInt()
}

fun main(){
    println(solution(10,80,30))
}