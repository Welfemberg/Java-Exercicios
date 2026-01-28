public class Professor extends Pessoa {

    private String disciplina;

    public Professor(String nome, int idade, String disciplina){
        super(nome, idade);
        this.disciplina = disciplina;

    }
    public void apresentar(){

        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Disciplina: " + disciplina);
        System.out.println("---------------");
    }

    public String getTipo(){
        return "Professor";
    }
}
