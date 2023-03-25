package codility

private fun solution(A: IntArray): Int {
    if(A.size == 0) return 1

    A.sort()
    for(i in 0..A.size-1){
        if(A[i]!=(i+1))
            return (i+1)
    }
    val a = Int.MAX_VALUE
    return A[A.size-1]+1
}