package com.example.calculation

class Calculator {
    fun add(a: Double, b: Double): Double {
        return a + b
    }

    fun subtract(a: Double, b: Double): Double {
      return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        return if (b != 0.0) {
            a / b
        } else {
            println("Error: Division by zero is not allowed.")
            Double.NaN
        }
    }
}
