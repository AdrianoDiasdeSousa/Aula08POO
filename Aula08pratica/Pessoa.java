package Aula08pratica;

public class Pessoa {
    // Atributos privados
    private String nome;
    private String cpf;  // Será armazenado no formato ***.***.***-**
    private int idade;

    // Construtor vazio (opcional)
    public Pessoa() {}

    // Construtor com parâmetros (opcional)
    public Pessoa(String nome, String cpf, int idade) {
        this.setNome(nome);  // Chama o setNome para garantir a validação
        this.setCpf(cpf);    // Chama o setCpf para garantir a formatação
        this.setIdade(idade); // Chama o setIdade para garantir a validação
    }

    // Métodos getter e setter para o atributo 'nome' com validação
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        // Verificação de nome: não pode ser vazio e deve conter apenas letras e espaços
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome inválido. O nome não pode ser vazio.");
        }

        // Verifica se o nome contém apenas letras e espaços
        if (!nome.matches("[A-Za-zÀ-ÿ ]+")) {
            throw new IllegalArgumentException("Nome inválido. O nome deve conter apenas letras e espaços.");
        }

        // Verifica se o nome é longo o suficiente (mínimo de 3 caracteres, por exemplo)
        if (nome.length() < 3) {
            throw new IllegalArgumentException("Nome inválido. O nome deve ter pelo menos 3 caracteres.");
        }

        this.nome = nome;
    }

    // Métodos getter e setter para o atributo 'cpf' com lógica de formatação diretamente no set
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        // Remove qualquer caractere que não seja numérico
        cpf = cpf.replaceAll("[^\\d]", "");

        // Verifica se o CPF tem 11 dígitos
        if (cpf.length() == 11) {
            // Formata o CPF no padrão ***.***.***-**
            this.cpf = cpf.substring(0, 3) + "." +
                       cpf.substring(3, 6) + "." +
                       cpf.substring(6, 9) + "-" +
                       cpf.substring(9, 11);
        } else {
            throw new IllegalArgumentException("CPF inválido. Deve conter 11 dígitos.");
        }
    }

    // Métodos getter e setter para o atributo 'idade' com validação
    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        // Validação: idade deve ser maior que 0 e menor que 120
        if (idade <= 0 || idade >= 120) {
            throw new IllegalArgumentException("Idade inválida. Deve ser maior que 0 e menor que 120.");
        }
        this.idade = idade;
    }
}