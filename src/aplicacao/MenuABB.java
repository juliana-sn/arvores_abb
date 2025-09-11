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
            System.out.println("4 - Consulta a existencia de um valor na ABB");
            System.out.println("5 - Conta a quantidade de consultas para achar um valor");
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
                case 4:
                    System.out.print("Informe o valor a ser buscado: ");
                    int numero = sc.nextInt();
                    if(abb.consulta(abb.root, numero)){
                        System.out.println("Valor encontrado");
                    }else{
                        System.out.println("Valor não está presente");
                    }
                    break;
                case 5:
                    System.out.print("Informe o valor a ser buscado: ");
                    int busca = sc.nextInt();
                    System.out.println("Quantidade de consultas " +abb.contaConsulta(abb.root, busca, 0));
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao != 0);

        sc.close();
    }
}