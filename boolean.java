class Main {
  public static void main(String[] args) {
    
    int value1 = 10;
    int value2 = 5;

    boolean rest1 = value1 > value2;

    boolean rest2 = value1 < value2;

    boolean rest3 = value1 == value2;

    boolean rest4 = value1 != value2; 

    // AND
    boolean rest5 = (value1 != value2) && (value1 > value2);
    
    // OU
    boolean rest6 = (value1 != value2) || (value1 < value2);

    
    System.out.println(rest1);
    System.out.println(rest2);
    System.out.println(rest3);
    System.out.println(rest4);
    System.out.println(rest5);
    System.out.println(rest6);
  }
}