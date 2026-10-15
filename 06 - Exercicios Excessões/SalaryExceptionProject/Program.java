package SalaryExceptionProject;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean exitLoop = false;
        String nome = "";
        double salario = 0.0;

        do {
            try {
                System.out.print("Insira seu nome: ");
                nome = sc.nextLine().trim();
                if (verificaNomeNumero(nome))
                    throw new InputMismatchException();
                if (nome.length() < 5)
                    throw new BusinessLogicException(0);
                exitLoop = true;
            } catch (BusinessLogicException e) {
                System.err.println("Erro: Número de caracteres inválido");
            } catch (InputMismatchException e) {
                System.err.println("Erro: O nome não pode conter números");
            }
        } while (!exitLoop);

        exitLoop = false;
        do {
            try {
                System.out.print("Informe seu salário: ");
                salario = sc.nextDouble();
                if (salario < 1621.0)
                    throw new BusinessLogicException(0);
                exitLoop = true;
            } catch (InputMismatchException e) {
                System.out.println("Erro: Informe um número válido (ex.: 2012.2)");
            } catch (BusinessLogicException e) {
                System.out.println("Erro: Salário abaixo do minímo (R$ 1621.0)");
            }
        } while (!exitLoop);

        System.out.println("Recibo de pagamento");
        System.out.printf("\nNome: %s\nSalário: %.2f\nFGTS: %.2f", nome, salario, salario * 0.08);

        sc.close();
    }

    public static boolean verificaNomeNumero(String nome) {
        if (nome == null)
            return false;

        for (char c : nome.toCharArray()) {
            if (Character.isDigit(c))
                return true;
        }

        return false;
    }
}
