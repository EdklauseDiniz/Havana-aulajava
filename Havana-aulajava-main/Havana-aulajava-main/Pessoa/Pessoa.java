public class Pessoa {
    private String nome;
    private int idade;
    private String cpf;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        if (!nome.isBlank()) {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        if (!cpf.isBlank()) {
            this.cpf = cpf;
        }
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0) {
            this.idade = idade;
        }
    }

}
