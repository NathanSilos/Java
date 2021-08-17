class Main {
  public static void main(String[] args) {
    
    double salario = 5100;

    if (salario < 3500){
      salario += 500;
    }
    else if ((salario >= 3500) && (salario < 5000)){
      salario += 650;
    }
    else {
      salario += 800;
    }

    System.out.println(salario);
  }
}
