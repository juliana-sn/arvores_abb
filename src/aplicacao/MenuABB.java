package aplicacao;

import arvores.ABBint;

import java.util.Scanner;

public class MenuABB {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcao;
        ABBint abb = new ABBint();

        do {
            System.out.println("0 - Sair");
            System.out.println("1 - Inserir 1 valor na ABB");
            System.out.println("2 - Apresentar ABB (em ordem)");
            System.out.println("3 - Conta quantidade de NOS");
            opcao =sc.nextInt();

            switch (opcao){
                case 0:
                    System.out.println("Fechando a execução");
                    break;
                case 1:
                    System.out.print("Informe o valor a ser inserido: ");
                    int valor = sc.nextInt();
                    abb.root = abb.inserir(abb.root, valor);
                    break;
                case 2:
                    System.out.println("\t Apresentação da ABB");
                    abb.show(abb.root);
                    System.out.println();
                    break;
                case 3:
                    System.out.println(abb.contaNos(abb.root, 0));
                    break;
                default:
                    System.out.println("Opção inválida");
            }


        }while(opcao != 0);

        sc.close();
    }

}
