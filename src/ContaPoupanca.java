public class ContaPoupanca extends Conta {

    public ContaPoupanca(String name, String user_id){
        super(name, user_id);
    }

    public void imprimirExtrato(){
        System.out.println("=== Extrato da Conta Poupança ===");
        super.imprimirInfoComum();
    }
}
