package Aula08pratica;

public class GerenciadorDePessoas {
    // Atributos privados para armazenar as pessoas
    private Pessoa pessoa1;
    private Pessoa pessoa2;

    // Construtor vazio (opcional)
    public GerenciadorDePessoas() {}

    // Método para cadastrar ou sobrescrever a primeira pessoa
    public void cadastrarPessoa1(Pessoa pessoa) {
        pessoa1 = pessoa;
        System.out.println("Pessoa 1 cadastrada com sucesso.");
    }

    // Método para cadastrar ou sobrescrever a segunda pessoa
    public void cadastrarPessoa2(Pessoa pessoa) {
        pessoa2 = pessoa;
        System.out.println("Pessoa 2 cadastrada com sucesso.");
    }

    // Método para atualizar os dados da primeira pessoa
    public void atualizarPessoa1(Pessoa pessoa) {
        pessoa1 = pessoa;
        System.out.println("Dados da Pessoa 1 atualizados com sucesso.");
    }

    // Método para atualizar os dados da segunda pessoa
    public void atualizarPessoa2(Pessoa pessoa) {
        pessoa2 = pessoa;
        System.out.println("Dados da Pessoa 2 atualizados com sucesso.");
    }

    // Método para exibir os dados da primeira pessoa
    public void exibirPessoa1() {
        if (pessoa1 != null) {
            System.out.println("Dados da Pessoa 1:");
            System.out.println("Nome: " + pessoa1.getNome());
            System.out.println("CPF: " + pessoa1.getCpf());
            System.out.println("Idade: " + pessoa1.getIdade());
        } else {
            System.out.println("Pessoa 1 ainda não foi cadastrada.");
        }
    }

    // Método para exibir os dados da segunda pessoa
    public void exibirPessoa2() {
        if (pessoa2 != null) {
            System.out.println("Dados da Pessoa 2:");
            System.out.println("Nome: " + pessoa2.getNome());
            System.out.println("CPF: " + pessoa2.getCpf());
            System.out.println("Idade: " + pessoa2.getIdade());
        } else {
            System.out.println("Pessoa 2 ainda não foi cadastrada.");
        }
    }
}
