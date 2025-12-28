import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {
        // Importando a classe Scanner para obter os valores de entrada do usuário
        Scanner entrada = new Scanner(System.in);

       //Definindo as váriaveis de entrada: nome e idade.
        System.out.println("Informe seu nome:");
        String nome = entrada.nextLine();

        System.out.println("Informe sua idade:");
        int idade = entrada.nextInt();

        // Definindo a variavel ano. Esta variável é referente ao ano em que o usuário está respondendo.
        System.out.println("Em qual ano você está respondendo este questionário?");
        int ano = entrada.nextInt();

        //Exibindo mensagem para o usuário baseada nos dados que ele informou
        System.out.printf("Olá %s! Você atualmente tem %d anos. \n", nome, idade);

        // O questionário se interessa em saber a idade do usuário em 2050, então este será o ano de interesse.
        //Em seguida ao saber quantos anos tem pela frente até o ano de 2050 podemos calcular a idade futura do usuário.

        final int ANOINTERESSE = 2050;
        int anosPelaFrente = ANOINTERESSE - ano;
        int idadeFutura = anosPelaFrente + idade;

        // Então é exibida a idade futura do usuário no ano de 2050.
        System.out.printf("Em 2050 você terá %d anos!", idadeFutura);
        entrada.close();


    }


}
