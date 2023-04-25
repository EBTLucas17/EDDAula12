
package com.mycompany.aula12;

import java.util.ArrayList;

public class Aula12 {
 public static void main(String[] args) {
    int numeroDePessoas = 20; 
    int intervalo = 3; // 
    ArrayList<Integer> people = new ArrayList<Integer>();
    for (int i = 1; i <= numeroDePessoas; i++) {
      people.add(i);
    }
    int indicador = 0;
    while (people.size() > 1) {
      indicador = (indicador + intervalo - 1) % people.size();
      System.out.println("Eliminando a pessoa de número " + people.get(indicador));
      people.remove(indicador);
    }
    System.out.println("A pessoa sobrevivente é a de número " + people.get(0));
  }

}
