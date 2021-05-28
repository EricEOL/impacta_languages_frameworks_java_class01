package br.edu.impacta;

public class Controls {

  private static final String NAME = "name";

  public static void swichAndMore() {
    String selection = "name";

    switch (selection) {
      case NAME: 
        System.out.println("name matched!");
        break;
        
      case "Something":
        System.out.println("something...");
        break;

      default:
        System.out.println("default fallback");
        break;
    }
  }
}
