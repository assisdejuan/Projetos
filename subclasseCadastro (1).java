public class Cadastro {
    public static void main(String[] args) {
        // Criando instâncias de ContaCorrente e ContaPoupanca
        ContaCorrente cc = new ContaCorrente(123, "João Silva", 1000);
        ContaPoupanca cp = new ContaPoupanca(456, "Maria Oliveira", 2000);

        // Configurando dados das contas
        cc.setNumero(123);
        cc.setTitular("João Silva");
        cc.depositar(1000);

        cp.setNumero(456);
        cp.setTitular("Maria Oliveira");
        cp.depositar(2000);

        // Invocando métodos depositar e sacar
        cc.depositar(500);
        cc.sacar(100);
        System.out.println(cc);

        cp.depositar(1000);
        cp.sacar(500);
        System.out.println(cp);

        // Atualizando saldo da poupança
        cp.atualizaSaldo(5);
        System.out.println(cp);

        // Transferindo entre contas
        ContaCorrente cc2 = new ContaCorrente(789, "Carlos Santos", 1500);
        cp.transferir(cc2, 500);
        System.out.println(cp);
        System.out.println(cc2);

        // Criando e configurando ContaSalario
        ContaSalario cs = new ContaSalario(101, "Ana Costa", 3000);
        cs.depositar(1000);
        cs.sacar(500);
        cs.transferir(cc, 500);
        System.out.println(cs);
        System.out.println(cc);
    }
}
