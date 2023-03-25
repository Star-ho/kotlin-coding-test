package codility

import java.util.LinkedList

private fun solution(A: IntArray, K: Int): IntArray {
    var intList = LinkedList(A.toList())
    if(intList.size == 0 ) return A
    for(i in 1..K){
        intList.addFirst(intList.pollLast())
    }
    return intList.toIntArray()

}