public class Principal {
    public static void main(String[] args) {
        Pessoa maria;
        maria = new Pessoa("Maria dos Santos", "01234567890", 15);
        System.out.println("Nome: " + maria.getNome());
        System.out.println("Cpf: " + maria.getCpf());
        maria.setNome("Maria da Silva");
        System.out.println("Nome Corrigido: " + maria.getNome());
        // maria.idade = 15
        // System.out.println("Idade: "+(maria.idade+10));

        // Pessoa jose = new Pessoa();
        //jose.nome = "José dos Santos";
    }
}
