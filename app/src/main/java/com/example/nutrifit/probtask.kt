package com.example.nutrifit

class Solution {
    fun missingNumber(nums: IntArray): Int {
        val len = nums.size
        var p= nums.sorted()
        if(p[0]!=0){
            return 0
        }
        else {
            first@for (i in p.indices) {
                if(p[i]!=i){
                    return i
                    break@first
                }
            }
            return p.size
        }
    }

}

fun main() {
    val nums = intArrayOf(1, 0, 3)
    var s = Solution()
    var res=s.missingNumber(nums)
    print("$res")
}