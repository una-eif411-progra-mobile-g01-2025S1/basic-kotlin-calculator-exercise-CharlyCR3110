package com.example.calculation

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

class CalculatorTest {

    private val calculator = Calculator()

    @Test
    fun `should return sum when add is called with two positive numbers`() {
        val a = 10.0
        val b = 5.0

        val result = calculator.add(a, b)

        assertEquals(15.0, result)
    }

    @Test
    fun `should return difference when subtract is called with two positive numbers`() {
        val a = 10.0
        val b = 5.0

        val result = calculator.subtract(a, b)

        assertEquals(5.0, result)
    }

    @Test
    fun `should return product when multiply is called with two positive numbers`() {
        val a = 10.0
        val b = 5.0

        val result = calculator.multiply(a, b)

        assertEquals(50.0, result)
    }

    @Test
    fun `should return quotient when divide is called with non-zero divisor`() {
        val a = 10.0
        val b = 5.0

        val result = calculator.divide(a, b)

        assertEquals(2.0, result)
    }

    @Test
    fun `should return Nan when divide is called with zero divisor`() {
        val a = 10.0
        val b = 0.0

        val result = calculator.divide(a, b)

        assertTrue(result.isNaN())
    }

    @Test
    fun `should return negative result when add is called with negative numbers`() {
        val a = -10.0
        val b = -5.0

        val result = calculator.add(a, b)

        assertEquals(-15.0, result)
    }

    @Test
    fun `should return zero when subtract is called with identical numbers`() {
        val a = 5.0
        val b = 5.0

        val result = calculator.subtract(a, b)

        assertEquals(0.0, result)
    }

    @Test
    fun `should return zero when multiply is called with zero`() {
        val a = 10.0
        val b = 0.0

        val result = calculator.multiply(a, b)

        assertEquals(0.0, result)
    }

    @Test
    fun `should return negative quotient when divide is called with negative numerator`() {
        val a = -10.0
        val b = 2.0

        val result = calculator.divide(a, b)

        assertEquals(-5.0, result)
    }

    @Test
    fun `should return negative quotient when divide is called with negative denominator`() {
        val a = 10.0
        val b = -2.0

        val result = calculator.divide(a, b)

        assertEquals(-5.0, result)
    }
}
