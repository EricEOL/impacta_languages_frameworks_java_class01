package br.edu.impacta.dynamics;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class Dynamics {

  public static double getNumber() {
    return 32;
  }

  public static void tasteDynamics() {
    System.out.println("Dynamics");
  
    var age = Integer.valueOf(32);

    var returnValue = getNumber();

    age.toString();

    var list = new ArrayList<String>() {{ add("new element"); }};

    var map = new ArrayList<Map<String, String>>() {{
      add( new LinkedHashMap<>() {{
        put("key", "value");
      }});
    }};

    var o = new Object() {
      public String name = "Eric";
      public String getName() {
        return name;
      }
    };

    System.out.println(o.name);
    System.out.println(o.getName());

  }
}
