package com.ponkratov.calculatorconsole.simple

enum class OperationEnum () {
    PLUS,
    MINUS,
    MULTIPLY,
    DIVIDE,
    NO_OPERATION;

    companion object {
        fun getOperationEnumByOperation(operationChar: Char): OperationEnum {
            return when(operationChar) {
                '+' -> PLUS
                '-' -> MINUS
                '*' -> MULTIPLY
                '/' -> DIVIDE
                else -> NO_OPERATION
            }
        }
    }
}