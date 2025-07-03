
public abstract class Conta{
    protected  int agencia;
    protected  int numero;
    protected  double saldo;
    protected String name;
    protected String user_id;

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    
    public Conta(String name,String user_id){
        this.name = name;
        this.user_id = user_id;
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }
    //A conta só inicializará para os clientes que possuem cadastro, é necessário inserir o nome e o ID do Cliente para abrir a conta.
    
    public void sacar(double valor){
        saldo -= valor;
    }

    public void depositar(double valor){
        saldo += valor;
    }

    public void transferir(double valor, Conta contaDestino){
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void imprimirExtrato(){
    }

    public void imprimirInfoComum(){
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Conta: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
        System.out.println("Nome do Cliente: " + this.name);
    }

}
