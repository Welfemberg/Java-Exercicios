import java.util.Scanner;


public class NumPrimosMetodo{
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);

            System.out.println("Digite um numero para verficar se ele é primo ou não: ");
            int num = input.nextInt();

        /* Utilizei if e else para chamar o método e mostrar uma mensagem de acordo com o restultado.
        Posso colocar barras de comentário ao lado do if - else e utilizar a forma de booleano
        para o resultado mais na frente.*/

            if(VerficarPrimos.isPrimo(num)){
                System.out.println(num + " é primo");
            }else{
                System.out.println(num + " não é primo");
            }

        // Posso mostrar o resultado apenas em booleano. Só tirar as barras de comentário.

        //   boolean resultado = VerficarPrimos.isPrimo(num);
        //   System.out.println(resultado);
        }
}

