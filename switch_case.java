class Main {
  public static void main(String[] args) {
    
    char estado_civil = 'S';

   switch(estado_civil){
    case 'C':
      System.out.println("Casado");
      break;
    case 'S':
      System.out.println("Solteiro");
      break;
    case 'V':
      System.out.println("Viúvo");
      break;
    case 'D':
      System.out.println("Divorciado");
      break;
    default:
      System.out.println("OPÇÃO INVÁLIDA!");
      break;
    }
  }
}