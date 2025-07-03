import java.util.ArrayList;
import java.util.List;

public class Banco {
    private int id;
    private String nome;
    private List<Conta> contas;
    private List<Cliente> clientes;

    public Banco(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.contas = new ArrayList<>();
        this.clientes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta conta) {
        this.contas.add(conta);
    }

    public void adicionarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    public List<Conta> getContas() {
        return contas;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    //Seria interessante inserir uma função para buscar clientes no futuro. Para o exercício acho que está bom.
}
