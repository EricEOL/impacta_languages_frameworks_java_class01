package br.edu.impacta.objects;
import br.edu.impacta.objects.abstracts.Thinker;

class Person implements Thinker {
  private String name;
  private String cpf;

  public String think() {
    System.out.println("Thinking modificado...");
    return "String";
  }

  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getCpf() {
    return this.cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  @Override
  public String toString() {
    return String.format("Person: " + name + " " + cpf);
  }
}

class SmartPerson extends Person {

  @Override
  public String think() {
    System.out.println("Thinking modificado...");
    return "String";
  }
}

public class Objects {
  public static void playOO() {
    System.out.println("POO---------POO");
  
    var person = new Person();

    person.setName("Eric");
    person.setCpf("11111111100");

    System.out.println(person.toString());
    
  }
}
