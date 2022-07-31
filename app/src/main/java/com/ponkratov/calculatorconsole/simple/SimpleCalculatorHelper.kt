package com.ponkratov.calculatorconsole.simple

class SimpleCalculatorHelper {
    companion object {
        fun readNumber(): Double {
            var number: Double
            while (true) {
                try {
                    number = readln().toDouble()
                    break
                } catch (e: NumberFormatException) {
                    print("\tIt's not a number. Please, try again: ")
                }
            }

            return number
        }

        fun readOperation(): Char {
            var operation: Char = readln()[0]
            while (OperationEnum.getOperationEnumByOperation(operation) == OperationEnum.NO_OPERATION) {
                print("\tIt's not an accessed operation. Please, try again: ")
                operation = readln()[0]
            }

            return operation
        }
    }
}