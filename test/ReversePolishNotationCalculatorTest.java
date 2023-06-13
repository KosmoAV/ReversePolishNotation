import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ReversePolishNotationCalculatorTest {

    ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();

    @Test
    void shouldReturn5ThenSummarize2And3() {
        // ������� ������
        String reversPolishNotation = "2 3 +";
        int expected = 5;

        // ��������� ���
        int actual = calculator.calculatePolishNotation(reversPolishNotation);

        // ���������� ��������� �������� � �����������
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn3ThenSubtract2From5() {
        // ������� ������
        String reversPolishNotation = "5 2 -";
        int expected = 3;

        // ��������� ���
        int actual = calculator.calculatePolishNotation(reversPolishNotation);

        // ���������� ��������� �������� � �����������
        assertEquals(expected, actual);
    }

    @Test
    void shouldReturn6ThenMultiply2And3() {
        // ������� ������
        String reversPolishNotation = "2 3 *";
        int expected = 6;

        // ��������� ���
        int actual = calculator.calculatePolishNotation(reversPolishNotation);

        // ���������� ��������� �������� � �����������
        assertEquals(expected, actual);
    }

    @Test
    void shouldWorkWithWhitespaces() {
        // ������� ������
        String reversPolishNotation = "  23      13           -      ";
        int expected = 10;

        // ��������� ���
        int actual = calculator.calculatePolishNotation(reversPolishNotation);

        // ���������� ��������� �������� � �����������
        assertEquals(expected, actual);
    }

    @Test
    void shouldWorkWithNegativeNumber() {
        // ������� ������
        String reversPolishNotation = "-2 -2 -";
        int expected = 0;

        // ��������� ���
        int actual = calculator.calculatePolishNotation(reversPolishNotation);

        // ���������� ��������� �������� � �����������
        assertEquals(expected, actual);
    }
}