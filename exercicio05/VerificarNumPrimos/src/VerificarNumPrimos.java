import java.util.Scanner;


public class VerificarNumPrimos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

/* Um simples verificador que diz se o número é primo ou não.
Um número primo é aquele que é maior que 1 é divisível apenas por ele mesmo e por 1.
Primeiro defino que qualquer número menor ou igual a 1 não é primo. Depois garanto
que todo número dividido por 2 não é primo. A excessão é o próprio número 2, Por isso
declaro que numero == 2 é primo.  Em seguida utilizo um loop (for) que vai testando
vários divisores. Se o número informado na entrada, passar pelo (for) sem encontrar um
divisor que tenha (% o resto da divisão) = 0, ele será primo.
 */
        System.out.println("Digite um número e descubra se ele é primo:");
        int numero = entrada.nextInt();

        if (numero <= 1) {
            System.out.printf("%d Não é primo %n", numero);
        } else if (numero == 2) {
            System.out.printf("%d é primo %n", numero);
        } else if (numero % 2 == 0) {
            System.out.printf("%d Não é primo %n", numero);
        } else {
            int divisorEncontrado = 0;
            for (int i = 3; i * i <= numero; i++) {
                if (numero % i == 0) {
                    divisorEncontrado = 1;
                    break;
                }
            }

            if (divisorEncontrado == 0) {
                System.out.printf("%d é primo %n", numero);
            } else {
                System.out.printf("%d Não é primo %n", numero);
            }
        }

    }
}
