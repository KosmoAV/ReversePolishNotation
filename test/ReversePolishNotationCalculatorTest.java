import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    void shouldReturn5ThenSummarize2And3() {
        // Готовим данные
        String reversPolishNotation = "2 3 +";
        int expected = 5;

        // Запускаем код
        int actual = calculator.calculatePolishNotation(reversPolishNotation);

        // Сравниваем ожидаемое значение с результатом
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn3ThenSubtract2From5() {
        // Готовим данные
        String reversPolishNotation = "5 2 -";
        int expected = 3;

        // Запускаем код
        int actual = calculator.calculatePolishNotation(reversPolishNotation);

        // Сравниваем ожидаемое значение с результатом
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn6ThenMultiply2And3() {
        // Готовим данные
        String reversPolishNotation = "2 3 *";
        int expected = 6;

        // Запускаем код
        int actual = calculator.calculatePolishNotation(reversPolishNotation);

        // Сравниваем ожидаемое значение с результатом
        assertEquals(expected, actual);
    }

    @Test
    void shouldWorkWithWhitespaces() {
        // Готовим данные
        String reversPolishNotation = "  23      13           -      ";
        int expected = 10;

        // Запускаем код
        int actual = calculator.calculatePolishNotation(reversPolishNotation);

        // Сравниваем ожидаемое значение с результатом
        assertEquals(expected, actual);
    }

    @Test
    void shouldWorkWithNegativeNumber() {
        // Готовим данные
        String reversPolishNotation = "-2 -2 -";
        int expected = 0;

        // Запускаем код
        int actual = calculator.calculatePolishNotation(reversPolishNotation);

        // Сравниваем ожидаемое значение с результатом
        assertEquals(expected, actual);
    }
}