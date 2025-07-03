# Banco Digital 💻
#### Projeto do Bootcamp Santander DIO 2025 - Java Back End.

O projeto é um exercício de abstração, herança, polimorfismo usando classes para simular um banco com cadastro de clientes, contas e operações com dinheiro. 

### Classe Banco
responsável por armazenar listas de Clientes e Contas registradas. Conseguimos checar todas as contas criadas e todos os clientes registrados. Futuramente implementarei um sistema de busca por ID.

### Classe Cliente
é necessário o cadastro do cliente para realizar a inicialização da conta. Aqui temos os métodos para Obter e Alterar nome, telefone e senha pessoal. Vinculei um ID para que cada cliente possua uma identificação única.

### Classe Conta
é uma classe abstrata que é parente das classes ContaCorrente e ContaPoupanca, para diferenciar os tipos de conta possíveis no banco digital. Essa classe demanda nome e ID do cliente para que a conta seja aberta, assim vinculando as informações de uma pessoa a uma conta. Atualmente a conta possue as seguintes operações:
- Saque
- Depósito
- Transferência
- Impressão do extrato

No Main App podemos cadastrar e inserir no sistema do banco através das três classes. Em futuras atualizações serão separadas em interfaces para que haja uma experiência mais concisa de inserção de dados e operações no sistema.

🎴
Gabriel Dargains
  
