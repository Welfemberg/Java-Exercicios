import java.util.Scanner;

public class ClassificarIdade {
    public static void main(String[] args){
        System.out.println("Digite sua idade:");

        Scanner entrada = new Scanner(System.in);
        int idade = entrada.nextInt();

        //Classificação de acordo com a idade.
        if(idade >=0 && idade <=12){
            System.out.println("Classificação: Criança");
        }else if (idade <=17){
            System.out.println("Classificação: Adolescente");
        }else if (idade >=18 && idade <=59){
            System.out.println("Classificação: Adulto");
        }else {
            System.out.println("Classificação: Idoso");
        }

        entrada.close();

    }

}
