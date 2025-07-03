public class Cliente {
    protected String name;
    private String telefone;
    private String cpf;
    private String senha;
    protected String user_id;
    private static int SEQUENCIAL = 1;

    public Cliente(String name, String telefone, String cpf){
        this.name = name;
        this.user_id = "P" + SEQUENCIAL++; // Aqui inseri o P no início do ID para diferenciar do ID das contas (P para marcar cadastro de pessoa).
        this.telefone = telefone;
        this.cpf = cpf; //futuramente vale a pena inserir um mecanismo de validação para impedir cpf duplicado.
        this.senha = "admin";
        //Utilizo 'admin' como senha padrão, mas com intuito de permitir que o cliente escolha sua senha após a criação da conta.
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public String getUserId(){
        return user_id;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }

    public void changeTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getTelefone(){
        return telefone;
    }




}
