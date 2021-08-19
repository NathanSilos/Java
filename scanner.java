import java.util.Scanner;

class Main {
  public static void main(String[] args) {
  Scanner leitor = new Scanner(System.in);

  System.out.println("1 - Cadastro");
  System.out.println("2 - Mostrar");
  System.out.println("3 - Alterar");
  System.out.println("4 - Excluir");
  System.out.print("Opção: ");

  int op = leitor.nextInt();

  switch(op){
    case 1:
      System.out.println("Cadastrado!");
      break;
    case 2:
      System.out.println("Mostrando...");
      break;
    case 3:
      System.out.println("Alterado Cadastro :D");
      break;
    case 4:
      System.out.println("Excluído.");
      break;
    default:
      System.out.println("Opção Inválida.");
      break;
  }
  }
}