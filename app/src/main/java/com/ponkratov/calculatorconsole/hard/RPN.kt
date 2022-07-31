package com.ponkratov.calculatorconsole.hard

import com.ponkratov.calculatorconsole.simple.OperationEnum
import java.util.*
import kotlin.math.exp

class RPN {
    companion object {
        fun getRPN(expression: String): String {
            var result: MutableList<String> = mutableListOf()
            var opStack: Stack<Char> = Stack()
            expression.split(" ").forEach {
                try {
                    result.add(it.toDouble().toString())
                } catch (e: NumberFormatException) {
                    when (it[0]) {
                        '(' -> opStack.push(it[0])
                        ')' -> {
                            while (opStack.peek() != '(') {
                                result.add(opStack.pop().toString())
                            }

                            opStack.pop()
                        }
                        else -> {
                            while (!opStack.isEmpty() && getPriority(opStack.peek()) >= getPriority(it[0])) {
                                result.add(opStack.pop().toString())
                            }

                            opStack.push(it[0])
                        }
                    }
                }
            }

            while (!opStack.isEmpty()) {
                result.add(opStack.pop().toString())
            }

            return result.writeToString()
        }

        private fun getPriority(operation: Char): Int {
            return when (operation) {
                '(' -> 0
                '+', '-' -> 1
                else -> 2
            }
        }

        fun calculateRPN(expressionRPN: String): Double {
            val stack: Stack<Double> = Stack()
            expressionRPN.split(" ").forEach {
                when (OperationEnum.getOperationEnumByOperation(it[0])) {
                    OperationEnum.PLUS -> stack.push(stack.pop() + stack.pop())
                    OperationEnum.MINUS -> stack.push(-stack.pop() + stack.pop())
                    OperationEnum.MULTIPLY -> stack.push(stack.pop() * stack.pop())
                    OperationEnum.DIVIDE -> stack.push(stack.pop() / stack.pop())
                    else -> stack.push(it.toDouble())
                }
            }

            return stack.pop()
        }
    }
}

private fun <E> MutableList<E>.writeToString(): String {
    var resultString = ""
    this.forEach {
        resultString += "$it "
    }

    return resultString.trim()
}
