package test

import org.junit.Test

class FactorialTest {


    //loop factorial
    private fun factorial(value: Int): Int {
        if (value <= 1) {
            return 1
        }
        var result = 1;
        for (i in 1..value) {
            result *= i
        }
        return result
    }

    //recursive factorial
    private fun recursivefactorial(value: Int): Int {
        if (value <= 1) {
            return 1
        }
        //cara kerja factorial recursive function
        //5 * factorial(4)
        //5 * 4 * factorial(3)
        //5 * 4 * 3 * factorial(2)
        //5 * 4 * 3 * 2 * factorial(1)
        //5 * 4 * 3 * 2 * 1
        return value * recursivefactorial(value - 1)
    }

    //tail recursive factorial
    private fun tailRecursiveFactorial(value: Int, total: Int): Int {
        //factorial(5) =>
        //factorial(5, 4) =>
        //factorial(20, 3) =>
        //factorial(60, 2) =>
        //factorial(120, 1) =>
        //120
        if (value <= 0) {
            return total
        }else{
            return tailRecursiveFactorial(value - 1, total * value)
        }
    }

    @Test
    fun testFactorial() {
        assert(factorial(1) == 1)
        assert(factorial(2) == 2)
        assert(factorial(3) == 6)
        assert(factorial(4) == 24)
        assert(factorial(5) == 120)
    }

    @Test
    fun testRecursiveFactorial() {
        assert(recursivefactorial(1) == 1)
        assert(recursivefactorial(2) == 2)
        assert(recursivefactorial(3) == 6)
        assert(recursivefactorial(4) == 24)
        assert(recursivefactorial(5) == 120)
    }

    @Test
    fun testTailRecursiveFactorial() {
        assert(tailRecursiveFactorial(0, 1) == 1)
        assert(tailRecursiveFactorial(1, 1) == 1)
        assert(tailRecursiveFactorial(2, 1) == 2)
        assert(tailRecursiveFactorial(3, 1) == 6)
        assert(tailRecursiveFactorial(4, 1) == 24)
        assert(tailRecursiveFactorial(5, 1) == 120)
    }

}