import java.io.*;

public class Colorir {

  public void colorirGrafo (String arg) throws FileNotFoundException {

    Grafo grafo = new Grafo(arg);

    int[] resultado = new int[grafo.numeroDeVertices];
    boolean[] corDisponivel = new boolean[grafo.numeroDeVertices];

    for (int i = 0; i < resultado.length; i++) {
      resultado[i] = -1;
      corDisponivel[i] = true;
    }

    for (int i = 0; i < resultado.length; i++) {
      System.out.println("Vértice " + i + " cor " + resultado[i]);
    }

  }

}
