package com.ponkratov.calculatorconsole.simple

class Operation {
    companion object {
        val operations: Map<OperationEnum, (Double, Double) -> Double> = mapOf(
            OperationEnum.PLUS to {
                    num1: Double, num2: Double ->
                num1 + num2
            },
            OperationEnum.MINUS to {
                    num1: Double, num2: Double ->
                num1 - num2
            },
            OperationEnum.MULTIPLY to {
                    num1: Double, num2: Double ->
                num1 * num2
            },
            OperationEnum.DIVIDE to {
                    num1: Double, num2: Double ->
                num1 / num2
            },
        )
    }
}