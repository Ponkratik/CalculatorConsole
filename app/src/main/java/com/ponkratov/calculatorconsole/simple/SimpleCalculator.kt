package com.ponkratov.calculatorconsole.simple

class SimpleCalculator(number1: Double, number2: Double, private val operation: Char) {
    private val operationType = OperationEnum.getOperationEnumByOperation(operation)
    val result = Operation.operations[operationType]?.invoke(number1, number2)
}