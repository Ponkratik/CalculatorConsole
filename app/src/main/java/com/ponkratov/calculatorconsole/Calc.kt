package com.ponkratov.calculatorconsole

import com.ponkratov.calculatorconsole.hard.RPN
import com.ponkratov.calculatorconsole.simple.SimpleCalculator
import com.ponkratov.calculatorconsole.simple.SimpleCalculatorHelper

fun main() {
    //Как избавиться от вопросика в SimpleCalculator.kt?
/*    print("Enter 1st number: ")
    val a: Double = SimpleCalculatorHelper.readNumber()
    print("Enter 2nd number: ")
    val b: Double = SimpleCalculatorHelper.readNumber()
    print("Enter operation: ")
    val operation: Char = SimpleCalculatorHelper.readOperation()
    val result = SimpleCalculator(a, b, operation)
    println("Result is ${result.result}")*/


    print("Enter expression to evaluate: ")
    val expression = readln()
    val expressionRPN = RPN.getRPN(expression)
    println("RPN: $expressionRPN")
    println("Result is ${RPN.calculateRPN(expressionRPN)}")
}