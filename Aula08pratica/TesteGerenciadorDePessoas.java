package Aula08pratica;

import java.util.Scanner;

public class TesteGerenciadorDePessoas {
    public static void main(String[] args) {
        // Scanner para entrada de dados do usuário
        Scanner scanner = new Scanner(System.in);
        
        // Instanciando o GerenciadorDePessoas
        GerenciadorDePessoas gerenciador = new GerenciadorDePessoas();

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        // Cadastrando Pessoa 1
        System.out.println("Cadastro da Pessoa 1:");
        validarEPreencherDados(scanner, pessoa1);
        gerenciador.cadastrarPessoa1(pessoa1);
        
        // Cadastrando Pessoa 2
        System.out.println("\nCadastro da Pessoa 2:");
        validarEPreencherDados(scanner, pessoa2);
        gerenciador.cadastrarPessoa2(pessoa2);
        
        // Exibir informações das pessoas cadastradas
        System.out.println("\nInformações das pessoas cadastradas:");
        gerenciador.exibirPessoa1();
        System.out.println();
        gerenciador.exibirPessoa2();
        
        // Atualizando dados da Pessoa 1
        System.out.println("\nAtualização dos dados da Pessoa 1:");
        validarEPreencherDados(scanner, pessoa1);
        gerenciador.atualizarPessoa1(pessoa1);

        // Exibir informações novamente após a atualização
        System.out.println("\nInformações após a atualização da Pessoa 1:");
        gerenciador.exibirPessoa1();
        System.out.println();
        gerenciador.exibirPessoa2();
        
        // Fechando o scanner
        scanner.close();
    }

    // Função para validar e preencher os dados de uma pessoa
    public static void validarEPreencherDados(Scanner scanner, Pessoa pessoa) {
        boolean nomeValido = false;
        while (!nomeValido) {
            try {
                System.out.print("Insira o nome: ");
                String nome = scanner.nextLine();
                pessoa.setNome(nome); // Tenta definir o nome
                nomeValido = true; // Se chegou até aqui, o nome é válido
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Por favor, insira um nome válido.");
            }
        }

        // Validação do CPF
        boolean cpfValido = false;
        while (!cpfValido) {
            try {
                System.out.print("Insira o CPF: ");
                String cpf = scanner.nextLine();
                pessoa.setCpf(cpf); // Tenta definir o CPF
                cpfValido = true; // Se chegou até aqui, o CPF é válido
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Por favor, insira um CPF válido.");
            }
        }

        // Validação da idade
        boolean idadeValida = false;
        while (!idadeValida) {
            try {
                System.out.print("Insira a idade: ");
                int idade = scanner.nextInt();
                pessoa.setIdade(idade); // Tenta definir a idade
                idadeValida = true; // Se chegou até aqui, a idade é válida
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage() + " Por favor, insira uma idade válida.");
            } finally {
                scanner.nextLine(); // Limpa o buffer do scanner
            }
        }
    }
}
