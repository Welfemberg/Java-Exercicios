public class Pessoa {
    private String nome;
    private int idade;
    ;

    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;


    }
    public void apresentar(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("---------------");

    }

    public String getNome(){
        return nome;
    }
    public int getIdade(){
        return idade;
    }

    public String getTipo(){
        return "Pessoa";
    }
}
