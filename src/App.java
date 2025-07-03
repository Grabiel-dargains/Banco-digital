public class App {
    public static void main(String[] args) throws Exception {
        Banco banco = new Banco(123, "Banco Digital");

        Cliente pessoa = new Cliente("Gabriel", "1236789", "1234789");
        Cliente pessoa2 = new Cliente("Miguel", "1236789", "1234789");
        banco.adicionarCliente(pessoa);
        banco.adicionarCliente(pessoa2);

        Conta cc = new ContaCorrente(pessoa.getName(), pessoa.getUserId()); 
        Conta poupanca = new ContaPoupanca(pessoa2.getName(), pessoa2.getUserId());
        // Por causa do construtor da conta, é necessário cadastrar os clientes antes de abrir a conta.

        banco.adicionarConta(cc);
        banco.adicionarConta(poupanca);
        //Os métodos do banco atualmente funcionam como uma espécie de validação, já que dependem da inserção nas listas.

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
        
    }
}
