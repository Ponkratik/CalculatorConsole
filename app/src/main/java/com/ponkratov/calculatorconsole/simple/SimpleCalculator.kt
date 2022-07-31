package com.ponkratov.calculatorconsole.simple

class SimpleCalculator(private val number1: Double, private val number2: Double, private val operation: Char) {
    private val operationType = OperationEnum.getOperationEnumByOperation(operation)
    val result = Operation.operations[operationType]?.invoke(number1, number2)
}