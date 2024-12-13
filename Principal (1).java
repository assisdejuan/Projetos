import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empresa> empresas = new ArrayList<>();
        String continuar;

        do {
            continuar = JOptionPane.showInputDialog("Cadastrar nova empresa (S/N)?");
            if (continuar.equalsIgnoreCase("S")) {
                String nome = JOptionPane.showInputDialog("Nome da empresa:");
                String cnpj = JOptionPane.showInputDialog("CNPJ da empresa:");
                String nomeContato = JOptionPane.showInputDialog("Nome do contato:");
                String telefoneContato = JOptionPane.showInputDialog("Telefone do contato:");

                Contato contato = new Contato(nomeContato, telefoneContato);
                Empresa empresa = new Empresa(nome, cnpj, contato);

                String cadastrarProduto;
                do {
                    cadastrarProduto = JOptionPane.showInputDialog("Cadastrar produto para a empresa (S/N)?");
                    if (cadastrarProduto.equalsIgnoreCase("S")) {
                        String nomeProduto = JOptionPane.showInputDialog("Nome do produto:");
                        String tamanhoProduto = JOptionPane.showInputDialog("Tamanho do produto:");
                        String tipoProduto = JOptionPane.showInputDialog("Tipo do produto:");
                        String corProduto = JOptionPane.showInputDialog("Cor do produto:");
                        String especificacaoProduto = JOptionPane.showInputDialog("Especificação do produto:");

                        Produto produto = new Produto(nomeProduto, tamanhoProduto, tipoProduto, corProduto, especificacaoProduto);
                        empresa.adicionarProduto(produto);
                    }
                } while (cadastrarProduto.equalsIgnoreCase("S"));

                empresas.add(empresa);
            }
        } while (continuar.equalsIgnoreCase("S"));

        // Mostrar empresas e produtos
        StringBuilder sb = new StringBuilder("Empresas e seus produtos:\n");
        for (Empresa emp : empresas) {
            sb.append(emp.toString()).append("\n");
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }
}
