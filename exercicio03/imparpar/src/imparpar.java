import java.util.Scanner;

public class imparpar {
    public static void main(String[] args){
        System.out.println("Digite um número para verificar se ele é impar ou par");

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        // Utilizando o resto da divisão por 2 para definir par ou impar.
        // Números pares ao dividir por 2 temos resultado 0.
        if(numero%2==0){
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é impar");
        }

        sc.close();

    }
}
