public class Calculadora {
    private int num1;
    private int num2;

    // Construtor que recebe dois números inteiros
    public Calculadora(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Método de soma
    public int soma() {
        return num1 + num2;
    }

    // Método de subtração
    public int subtracao() {
        return num1 - num2;
    }

    // Método de multiplicação
    public int multiplicacao() {
        return num1 * num2;
    }

    // Método de divisão com tratamento de exceção
    public double divisao() throws ArithmeticException {
        if (num2 == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        return (double) num1 / num2;
    }
}
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0, num2 = 0;

        // Leitura dos números com tratamento de exceção
        try {
            System.out.print("Digite o primeiro número: ");
            num1 = scanner.nextInt();

            System.out.print("Digite o segundo número: ");
            num2 = scanner.nextInt();

            // Instanciando a calculadora com os números fornecidos
            Calculadora calculadora = new Calculadora(num1, num2);

            // Chamando os métodos da Calculadora
            System.out.println("Soma: " + calculadora.soma());
            System.out.println("Subtração: " + calculadora.subtracao());
            System.out.println("Multiplicação: " + calculadora.multiplicacao());
            try {
                System.out.println("Divisão: " + calculadora.divisao());
            } catch (ArithmeticException e) {
                System.out.println("Erro: " + e.getMessage());
            }

        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira apenas números inteiros.");
        } finally {
            scanner.close();
        }
    }
}
