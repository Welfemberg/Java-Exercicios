import java.util.Scanner;

// Neste código fiz o mesmo exercicio utilizando um método String ao invés de boolean.

class ClasseM {
    public static String isPrimo(int numero){
        if(numero <= 1){
            return "não é primo";
        }else if(numero == 2){
            return "é primo";
        }else if(numero %2 == 0){
            return "não é primo";
        }
        for (int i = 3; i * i <= numero; i++){
            if(numero%i == 0){
                return "não é primo";
            }
        }
        return "é primo";
    }

}

public class ClasseMetodo{
    public static void main (String[] args){

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número e verifique se ele é primo ou não: ");
        int num = entrada.nextInt();

      // O resultado aqui não utiliza if e else. Chamo o método direto para o número que foi informado.
      // Printo o número informado + o resultado do método. A String vazia no meio serve como espaço.

      String resultado = ClasseM.isPrimo(num);
      System.out.println(num + " "+ resultado);
    }
}