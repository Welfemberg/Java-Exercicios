import java.util.Scanner;

public class SistemaNotas {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        String[] alunos = new String[4];
        double[][] notas = new double[4][3];


        System.out.println("--- MENU ---");
        System.out.println("--- ESCOLHA UMA DAS OPÇÕES ---");
        System.out.println(" ");
        System.out.println("1 - Cadastrar Lista de Alunos e Notas ");
        System.out.println("2 - Cadastrar Apenas Lista de Notas");
        System.out.println("3 - Sair");

        int opcao = entrada.nextInt();
        entrada.nextLine();
        switch (opcao) {

            case 1:
                // Cadastro de alunos
                // Intencionalmente sem break para continuar no cadastro de notas
                for (int i = 0; i < alunos.length; i++) {
                    System.out.println("Digite o nome do " + (i + 1) + " º aluno ");
                    alunos[i] = entrada.nextLine();

                }
                System.out.println("Lista de alunos cadastradas:");
                for (int i = 0; i < alunos.length; i++){

                    System.out.println("Aluno " + (i + 1) + ": ");
                    System.out.println(alunos[i]);
                }

            case 2:

                for (int i = 0; i < notas.length; i++) {
                    System.out.println("Notas do " + (i + 1) + "º aluno: ");
                    for (int j = 0; j < notas[i].length; j++) {
                        System.out.println("Digite a nota " + (j + 1) + " do aluno " + (i + 1));
                        notas[i][j] = entrada.nextDouble();

                    }
                }

                        System.out.println("=== NOTAS POR SEMESTRE ===");

                        for (int i = 0; i < notas.length; i++) {
                            System.out.println("Aluno " + (i + 1) + ":");

                            for (int j = 0; j < notas[i].length; j++) {
                                System.out.println("Nota " + (j + 1) + ": " + notas[i][j]);

                        }
                    }
                        break;

            case 3:
                break;

            default:

                System.out.println("Opção Inválida!");

                }

                entrada.close();

        }

    }

