package br.edu.impacta;

public class Types {
  public static void variaveis() {
    System.out.println("iniciando variáveis");
    String name = "This is a text";
    int idade = 80;
    //double altura = 1.78;
    double peso = 90.00;

    Integer idadeOuNulo = null;

    if (idade % 2 != 0) idade = 0;

    if(idadeOuNulo == null) idadeOuNulo = idade;

    System.out.printf("%s %d %.2f %d %n", name, idade, peso, idadeOuNulo);
  }
}
