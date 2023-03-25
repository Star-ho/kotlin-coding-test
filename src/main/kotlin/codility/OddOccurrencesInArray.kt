package codility

import java.util.*

private fun solution1(A: IntArray): Int {
    A.sort()
    println(Arrays.toString(A))
    if(A.size == 1) return A[0]
    val end = A.size-1
    var i = 0
    while(i<end){
        if(A[i]!=A[i+1])
            return A[i]
        i+=2
    }
    return A[A.size-1]
}

fun main(){
    println(solution1(intArrayOf(1,2,1,2,3,3,9)))
}
