
import java.util.Scanner;

class Curso {
    private String nome;
    private int duracao; // em anos
    private int quantidadeHoras;
    private int matricula;

    public Curso(String nome, int duracao, int quantidadeHoras, int matricula) {
        this.nome = nome;
        this.duracao = duracao;
        this.quantidadeHoras = quantidadeHoras;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public int getDuracao() {
        return duracao;
    }

    public int getQuantidadeHoras() {
        return quantidadeHoras;
    }

    public int getMatricula() {
        return matricula;
    }

    public void mostrarDados() {
        System.out.println("Nome do Curso: " + nome);
        System.out.println("Duração: " + duracao + " anos");
        System.out.println("Quantidade de Horas: " + quantidadeHoras);
        System.out.println("Matrícula: " + matricula);
        System.out.println();
    }
}

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Curso[] cursos = new Curso[4];
        
        for (int i = 0; i < cursos.length; i++) {
            System.out.println("Digite os dados do curso " + (i + 1) + ":");
            
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            
            System.out.print("Duração (em anos): ");
            int duracao = scanner.nextInt();
            
            System.out.print("Quantidade de Horas: ");
            int quantidadeHoras = scanner.nextInt();
            
            System.out.print("Matrícula (número inteiro): ");
            int matricula = scanner.nextInt();
            scanner.nextLine(); // consumir a quebra de linha restante
            
            cursos[i] = new Curso(nome, duracao, quantidadeHoras, matricula);
            System.out.println();
        }
        
        System.out.println("Dados dos cursos:");
        for (Curso curso : cursos) {
            curso.mostrarDados();
        }
        
        scanner.close();
    }
}
