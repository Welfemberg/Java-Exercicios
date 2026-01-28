public class Aluno extends Pessoa{

    private double media;

    public Aluno(String nome, int idade, double media){
        super(nome, idade);
        this.media = media;

    }
    public boolean aprovado(){
        return media >= 7;
    }

    public void apresentar(){

        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Media: " + media);
        System.out.println("Situação: " + (aprovado()? "Aprovado" : "Reprovado"));
        System.out.println("---------------");
    }

    public String getTipo(){
        return "Aluno";
    }
}
