

public class ContaCorrente extends Conta {
    
    public ContaCorrente(String name,String user_id){
        super(name, user_id);
    }
    public void imprimirExtrato(){
        System.out.println("=== Extrato da Conta Corrente ===");
        super.imprimirInfoComum();
    }
}
