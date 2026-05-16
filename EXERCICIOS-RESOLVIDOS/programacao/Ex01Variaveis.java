/**
 * Exercício 1 - Variáveis e Tipos de Dados em Java
 * 
 * Crie um programa que:
 * 1. Declare variáveis para nome, idade, altura e se é estudante
 * 2. Solicite esses dados ao usuário
 * 3. Exiba uma mensagem formatada
 * 
 * @author Turma ADS IFFAR
 */
import java.util.Scanner;

public class Ex01Variaveis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();
        
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        
        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();
        scanner.nextLine(); // limpar buffer
        
        System.out.print("Você é estudante? (s/n): ");
        String resposta = scanner.nextLine();
        boolean estudante = resposta.equalsIgnoreCase("s");
        
        // Saída formatada
        System.out.println("\n--- Dados do Usuário ---");
        System.out.printf("Nome: %s%n", nome);
        System.out.printf("Idade: %d anos%n", idade);
        System.out.printf("Altura: %.2fm%n", altura);
        System.out.printf("Estudante: %s%n", estudante ? "Sim" : "Não");
        
        scanner.close();
    }
}