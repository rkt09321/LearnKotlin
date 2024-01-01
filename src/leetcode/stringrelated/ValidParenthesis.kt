package leetcode.stringrelated

import java.util.*
import kotlin.collections.HashMap

class ValidParenthesis {
    fun isValid(s: String): Boolean {
        var value=0
        val map=HashMap<Char,Char>()
        map['('] = ')'
        map['{'] = '}'
        map['['] = ']'
        val stack= Stack<Char>()

        for(i in s.indices){
            if(map.containsKey(s[i])){
                stack.push(map[s[i]])
            } else if(map.containsValue(s[i])){
                if(stack.isEmpty()||stack.pop()!=s[i]){
                    return false
                }
            }
        }
        return true
    }
    companion object {
        @JvmStatic
        fun main(array:Array<String>){
            print(ValidParenthesis().isValid("{[]}"))
        }
    }
}