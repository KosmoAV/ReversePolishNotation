public class Main {

    public static void main(String[] args) {

        ReversePolishNotationCalculator calculator = new ReversePolishNotationCalculator();
        String reversPolishNotation = "8 3 5 + -";
        System.out.printf("��������� �������� �� ������ '%s' ����� %d",
                reversPolishNotation,
                calculator.calculatePolishNotation(reversPolishNotation)
        );
    }
}
