import java.util.ArrayList;
import java.util.List;

// Classe SalaDeCinema
class SalaDeCinema {
    private int numero;
    private String nome;
    private String localizacao;
    private List<Filme> filmes;

    // Construtor
    public SalaDeCinema(int numero, String nome, String localizacao) {
        this.numero = numero;
        this.nome = nome;
        this.localizacao = localizacao;
        this.filmes = new ArrayList<>();
    }

    // Método para adicionar filme
    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
        System.out.println("Filme '" + filme.getNome() + "' adicionado à sala " + nome + ".");
    }

    // Método para exibir informações da sala
    public void exibirInformacoes() {
        System.out.println("Sala: " + nome + " (Localização: " + localizacao + ")");
        System.out.println("Filmes em exibição:");
        for (Filme filme : filmes) {
            System.out.println("- " + filme.getNome() + " (" + filme.getAno() + ")");
        }
    }
}

// Classe Filme
class Filme {
    private String nome;
    private int ano;
    private String paisDeOrigem;
    private String lingua;
    private String tipo;
    private List<Artista> artistas;

    // Construtor
    public Filme(String nome, int ano, String paisDeOrigem, String lingua, String tipo) {
        this.nome = nome;
        this.ano = ano;
        this.paisDeOrigem = paisDeOrigem;
        this.lingua = lingua;
        this.tipo = tipo;
        this.artistas = new ArrayList<>();
    }

    // Método para adicionar artista
    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
        System.out.println("Artista '" + artista.getNome() + "' adicionado ao filme '" + nome + "'.");
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }

    // Método para exibir informações do filme
    public void exibirInformacoes() {
        System.out.println("Filme: " + nome + " (" + ano + ")");
        System.out.println("Origem: " + paisDeOrigem + " | Língua: " + lingua + " | Tipo: " + tipo);
        System.out.println("Artistas:");
        for (Artista artista : artistas) {
            System.out.println("- " + artista.getNome() + " (" + artista.getNacionalidade() + ")");
        }
    }
}

// Classe Artista
class Artista {
    private String nome;
    private int idade;
    private String nacionalidade;

    // Construtor
    public Artista(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }
}

// Classe Principal
public class Principal {
    public static void main(String[] args) {
        // Criando salas de cinema
        SalaDeCinema sala1 = new SalaDeCinema(1, "Sala Luxo", "Primeiro andar");
        SalaDeCinema sala2 = new SalaDeCinema(2, "Sala Standard", "Segundo andar");

        // Criando filmes
        Filme filme1 = new Filme("A Origem", 2010, "EUA", "Inglês", "Ficção Científica");
        Filme filme2 = new Filme("Parasita", 2019, "Coreia do Sul", "Coreano", "Drama");

        // Criando artistas
        Artista artista1 = new Artista("Leonardo DiCaprio", 48, "EUA");
        Artista artista2 = new Artista("Song Kang-ho", 57, "Coreia do Sul");
        Artista artista3 = new Artista("Joseph Gordon-Levitt", 42, "EUA");

        // Adicionando artistas aos filmes
        filme1.adicionarArtista(artista1);
        filme1.adicionarArtista(artista3);
        filme2.adicionarArtista(artista2);

        // Adicionando filmes às salas
        sala1.adicionarFilme(filme1);
        sala2.adicionarFilme(filme2);

        // Exibindo informações
        System.out.println("\nInformações das salas:");
        sala1.exibirInformacoes();
        sala2.exibirInformacoes();

        System.out.println("\nInformações dos filmes:");
        filme1.exibirInformacoes();
        filme2.exibirInformacoes();
    }
}

public class SalaDeCinema {
    private int numero;
    private String nome;
    private String localizacao;

    // Construtor, getters e setters
    public SalaDeCinema(int numero, String nome, String localizacao) {
        this.numero = numero;
        this.nome = nome;
        this.localizacao = localizacao;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
}
import java.util.List;

public class Filme {
    private String nome;
    private int ano;
    private String paisDeOrigem;
    private String lingua;
    private String tipo;
    private List<Artista> artistas;

