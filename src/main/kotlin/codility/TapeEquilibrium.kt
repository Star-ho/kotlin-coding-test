package codility

import kotlin.math.*

private fun solution(A: IntArray): Int {
    var first = A[0]
    var second = 0L
    var res = Long.MAX_VALUE
    for(i in 1..A.size-1){
        second+=A[i]
    }

    res = min(res,abs(first-second))

    for(i in 1..A.size-1){
        first += A[i]
        second -= A[i]
        res = min(res,abs(first-second))
    }

    return res.toInt()
}