    // Construtor, getters e setters
    public Filme(String nome, int ano, String paisDeOrigem, String lingua, String tipo, List<Artista> artistas) {
        this.nome = nome;
        this.ano = ano;
        this.paisDeOrigem = paisDeOrigem;
        this.lingua = lingua;
        this.tipo = tipo;
        this.artistas = artistas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPaisDeOrigem() {
        return paisDeOrigem;
    }

    public void setPaisDeOrigem(String paisDeOrigem) {
        this.paisDeOrigem = paisDeOrigem;
    }

    public String getLingua() {
        return lingua;
    }

    public void setLingua(String lingua) {
        this.lingua = lingua;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Artista> getArtistas() {
        return artistas;
    }

    public void setArtistas(List<Artista> artistas) {
        this.artistas = artistas;
    }
}
public class Artista {
    private String nome;
    private int idade;
    private String nacionalidade;

    // Construtor, getters e setters
    public Artista(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

class Cinema {
    private String numero;
    private String nome;
    private String localizacao;
    private List<Filme> filmes;

    public Cinema(String numero, String nome, String localizacao) {
        this.numero = numero;
        this.nome = nome;
        this.localizacao = localizacao;
        this.filmes = new ArrayList<>();
    }

    public void adicionarFilme(Filme filme) {
        filmes.add(filme);
    }

    // getters e setters omitidos para brevidade
}

class Filme {
    private String nome;
    private int ano;
    private String paisOrigem;
    private String lingua;
    private String tipo;
    private List<Artista> artistas;

    public Filme(String nome, int ano, String paisOrigem, String lingua, String tipo) {
        this.nome = nome;
        this.ano = ano;
        this.paisOrigem = paisOrigem;
        this.lingua = lingua;
        this.tipo = tipo;
        this.artistas = new ArrayList<>();
    }

    public void adicionarArtista(Artista artista) {
        artistas.add(artista);
    }

    // getters e setters omitidos para brevidade
}

class Artista {
    private String nome;
    private int idade;
    private String nacionalidade;

    public Artista(String nome, int idade, String nacionalidade) {
        this.nome = nome;
        this.idade = idade;
        this.nacionalidade = nacionalidade;
    }

    // getters e setters omitidos para brevidade
}
public class Principal {

    private static List<Cinema> cinemas = new ArrayList<>();
    private static final String FILENAME = "cinema_data.ser";

    public static void main(String[] args) {
        lerDados();

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Deseja adicionar um cinema (C), um filme (F), um artista (A) ou sair (S)? ");
            String escolha = scanner.nextLine().toUpperCase();

            if (escolha.equals("C")) {
                System.out.println("Número da sala: ");
                String numero = scanner.nextLine();
                System.out.println("Nome da sala: ");
                String nome = scanner.nextLine();
                System.out.println("Localização: ");
                String localizacao = scanner.nextLine();
                Cinema cinema = new Cinema(numero, nome, localizacao);
                cinemas.add(cinema);
            } else if (escolha.equals("F")) {
                System.out.println("Número da sala de cinema onde o filme será exibido: ");
                String numeroCinema = scanner.nextLine();
                Cinema cinema = findCinemaByNumero(numeroCinema);
                if (cinema != null) {
                    System.out.println("Nome do filme: ");
                    String nome = scanner.nextLine();
                    System.out.println("Ano do filme: ");
                    int ano = Integer.parseInt(scanner.nextLine());
                    System.out.println("País de origem do filme: ");
                    String paisOrigem = scanner.nextLine();
                    System.out.println("Língua do filme: ");
                    String lingua = scanner.nextLine();
                    System.out.println("Tipo do filme: ");
                    String tipo = scanner.nextLine();
                    Filme filme = new Filme(nome, ano, paisOrigem, lingua, tipo);
                    cinema.adicionarFilme(filme);
                } else {
                    System.out.println("Sala de cinema não encontrada.");
                }
            } else if (escolha.equals("A")) {
                System.out.println("Nome do filme para o qual deseja adicionar o artista: ");
                String nomeFilme = scanner.nextLine();
                Filme filme = findFilmeByNome(nomeFilme);
                if (filme != null) {
                    System.out.println("Nome do artista: ");
                    String nome = scanner.nextLine();
                    System.out.println("Idade do artista: ");
                    int idade = Integer.parseInt(scanner.nextLine());
                    System.out.println("Nacionalidade do artista: ");
                    String nacionalidade = scanner.nextLine();
                    Artista artista = new Artista(nome, idade, nacionalidade);
                    filme.adicionarArtista(artista);
                } else {
                    System.out.println("Filme não encontrado.");
                }
            } else if (escolha.equals("S")) {
                break;
            } else {
                System.out.println("Escolha inválida. Tente novamente.");
            }
        }

        gravarDados();
        scanner.close();
    }

    private static Cinema findCinemaByNumero(String numero) {
        for (Cinema cinema : cinemas) {
            if (cinema.getNumero().equals(numero)) {
                return cinema;
            }
        }
        return null;
    }

    private static Filme findFilmeByNome(String nome) {
        for (Cinema cinema : cinemas) {
            for (Filme filme : cinema.getFilmes()) {
                if (filme.getNome().equals(nome)) {
                    return filme;
                }
            }
        }
        return null;
    }

    private static void gravarDados() {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILENAME))) {
            out.writeObject(cinemas);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void lerDados() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILENAME))) {
            cinemas = (List<Cinema>) in.readObject();
        } catch (FileNotFoundException e) {
            cinemas = new ArrayList<>();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

